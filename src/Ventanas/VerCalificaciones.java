package Ventanas;

import escuela.Alumno;
import escuela.Curso;
import escuela.Materia;

import java.util.ArrayList;
import escuela.Calificacion;
import javax.swing.table.DefaultTableModel;
import SQL.ConsultasVarias;
import SQL.ConsultasAlumnos;
import SQL.ConsultasCalificaciones;

public class VerCalificaciones extends javax.swing.JFrame {

    public static ConsultasVarias consultasVarias = new ConsultasVarias();
    public static ConsultasAlumnos consultasAlu = new ConsultasAlumnos();
    public static ConsultasCalificaciones consultasCali = new ConsultasCalificaciones();


    ArrayList<Alumno> Alumnos = new ArrayList();
    ArrayList<Materia> Materias = new ArrayList();

    public VerCalificaciones() {
        initComponents();

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combo_materia = new javax.swing.JComboBox<>();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cali = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione Curso:");

        combo_curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Ver Calificaciones");

        jLabel3.setText("Seleccione materia:");

        combo_materia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnMostrar.setText("Mostrar Datos");
        btnMostrar.setName("btnMostrar"); // NOI18N
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        tabla_cali.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alumno", "1° Trimestre", "2° Trimestre", "3° Trimestre", "Promedio Anual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_cali.setName("tabla_cali"); // NOI18N
        jScrollPane1.setViewportView(tabla_cali);
        if (tabla_cali.getColumnModel().getColumnCount() > 0) {
            tabla_cali.getColumnModel().getColumn(0).setResizable(false);
            tabla_cali.getColumnModel().getColumn(1).setResizable(false);
            tabla_cali.getColumnModel().getColumn(2).setResizable(false);
            tabla_cali.getColumnModel().getColumn(3).setResizable(false);
            tabla_cali.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel4.setText("Materia Seleccionada:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_materia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnMostrar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(combo_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(combo_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMostrar)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void eliminar() {
        DefaultTableModel tb = (DefaultTableModel) tabla_cali.getModel();
        int a = tabla_cali.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        eliminar();
        int CursoId = combo_curso.getSelectedIndex() + 1;
        int index_materia = combo_materia.getSelectedIndex();
        int materia_id = 1;
        

        for (int i = 0; i < Materias.size(); i++) {
            if (index_materia == i) {
                materia_id = Materias.get(i).getMateria_id();
            }
        }

        Alumnos = consultasAlu.traerAlumnos(CursoId);

        DefaultTableModel model = (DefaultTableModel) tabla_cali.getModel();
        Object rowData[] = new Object[5];

        for (int i = 0; i < Alumnos.size(); i++) {
            int notat1 = 0;
            int notat2 = 0;
            int notat3 = 0;

            Calificacion cali = new Calificacion();
            Alumno a = new Alumno();
            a.setAlumno_id(Alumnos.get(i).getAlumno_id());

            Materia m = new Materia();
            m.setMateria_id(materia_id);

            cali.setCali_alumno(a);
            cali.setCali_materia(m);

            ArrayList<Calificacion> grupocalificacion = consultasCali.TraerCalificacionesTrimestres(cali);

            for (int y = 0; y < grupocalificacion.size(); y++) {

                switch (grupocalificacion.get(y).getTrimestre()) {
                    case (1):
                        notat1 = grupocalificacion.get(y).getNota();
                        break;
                    case (2):
                        notat2 = grupocalificacion.get(y).getNota();
                        break;
                    case (3):
                        notat3 = grupocalificacion.get(y).getNota();
                        break;
                }
            }
            rowData[0] = Alumnos.get(i).getNombre() + " " + Alumnos.get(i).getApellido();
            rowData[1] = notat1;
            rowData[2] = notat2;
            rowData[3] = notat3;
            if (notat1 > 0 & notat2 > 0 & notat3 > 0) {
                int suma = notat1 + notat2 + notat3;
                double promedio = suma / 3;
                rowData[4] = promedio;
            } else {
                rowData[4] = "faltan notas";
            }
            model.addRow(rowData);
        }

    }//GEN-LAST:event_btnMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(VerCalificaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerCalificaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerCalificaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerCalificaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerCalificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> combo_curso;
    private javax.swing.JComboBox<String> combo_materia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_cali;
    // End of variables declaration//GEN-END:variables
}
