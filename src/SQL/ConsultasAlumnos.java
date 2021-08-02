package SQL;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import escuela.Alumno;

public class ConsultasAlumnos {

    private static Connection conexion;
    private static PreparedStatement sentencia_preparada;
    private static ResultSet resultado;

    public Boolean existeAlumno(String dni) {
        Boolean existe = false;

        try {
            conexion = conexionEscuela.conectar();
            String consulta = "SELECT NroDoc FROM alumno WHERE NroDoc = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, dni);
            resultado = sentencia_preparada.executeQuery();

            if (resultado.next()) {
                existe = true;
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasVarias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return existe;
    }

    public void guardar_alumno(Alumno a) {
        try {
            String nombre = a.getNombre();
            String apellido = a.getApellido();
            String NroDoc = a.getDni();
            String direccion = a.getDireccion();
            String telefono = a.getTelefono();
            Integer matricula = a.getMatricula();
            boolean Estado = a.getEstado();
            conexion = conexionEscuela.conectar();
            String consulta = "INSERT INTO alumno (Nombre,Apellido,NroDoc,Direccion,Telefono,Matricula,Estado) VALUES (?,?,?,?,?,?,?)";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellido);
            sentencia_preparada.setString(3, NroDoc);
            sentencia_preparada.setString(4, direccion);
            sentencia_preparada.setString(5, telefono);
            sentencia_preparada.setInt(6, matricula);
            sentencia_preparada.setBoolean(7, Estado);
            int i = sentencia_preparada.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "El alumno ha sido cargado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar datos");
            }
            conexion.close();

        } catch (HeadlessException | SQLException e) {
            System.out.println("Error :" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error :" + e);
            }
        }
    }

    public Alumno TraerAlumno(Alumno a) {
        String NroDocumento = a.getDni();

        try {
            conexion = conexionEscuela.conectar();
            String consulta = "SELECT * FROM alumno WHERE nrodoc = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, NroDocumento);
            resultado = sentencia_preparada.executeQuery();
            while (resultado.next()) {
                a.setAlumno_id(resultado.getInt(1));
                a.setNombre(resultado.getString(2));
                a.setApellido(resultado.getString(3));
                a.setDni(resultado.getString(4));
                a.setDireccion(resultado.getString(5));
                a.setTelefono(resultado.getString(6));
                a.setMatricula(resultado.getInt(7));
                a.setEstado(resultado.getBoolean(8));
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasVarias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return a;
    }

    public void modificar_Alumno(Alumno alu) {
        try {
            String nombre = alu.getNombre();
            String apellido = alu.getApellido();
            String NroDoc = alu.getDni();
            String direccion = alu.getDireccion();
            String telefono = alu.getTelefono();
            int matricula = alu.getMatricula();
            Boolean estado = alu.getEstado();

            conexion = conexionEscuela.conectar();
            String consulta = "UPDATE alumno SET nombre = ?, apellido = ?, direccion = ?, telefono = ?, matricula = ?, estado = ? WHERE NroDoc = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellido);
            sentencia_preparada.setString(3, direccion);
            sentencia_preparada.setString(4, telefono);
            sentencia_preparada.setInt(5, matricula);
            sentencia_preparada.setBoolean(6, estado);
            sentencia_preparada.setString(7, NroDoc);

            int i = sentencia_preparada.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "DATOS MODIFICADOS");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE MODIFICARON LOS DATOS");
            }

            conexion.close();

        } catch (SQLException e) {
            System.out.println("ERROR" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("ERROR " + e);
            }
        }
    }

    public ArrayList traerAlumnos(int curso_id) {
        ArrayList alu = new ArrayList();
        try {
            conexion = conexionEscuela.conectar();
            String consulta = "SELECT * FROM alumno JOIN alucurso ON alumno.id_alumno = alucurso.alumno_id WHERE alucurso.curso_id = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setInt(1, curso_id);
            resultado = sentencia_preparada.executeQuery();

            while (resultado.next()) {
                Alumno a = new Alumno();
                a.setAlumno_id(resultado.getInt(1));
                a.setNombre(resultado.getString(2));
                a.setApellido(resultado.getString(3));
                a.setDni(resultado.getString(4));
                a.setDireccion(resultado.getString(5));
                a.setTelefono(resultado.getString(6));
                a.setMatricula(resultado.getInt(7));
                a.setEstado(resultado.getBoolean(8));
                alu.add(a);
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasVarias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return alu;
    }
}
