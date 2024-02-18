/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Jose
 */
public class Ventana6 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana6
     */
    public Ventana6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new Clases.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        iniciarGrafo = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        hormigas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        factorDeEvaporacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        factorDeImportanciaFeromona = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        gradoDeVisibilidad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jPanel2.setBackground(new java.awt.Color(253, 253, 253));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(76, 60, 76));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 60, 76));
        jLabel1.setText("Iniciar");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 190, 80));

        panelRound1.setBackground(new java.awt.Color(76, 60, 76));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(253, 253, 253));
        jLabel5.setText("Grado de Visibilidad");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 210, -1));

        iniciarGrafo.setText("Iniciar Grafo");
        iniciarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarGrafoActionPerformed(evt);
            }
        });
        panelRound1.add(iniciarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 120, -1));

        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        panelRound1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 80, -1));

        hormigas.setText("10");
        hormigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hormigasActionPerformed(evt);
            }
        });
        panelRound1.add(hormigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 70, 30));

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(253, 253, 253));
        jLabel6.setText("Numero de Hormigas");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 190, -1));

        factorDeEvaporacion.setText("0.5");
        factorDeEvaporacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorDeEvaporacionActionPerformed(evt);
            }
        });
        panelRound1.add(factorDeEvaporacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 70, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(253, 253, 253));
        jLabel7.setText("Factor de evaporacion");
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 190, -1));

        factorDeImportanciaFeromona.setText("1");
        factorDeImportanciaFeromona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorDeImportanciaFeromonaActionPerformed(evt);
            }
        });
        panelRound1.add(factorDeImportanciaFeromona, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(253, 253, 253));
        jLabel8.setText("Importancia de la Feromona");
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 210, -1));

        gradoDeVisibilidad.setText("2");
        panelRound1.add(gradoDeVisibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jPanel2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 420, 230));

        jPanel3.setBackground(new java.awt.Color(76, 60, 76));
        jPanel3.setForeground(new java.awt.Color(76, 60, 76));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 50, 160, 10));

        jPanel4.setBackground(new java.awt.Color(76, 60, 76));
        jPanel4.setForeground(new java.awt.Color(76, 60, 76));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 170, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarGrafoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarGrafoActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

        Ventana3 ventana3 = new Ventana3();
        ventana3.setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_menuActionPerformed

    private void hormigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hormigasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hormigasActionPerformed

    private void factorDeEvaporacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorDeEvaporacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factorDeEvaporacionActionPerformed

    private void factorDeImportanciaFeromonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorDeImportanciaFeromonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factorDeImportanciaFeromonaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField factorDeEvaporacion;
    private javax.swing.JTextField factorDeImportanciaFeromona;
    private javax.swing.JTextField gradoDeVisibilidad;
    private javax.swing.JTextField hormigas;
    private javax.swing.JButton iniciarGrafo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton menu;
    private Clases.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
