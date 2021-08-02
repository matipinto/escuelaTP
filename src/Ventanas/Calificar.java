
package Ventanas;

import SQL.ConsultasVarias;
import SQL.ConsultasAlumnos;
import SQL.ConsultasCalificaciones;
import escuela.Curso;
import java.util.ArrayList;
import escuela.Materia;
import escuela.Alumno;
import escuela.Calificacion;
import javax.swing.JOptionPane;


public class Calificar extends javax.swing.JFrame {

    public static ConsultasVarias consultasVarias = new ConsultasVarias();
    public static ConsultasAlumnos consultasAlu = new ConsultasAlumnos();
    public static ConsultasCalificaciones consultasCali = new ConsultasCalificaciones();
    ArrayList<Alumno> Alumnos = new ArrayList();
    ArrayList<Materia> Materias = new ArrayList();
    private int elalumno_id;

    public Calificar() {
        initComponents();
        inicializarCampos();
        combo_curso.removeAllItems();        
        ArrayList<Curso> Cursos = consultasVarias.traerCursos();
        for (int i = 0; i < Cursos.size(); i++) {
            combo_curso.addItem(Cursos.get(i).getCurso_desc());
        }                
        combo_materia.removeAllItems();        
        Materias = consultasVarias.traerMaterias();
        for (int i = 0; i < Materias.size(); i++) {
            combo_materia.addItem(Materias.get(i).getMateria_desc());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        combo_curso = new javax.swing.JComboBox<>();
        combo_alumno = new javax.swing.JComboBox<>();
        combo_trimestre = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscarAlumno = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        label_dni = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        label_direccion = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        label_matricula = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        label_estado = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        combo_materia = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        combo_cali = new javax.swing.JComboBox<>();
        btnBuscarCurso = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Buscar Alumno");

        combo_curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_cursoActionPerformed(evt);
            }
        });

        combo_alumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_trimestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Trimestre", "Segundo Trimestre", "Tercer Trimestre", " " }));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione Curso");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seleccione Alumno");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Seleccione Trimestre:");

        btnBuscarAlumno.setText("Buscar");
        btnBuscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlumnoActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre del Alumno:");

        jLabel7.setText("Apellido del alumno:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Nro. Documento:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Direccion:");

        jLabel15.setText("Matricula:");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Estado:");

        jLabel19.setText("Calificar Alumno");

        jLabel20.setText("Seleccione Materia:");

        combo_materia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel21.setText("Poner Calificacion:");

        btnGuardar.setText("Guardar Nota");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        combo_cali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        btnBuscarCurso.setText("Seleccionar curso");
        btnBuscarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCursoActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel20)
                                    .addComponent(btnLimpiar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(label_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                                    .addComponent(label_matricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(66, 66, 66)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(204, 204, 204)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(label_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                            .addComponent(label_dni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel19)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(combo_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel21)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(combo_cali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnGuardar)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(combo_trimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(20, 20, 20)
                                .addComponent(label_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(combo_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combo_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscarCurso)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarAlumno)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(combo_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarAlumno))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(label_dni)
                    .addComponent(label_nombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(label_apellido)
                    .addComponent(jLabel13)
                    .addComponent(label_direccion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(label_matricula)
                    .addComponent(jLabel17)
                    .addComponent(label_estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(combo_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(combo_trimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(btnGuardar)
                    .addComponent(combo_cali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(32, 32, 32))
        );

        btnBuscarAlumno.getAccessibleContext().setAccessibleName("btnBuscar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCursoActionPerformed
        combo_alumno.setEnabled(true);
        btnBuscarAlumno.setEnabled(true);

        int elCursoId = combo_curso.getSelectedIndex() + 1;
        ArrayList<Alumno> losalumnos = consultasAlu.traerAlumnos(elCursoId);
        Alumnos = losalumnos;
        combo_alumno.removeAllItems();
        for (int i = 0; i < losalumnos.size(); i++) {
            combo_alumno.addItem(losalumnos.get(i).getNombre() + " " + losalumnos.get(i).getApellido());
        }
    }//GEN-LAST:event_btnBuscarCursoActionPerformed

    private void btnBuscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlumnoActionPerformed
        combo_materia.setEnabled(true);
        combo_trimestre.setEnabled(true);
        combo_cali.setEnabled(true);
        btnGuardar.setEnabled(true);

        int index_alu = combo_alumno.getSelectedIndex();
        for (int i = 0; i < Alumnos.size(); i++) {
            if (index_alu == i) {
                elalumno_id = Alumnos.get(i).getAlumno_id();
                label_nombre.setText(Alumnos.get(i).getNombre());
                label_apellido.setText(Alumnos.get(i).getApellido());
                label_dni.setText(Alumnos.get(i).getDni());
                int matricula = Alumnos.get(i).getMatricula();
                String matri = String.valueOf(matricula);
                label_matricula.setText(matri);
                label_direccion.setText(Alumnos.get(i).getDireccion());
                boolean estado = Alumnos.get(i).getEstado();
                if (estado) {
                    label_estado.setText("Activo");
                } else {
                    label_estado.setText("Inactivo");
                }
            }
        }
    }//GEN-LAST:event_btnBuscarAlumnoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        inicializarCampos();

    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void inicializarCampos() {        
        combo_alumno.removeAllItems();
        label_nombre.setText("");
        label_apellido.setText("");
        label_dni.setText("");
        label_matricula.setText("");
        label_direccion.setText("");
        label_estado.setText("");

        combo_materia.setEnabled(false);
        combo_trimestre.setEnabled(false);
        combo_cali.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnBuscarAlumno.setEnabled(false);
        combo_alumno.setEnabled(false);
        combo_curso.setSelectedIndex(0);
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Calificacion cali = new Calificacion();
        int index_materia = combo_materia.getSelectedIndex();
        
        int materia_id = 0;
        for (int i = 0; i < Materias.size(); i++) {
            if (index_materia == i) {
                materia_id = Materias.get(i).getMateria_id();
                break;
            }
        }
        int nota = Integer.parseInt((String) combo_cali.getSelectedItem());
        int trimestre = 1;

        switch (combo_trimestre.getSelectedIndex()) {
            case (0):
                trimestre = 1;
                break;
            case (1):
                trimestre = 2;
                break;
            case (2):
                trimestre = 3;
                break;
        }
        
        Alumno a = new Alumno();
        Materia m = new Materia();
        a.setAlumno_id(elalumno_id);
        m.setMateria_id(materia_id);
        cali.setCali_alumno(a);
        cali.setCali_materia(m);
        cali.setNota(nota);
        cali.setTrimestre(trimestre);
        
        boolean existe = consultasCali.existeCalificacion(cali);
        if (!existe) {
            consultasCali.guardarCalificacion(cali);
            inicializarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "El alumno ya fue calificado para este trimestre en esta materia.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void combo_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_cursoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarAlumno;
    private javax.swing.JButton btnBuscarCurso;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> combo_alumno;
    private javax.swing.JComboBox<String> combo_cali;
    private javax.swing.JComboBox<String> combo_curso;
    private javax.swing.JComboBox<String> combo_materia;
    private javax.swing.JComboBox<String> combo_trimestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_direccion;
    private javax.swing.JLabel label_dni;
    private javax.swing.JLabel label_estado;
    private javax.swing.JLabel label_matricula;
    private javax.swing.JLabel label_nombre;
    // End of variables declaration//GEN-END:variables

}
