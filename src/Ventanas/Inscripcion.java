
package Ventanas;

import javax.swing.JOptionPane;
import SQL.ConsultasVarias;
import SQL.ConsultasAlumnos;
import java.util.ArrayList;
import escuela.Curso;
import escuela.Alumno;
import escuela.Alucurso;


public class Inscripcion extends javax.swing.JFrame {

    public static ConsultasVarias consultasVarias = new ConsultasVarias();
    public static ConsultasAlumnos consultasAlu = new ConsultasAlumnos();

    public Inscripcion() {
        initComponents();
        combo_curso.removeAllItems();        

        ArrayList<Curso> Cursos = consultasVarias.traerCursos();

        for (int i = 0; i < Cursos.size(); i++) {
            combo_curso.addItem(Cursos.get(i).getCurso_desc());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campo_ape = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campo_dni = new javax.swing.JTextField();
        campo_direc = new javax.swing.JTextField();
        campo_tel = new javax.swing.JTextField();
        campo_matricula = new javax.swing.JTextField();
        jButton_guardar = new javax.swing.JButton();
        jButton_limpiar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        combo_curso = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Inscripciones Alumnos");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nro. Documento:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Direccion:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefono:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Matricula:");

        jButton_guardar.setText("Guardar");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });

        jButton_limpiar.setText("Limpiar");
        jButton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiarActionPerformed(evt);
            }
        });

        jButton_cancelar.setText("Cancelar");
        jButton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelarActionPerformed(evt);
            }
        });

        jLabel7.setText("Curso:");

        combo_curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_cursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_cancelar)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campo_ape)
                        .addComponent(campo_dni)
                        .addComponent(campo_direc)
                        .addComponent(campo_tel)
                        .addComponent(campo_nombre)
                        .addComponent(campo_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combo_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campo_direc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campo_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campo_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combo_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_guardar)
                    .addComponent(jButton_limpiar)
                    .addComponent(jButton_cancelar))
                .addGap(28, 28, 28))
        );

        jButton_guardar.getAccessibleContext().setAccessibleName("btnGuardar");
        jButton_limpiar.getAccessibleContext().setAccessibleName("btnLimpiar");
        jButton_cancelar.getAccessibleContext().setAccessibleName("btnCancelar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        Boolean existe = consultasAlu.existeAlumno(campo_dni.getText());

        if (!existe) {
            generarInscripcion();
        } else {
            JOptionPane.showMessageDialog(null, "El alumno ya existe.");
        }        
        
    }//GEN-LAST:event_jButton_guardarActionPerformed

    public void generarInscripcion() {
        Boolean estado = true;
        int matricula = Integer.parseInt(campo_matricula.getText());
        
        Alumno a = new Alumno();
        a.setNombre(campo_nombre.getText());
        a.setApellido(campo_ape.getText());
        a.setDni(campo_dni.getText());
        a.setDireccion(campo_direc.getText());
        a.setTelefono(campo_tel.getText());
        a.setMatricula(matricula);
        a.setEstado(estado);
        consultasAlu.guardar_alumno(a);
        a = consultasAlu.TraerAlumno(a);
        Curso c = new Curso();
        c.setCurso_id(combo_curso.getSelectedIndex() + 1);
        Alucurso ac = new Alucurso(c, a);
        consultasVarias.GuardarAlucurso(ac);
        this.dispose();
    }
    
    private void jButton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiarActionPerformed


    }//GEN-LAST:event_jButton_limpiarActionPerformed

    private void jButton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_ape;
    private javax.swing.JTextField campo_direc;
    private javax.swing.JTextField campo_dni;
    private javax.swing.JTextField campo_matricula;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_tel;
    private javax.swing.JComboBox<String> combo_curso;
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JButton jButton_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
