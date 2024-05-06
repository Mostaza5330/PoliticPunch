package log;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.ImageIcon;

public class Juego extends javax.swing.JFrame {

    int x, y;
    int level = 0;
    URL rutaFondo;

    public Juego() {
        initComponents();
        this.setResizable(false);
        Claudia.setFocusable(true);
        this.setLocationRelativeTo(null);    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBtn = new javax.swing.JLabel();
        Claudia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBtnMouseClicked(evt);
            }
        });
        menuBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuBtnKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                menuBtnKeyTyped(evt);
            }
        });
        getContentPane().add(menuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 230, 70));

        Claudia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/Claudia.gif"))); // NOI18N
        Claudia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ClaudiaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ClaudiaKeyReleased(evt);
            }
        });
        getContentPane().add(Claudia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 530, -1, -1));

        jLabel1.setText("QWQWQW");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 540, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/level1.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClaudiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClaudiaKeyPressed
        x = Claudia.getX();
        y = Claudia.getY();
        switch (evt.getExtendedKeyCode()) {
            case KeyEvent.VK_LEFT:
                Claudia.setIcon(new ImageIcon(getClass().getResource("/multimedia/Claudia_der1.gif")));
                Claudia.setLocation(x - 5, y);
                if (Claudia.getX() <= 0) {
                    Claudia.setLocation(0, y);
                }
                break;
            case KeyEvent.VK_RIGHT:
                Claudia.setIcon(new ImageIcon(getClass().getResource("/multimedia/Claudia_der1.gif")));
                Claudia.setLocation(x + 5, y);
                if (Claudia.getX() >= 1200) {
                    Claudia.setLocation(1200, y);
                }
                break;
            case KeyEvent.VK_UP:
                Claudia.setIcon(new ImageIcon(getClass().getResource("/multimedia/Claudia_espalda.gif")));
                break;
            case KeyEvent.VK_DOWN:
                Claudia.setIcon(new ImageIcon(getClass().getResource("/multimedia/Claudia_agachada.gif")));
                break;
            case KeyEvent.VK_P:
                Claudia.setIcon(new ImageIcon(getClass().getResource("/multimedia/Claudia_golpe.gif")));
                break;
            default:

        }
    }//GEN-LAST:event_ClaudiaKeyPressed

    private void ClaudiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClaudiaKeyReleased
        Claudia.setIcon(new ImageIcon(getClass().getResource("/multimedia/Claudia.gif")));
    }//GEN-LAST:event_ClaudiaKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void menuBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuBtnKeyPressed
        
    }//GEN-LAST:event_menuBtnKeyPressed

    private void menuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtnMouseClicked
new Pausa().setVisible(true);
    }//GEN-LAST:event_menuBtnMouseClicked

    private void menuBtnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuBtnKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_H) {
            new Pausa().setVisible(true);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_menuBtnKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Claudia;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel menuBtn;
    // End of variables declaration//GEN-END:variables
}
