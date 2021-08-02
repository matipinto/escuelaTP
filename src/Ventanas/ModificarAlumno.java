
package Ventanas;

import javax.swing.JOptionPane;
import escuela.Alumno;
import SQL.ConsultasAlumnos;

public class ModificarAlumno extends javax.swing.JFrame {
    
    public static ConsultasAlumnos consultasAlu = new ConsultasAlumnos();
    Alumno a = new Alumno();
    public ModificarAlumno() {
        initComponents();
        texto_dni.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campo_dni = new javax.swing.JTextField();
        campo_nombre = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campo_ape = new javax.swing.JTextField();
        campo_dir = new javax.swing.JTextField();
        campo_tel = new javax.swing.JTextField();
        campo_matricula = new javax.swing.JTextField();
        jButton_modificar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        texto_dni = new javax.swing.JLabel();
        jbox_estado = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Modificar Datos del Alumno");

        jLabel2.setText("Buscar por Nro de Documento:");

        jLabel3.setText("Nombre del Alumno:");

        campo_dni.setName("campo_dni"); // NOI18N

        btn_buscar.setText("Buscar");
        btn_buscar.setName("btnBuscar"); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido del Alumno:");

        jLabel5.setText("Direccion:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Matricula:");

        jLabel8.setText("Estado del alumno:");

        jButton_modificar.setText("Modificar");
        jButton_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel9.setText("Nro Documento:");

        texto_dni.setText("Dni del alumno");

        jbox_estado.setText("Activo/Inactivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campo_matricula, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_tel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_dir, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_ape, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_dni, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(texto_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE))
                            .addComponent(campo_nombre)
                            .addComponent(jbox_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(texto_dni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campo_dir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campo_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campo_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jbox_estado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_modificar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modificarActionPerformed
        String nombre = campo_nombre.getText();
        String apellido = campo_ape.getText();
        String NroDoc = texto_dni.getText();
        String direccion = campo_dir.getText();
        String telefono = campo_tel.getText();
        int matricula = Integer.parseInt(campo_matricula.getText());
        Boolean estado = false;
        if (jbox_estado.isSelected()) {
            estado = true;
        }
        a.setNombre(nombre);
        a.setApellido(apellido);
        a.setDni(NroDoc);
        a.setDireccion(direccion);
        a.setTelefono(telefono);
        a.setEstado(estado);
        a.setMatricula(matricula);
        consultasAlu.modificar_Alumno(a);

        this.dispose();
    }//GEN-LAST:event_jButton_modificarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        Boolean existe = consultasAlu.existeAlumno(campo_dni.getText());            
        if (existe) {            
            a.setDni(campo_dni.getText());
            a = consultasAlu.TraerAlumno(a);            
            String nombre = a.getNombre();
            String apellido = a.getApellido();
            String NroDoc = a.getDni();
            String direccion = a.getDireccion();
            String telefono = a.getTelefono();
            
            int matricula = a.getMatricula();
            String matri = String.valueOf(matricula);
            Boolean estado = a.getEstado();
            if (estado) {
                jbox_estado.setSelected(true);
            }
            
            campo_nombre.setText(nombre);
            texto_dni.setText(NroDoc);
            campo_ape.setText(apellido);
            campo_dir.setText(direccion);
            campo_tel.setText(telefono);
            campo_matricula.setText(matri);    
        } else {
            JOptionPane.showMessageDialog(null, "El alumno no existe.");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JTextField campo_ape;
    private javax.swing.JTextField campo_dir;
    private javax.swing.JTextField campo_dni;
    private javax.swing.JTextField campo_matricula;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_tel;
    private javax.swing.JButton jButton_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox jbox_estado;
    private javax.swing.JLabel texto_dni;
    // End of variables declaration//GEN-END:variables
}
