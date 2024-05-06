/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author osval
 */
public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    private static final String ARCHIVO_USUARIOS = "usuarios.txt";
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioTxt = new javax.swing.JTextField();
        contraTxt = new javax.swing.JPasswordField();
        btnOK = new javax.swing.JLabel();
        exitBt = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuarioTxt.setBackground(new java.awt.Color(204, 204, 204));
        usuarioTxt.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        usuarioTxt.setForeground(new java.awt.Color(102, 102, 102));
        usuarioTxt.setToolTipText("");
        usuarioTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        getContentPane().add(usuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 500, 40));

        contraTxt.setBackground(new java.awt.Color(204, 204, 204));
        contraTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        getContentPane().add(contraTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 370, 500, 40));

        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
        });
        getContentPane().add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, 130, 90));

        exitBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtMouseEntered(evt);
            }
        });
        getContentPane().add(exitBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 120, 80));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M/SESION.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtMouseClicked

    private void exitBtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtMouseEntered
        float hue = 332.84f / 360;
        float saturation = 89.62f / 100;
        float brightness = 41.57f / 100;
        exitBt.setBackground(Color.getHSBColor(hue, saturation, brightness));
    }//GEN-LAST:event_exitBtMouseEntered

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseClicked
        boolean valido = false;
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_USUARIOS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String usuario = partes[0];
                String contraseñaAlmacenada = partes[1];
                if (usuario.equals(usuarioTxt.getText()) && contraseñaAlmacenada.equals(new String(contraTxt.getPassword()))) {
                    valido = true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de usuarios: " + e.getMessage());
        }
        if (valido) {
            new Inicio().setVisible(valido);
            this.dispose();
        }else{
            new Registrar().setVisible(true);
        }
    }//GEN-LAST:event_btnOKMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnOK;
    private javax.swing.JPasswordField contraTxt;
    private javax.swing.JLabel exitBt;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField usuarioTxt;
    // End of variables declaration//GEN-END:variables
}
