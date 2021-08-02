package Ventanas;

import SQL.ConsultasVarias;
import SQL.ConsultasAlumnos;
import SQL.ConsultasCalificaciones;
import escuela.Alumno;
import escuela.Curso;
import escuela.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import escuela.Calificacion;

public class ModificarCalificacion extends javax.swing.JFrame {
    public static ConsultasVarias consultasVarias = new ConsultasVarias();
    public static ConsultasAlumnos consultasAlu = new ConsultasAlumnos();
    public static ConsultasCalificaciones consultasCali = new ConsultasCalificaciones();
    
    int notaAnterior;
    ArrayList<Alumno> Alumnos = new ArrayList();
    ArrayList<Materia> Materias = new ArrayList();

    public ModificarCalificacion() {
        initComponents();
        comboCurso.removeAllItems();
        ArrayList<Curso> Cursos = consultasVarias.traerCursos();

        for (int i = 0; i < Cursos.size(); i++) {
            comboCurso.addItem(Cursos.get(i).getCurso_desc());
        }
        comboMateria.removeAllItems();
        Materias = consultasVarias.traerMaterias();
        for (int i = 0; i < Materias.size(); i++) {
            comboMateria.addItem(Materias.get(i).getMateria_desc());
        }
        inicializarCampos();
    }
    private void inicializarCampos(){
        comboAlumno.removeAllItems();
        comboAlumno.addItem("Seleccione");
        comboAlumno.setEnabled(false);
        combo_trimestre.setEnabled(false);
        btnCali.setEnabled(false);
        comboMateria.setEnabled(false);
        txtCali.setEnabled(false);
        btnModi.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    private void traerCalificacion() {
        Calificacion cal = new Calificacion();
        Alumno a = new Alumno();
        Materia m = new Materia();
        int x = comboAlumno.getSelectedIndex();
        a.setAlumno_id(Alumnos.get(x).getAlumno_id());
        x = comboMateria.getSelectedIndex();
        m.setMateria_id(Materias.get(x).getMateria_id());
        int trimestre = combo_trimestre.getSelectedIndex() + 1;
        cal.setCali_alumno(a);
        cal.setCali_materia(m);
        cal.setTrimestre(trimestre);

        int nota = consultasCali.TraerCalificaion(cal);
        if (nota > 0) {
            String cali = String.valueOf(nota);
            txtCali.setText(cali);
            notaAnterior = nota;
            txtCali.setEnabled(true);
            btnModi.setEnabled(true);
            btnEliminar.setEnabled(true);
        } else {
            notaAnterior = 0;
            txtCali.setText("");
            txtCali.setEnabled(false);
            btnModi.setEnabled(false);
            btnEliminar.setEnabled(false);
            JOptionPane.showMessageDialog(null, "El alumno no fue calificado en esta materia en este trimestre.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboCurso = new javax.swing.JComboBox<>();
        comboAlumno = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTraerAlu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboMateria = new javax.swing.JComboBox<>();
        btnCali = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCali = new javax.swing.JTextField();
        btnModi = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        combo_trimestre = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        comboCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("seleccione curso");

        jLabel2.setText("seleccione alumno");

        jLabel3.setText("Modificar Calificacion");

        btnTraerAlu.setText("Traer Alumnos");
        btnTraerAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraerAluActionPerformed(evt);
            }
        });

        jLabel4.setText("seleccione Materia");

        comboMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCali.setText("Obtener Calificacion");
        btnCali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaliActionPerformed(evt);
            }
        });

        jLabel5.setText("Calificacion:");

        btnModi.setText("Modifcar Calificacion");
        btnModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Calificacion");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel6.setText("seleccione Trimestre");

        combo_trimestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Trimestre", "Segundo Trimestre", "Tercer Trimestre" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(6, 6, 6)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(comboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel6))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(btnModi))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(btnTraerAlu)
                                    .addComponent(combo_trimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCali))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCali, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnTraerAlu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnCali, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_trimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModi)
                    .addComponent(btnEliminar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTraerAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraerAluActionPerformed
        comboAlumno.setEnabled(true);
        combo_trimestre.setEnabled(true);
        btnCali.setEnabled(true);
        comboMateria.setEnabled(true);
        
        int elCursoId = comboCurso.getSelectedIndex() + 1;
        Alumnos = consultasAlu.traerAlumnos(elCursoId);        
        comboAlumno.removeAllItems();
        for (int i = 0; i < Alumnos.size(); i++) {
            comboAlumno.addItem(Alumnos.get(i).getNombre() + " " + Alumnos.get(i).getApellido());
        }
    }//GEN-LAST:event_btnTraerAluActionPerformed

    private void btnCaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaliActionPerformed
        try{
            traerCalificacion();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No selecciono ningun alumno");
        }        
    }//GEN-LAST:event_btnCaliActionPerformed

    private void btnModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiActionPerformed
        Calificacion cal = new Calificacion();
        Alumno a = new Alumno();
        Materia m = new Materia();
        int nota = Integer.parseInt(txtCali.getText());
        if (nota > 0 && nota < 11) {
            int x = comboAlumno.getSelectedIndex();

            a.setAlumno_id(Alumnos.get(x).getAlumno_id());

            x = comboMateria.getSelectedIndex();
            m.setMateria_id(Materias.get(x).getMateria_id());
            int trimestre = combo_trimestre.getSelectedIndex() + 1;
            cal.setCali_alumno(a);
            cal.setCali_materia(m);
            cal.setTrimestre(trimestre);
            cal.setNota(nota);
            consultasCali.modificar_Cali(cal);
            JOptionPane.showMessageDialog(null, "Calificacion modificada, nota anterior: " + notaAnterior + " Nueva nota: " + nota);
            notaAnterior = nota;
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un numero que este entre el 1 y el 10");
        }
    }//GEN-LAST:event_btnModiActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Alumno a = new Alumno();
        Materia m = new Materia();
        
        int x = comboMateria.getSelectedIndex();
        m.setMateria_id(Materias.get(x).getMateria_id());
        
        x = comboAlumno.getSelectedIndex();
        a.setAlumno_id(Alumnos.get(x).getAlumno_id());
        
        int trimestre= combo_trimestre.getSelectedIndex() + 1;
        Calificacion cali = new Calificacion();                
        cali.setCali_alumno(a);
        cali.setCali_materia(m);
        cali.setTrimestre(trimestre);        
        consultasCali.eliminar_Cali(cali);
    }//GEN-LAST:event_btnEliminarActionPerformed


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
            java.util.logging.Logger.getLogger(ModificarCalificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCalificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCalificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCalificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarCalificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCali;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModi;
    private javax.swing.JButton btnTraerAlu;
    private javax.swing.JComboBox<String> comboAlumno;
    private javax.swing.JComboBox<String> comboCurso;
    private javax.swing.JComboBox<String> comboMateria;
    private javax.swing.JComboBox<String> combo_trimestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCali;
    // End of variables declaration//GEN-END:variables
}
