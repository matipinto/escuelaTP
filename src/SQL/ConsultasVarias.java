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
import escuela.Curso;
import escuela.Materia;
import escuela.Alucurso;

public class ConsultasVarias {
    
    private static Connection conexion;
    private static PreparedStatement sentencia_preparada;
    private static ResultSet resultado;    

    public ArrayList traerCursos() {
        ArrayList r = new ArrayList();
        try {

            conexion = conexionEscuela.conectar();
            String consulta = "SELECT * FROM curso";
            sentencia_preparada = conexion.prepareStatement(consulta);

            resultado = sentencia_preparada.executeQuery();

            while (resultado.next()) {
                Curso cur = new Curso();
                cur.setCurso_id(resultado.getInt(1));
                cur.setCurso_desc(resultado.getString(2));
                r.add(cur);
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

    public ArrayList traerMaterias() {
        ArrayList r = new ArrayList();
        try {

            conexion = conexionEscuela.conectar();
            String consulta = "SELECT * FROM materia";
            sentencia_preparada = conexion.prepareStatement(consulta);
            resultado = sentencia_preparada.executeQuery();

            while (resultado.next()) {
                Materia mat = new Materia();
                mat.setMateria_id(resultado.getInt(1));
                mat.setMateria_desc(resultado.getString(2));
                r.add(mat);

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
    
    

    public void GuardarAlucurso(Alucurso ac) {
        try {
            Alumno a = ac.getAl_alumno();
            int id_Alumno = a.getAlumno_id();
            Curso c = ac.getAl_curso();
            int id_Curso = c.getCurso_id();
            conexion = conexionEscuela.conectar();
            String consulta = "INSERT INTO alucurso (curso_id, alumno_id) VALUES (?,?)";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setInt(2, id_Alumno);
            sentencia_preparada.setInt(1, id_Curso);

            int i = sentencia_preparada.executeUpdate();

            if (i > 0) {
                //JOptionPane.showMessageDialog(null, "Datos guardados en la BD");
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
}
