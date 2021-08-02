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
import escuela.Materia;
import escuela.Calificacion;

public class ConsultasCalificaciones {

    private static Connection conexion;
    private static PreparedStatement sentencia_preparada;
    private static ResultSet resultado;

    public void guardarCalificacion(Calificacion cali) {

        try {
            Materia mat = cali.getCali_materia();
            int nota = cali.getNota();
            int trimestre = cali.getTrimestre();
            Alumno Alu = cali.getCali_alumno();

            conexion = conexionEscuela.conectar();
            String consulta = "INSERT INTO calificacion (materia_id, nota, alumno_id, trimestre) VALUES (?,?,?,?)";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setInt(3, Alu.getAlumno_id());
            sentencia_preparada.setInt(1, mat.getMateria_id());
            sentencia_preparada.setInt(2, nota);
            sentencia_preparada.setInt(4, trimestre);

            int i = sentencia_preparada.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos guardados en la BD");
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

    public boolean existeCalificacion(Calificacion cali) {
        boolean existe = false;
        try {

            Materia mat = cali.getCali_materia();
            int trimestre = cali.getTrimestre();
            Alumno Alu = cali.getCali_alumno();

            conexion = conexionEscuela.conectar();
            String consulta = "SELECT * FROM calificacion WHERE alumno_id = ? and materia_id = ? and trimestre = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setInt(1, Alu.getAlumno_id());
            sentencia_preparada.setInt(2, mat.getMateria_id());
            sentencia_preparada.setInt(3, trimestre);
            resultado = sentencia_preparada.executeQuery();
            while (resultado.next()) {
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

    public ArrayList TraerCalificacionesTrimestres(Calificacion cal) {
        ArrayList r = new ArrayList();
        Alumno a = new Alumno();
        Materia m = new Materia();
        a = cal.getCali_alumno();
        m = cal.getCali_materia();
        int materia_id = m.getMateria_id();
        int alumno_id = a.getAlumno_id();

        try {
            conexion = conexionEscuela.conectar();
            String consulta = "SELECT * FROM calificacion WHERE materia_id = ? and alumno_id = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setInt(1, materia_id);
            sentencia_preparada.setInt(2, alumno_id);
            resultado = sentencia_preparada.executeQuery();
            while (resultado.next()) {
                Materia mat = new Materia();
                Alumno alu = new Alumno();
                Calificacion cali = new Calificacion();
                mat.setMateria_id(resultado.getInt(2));
                alu.setAlumno_id(resultado.getInt(4));
                cali.setCali_alumno(alu);
                cali.setCali_materia(mat);
                cali.setNota(resultado.getInt(3));
                cali.setTrimestre(resultado.getInt(5));
                r.add(cali);
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
        return r;
    }

    public int TraerCalificaion(Calificacion cal) {
        int r = 0;

        try {
            Alumno a = new Alumno();
            Materia m = new Materia();
            a = cal.getCali_alumno();
            m = cal.getCali_materia();
            int materia_id = m.getMateria_id();
            int alumno_id = a.getAlumno_id();
            int trimestre = cal.getTrimestre();
            conexion = conexionEscuela.conectar();
            String consulta = "SELECT nota FROM calificacion WHERE materia_id = ? and alumno_id = ? and trimestre=?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setInt(1, materia_id);
            sentencia_preparada.setInt(2, alumno_id);
            sentencia_preparada.setInt(3, trimestre);
            resultado = sentencia_preparada.executeQuery();
            while (resultado.next()) {
                r = resultado.getInt(1);
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
        return r;
    }

    public void modificar_Cali(Calificacion cali) {
        try {
            Alumno a = new Alumno();
            Materia m = new Materia();

            a = cali.getCali_alumno();
            m = cali.getCali_materia();
            int materia_id = m.getMateria_id();
            int alumno_id = a.getAlumno_id();
            int trimestre = cali.getTrimestre();
            int nota = cali.getNota();
            conexion = conexionEscuela.conectar();
            String consulta = "UPDATE calificacion SET nota = ? WHERE trimestre = ? and materia_id = ? and alumno_id = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setInt(1, nota);
            sentencia_preparada.setInt(2, trimestre);
            sentencia_preparada.setInt(3, materia_id);
            sentencia_preparada.setInt(4, alumno_id);

            int i = sentencia_preparada.executeUpdate();

            if (i > 0) {

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

    public void eliminar_Cali(Calificacion cali) {
        try {

            Alumno a = new Alumno();
            Materia m = new Materia();

            a = cali.getCali_alumno();
            m = cali.getCali_materia();
            int materia_id = m.getMateria_id();
            int alumno_id = a.getAlumno_id();
            int trimestre = cali.getTrimestre();

            conexion = conexionEscuela.conectar();
            String consulta = "DELETE from calificacion  WHERE trimestre = ? and materia_id = ? and alumno_id = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);

            sentencia_preparada.setInt(1, trimestre);
            sentencia_preparada.setInt(2, materia_id);
            sentencia_preparada.setInt(3, alumno_id);

            int i = sentencia_preparada.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE ELIMINARON LOS DATOS");
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
}
