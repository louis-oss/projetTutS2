/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import java.sql.ResultSetMetaData;
import javax.swing.JFrame;

/**
 *
 * @author Thibault
 */
public class LoginWindow extends javax.swing.JFrame {
    private int mousepX;
    private int mousepY;
    private Connection conn;
    private Utilisateur currentuser = null;
    /**
     * Creates new form LoginWindow
     */
    public LoginWindow(Connection conn) {
        this.conn = conn;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public Utilisateur getUser() {
        return currentuser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jLabelMouseDrag = new javax.swing.JLabel();
        jPanelContainerCenter = new javax.swing.JPanel();
        jPanelWhiteSquare = new javax.swing.JPanel();
        jTextFieldName = new javax.swing.JTextField();
        jSeparatorName = new javax.swing.JSeparator();
        jPasswordField = new javax.swing.JPasswordField();
        jSeparatorPsw = new javax.swing.JSeparator();
        jLabelErreur = new javax.swing.JLabel();
        jButtonConnect = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 184, 162));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMain.setBackground(new java.awt.Color(0, 184, 162));
        jPanelMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanelMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelMain.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.setIcon(new javax.swing.ImageIcon("F:\\Travail\\1er année DUT\\Projets\\Projet tutoré S2\\projetTutS2\\EasyTask\\src\\Images\\icons\\minusSmallWhite.png")); // NOI18N
        jLabelMinimize.setToolTipText("");
        jLabelMinimize.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseReleased(evt);
            }
        });

        jLabelExit.setBackground(new java.awt.Color(0, 0, 0));
        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setIcon(new javax.swing.ImageIcon("F:\\Travail\\1er année DUT\\Projets\\Projet tutoré S2\\projetTutS2\\EasyTask\\src\\Images\\icons\\closeSmallWhite.png")); // NOI18N
        jLabelExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelExit.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExitMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelExitMouseReleased(evt);
            }
        });

        jLabelMouseDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelMouseDragMouseDragged(evt);
            }
        });
        jLabelMouseDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMouseDragMousePressed(evt);
            }
        });

        jPanelContainerCenter.setOpaque(false);

        jPanelWhiteSquare.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldName.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(0, 184, 162));
        jTextFieldName.setText("Nom d'utilisateur");
        jTextFieldName.setBorder(null);
        jTextFieldName.setOpaque(false);
        jTextFieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNameFocusLost(evt);
            }
        });

        jSeparatorName.setBackground(new java.awt.Color(0, 184, 162));
        jSeparatorName.setForeground(new java.awt.Color(0, 184, 162));

        jPasswordField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(0, 184, 162));
        jPasswordField.setText("EntrezLeMotDePasse");
        jPasswordField.setBorder(null);
        jPasswordField.setOpaque(false);
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });

        jSeparatorPsw.setBackground(new java.awt.Color(0, 184, 162));
        jSeparatorPsw.setForeground(new java.awt.Color(0, 184, 162));

        jLabelErreur.setForeground(new java.awt.Color(255, 51, 51));
        jLabelErreur.setMaximumSize(new java.awt.Dimension(300, 16));

        jButtonConnect.setBackground(new java.awt.Color(0, 184, 162));
        jButtonConnect.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonConnect.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConnect.setText("Connexion");
        jButtonConnect.setBorder(null);
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelWhiteSquareLayout = new javax.swing.GroupLayout(jPanelWhiteSquare);
        jPanelWhiteSquare.setLayout(jPanelWhiteSquareLayout);
        jPanelWhiteSquareLayout.setHorizontalGroup(
            jPanelWhiteSquareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWhiteSquareLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanelWhiteSquareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldName)
                    .addComponent(jSeparatorName)
                    .addComponent(jPasswordField)
                    .addComponent(jSeparatorPsw)
                    .addComponent(jButtonConnect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelErreur, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelWhiteSquareLayout.setVerticalGroup(
            jPanelWhiteSquareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWhiteSquareLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparatorName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparatorPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelErreur, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon("F:\\Travail\\1er année DUT\\Projets\\Projet tutoré S2\\projetTutS2\\EasyTask\\src\\Images\\logoWhiteSmall.png")); // NOI18N

        javax.swing.GroupLayout jPanelContainerCenterLayout = new javax.swing.GroupLayout(jPanelContainerCenter);
        jPanelContainerCenter.setLayout(jPanelContainerCenterLayout);
        jPanelContainerCenterLayout.setHorizontalGroup(
            jPanelContainerCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelWhiteSquare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelContainerCenterLayout.setVerticalGroup(
            jPanelContainerCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerCenterLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelLogo)
                .addGap(29, 29, 29)
                .addComponent(jPanelWhiteSquare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jLabelMouseDrag, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelContainerCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(388, 388, 388))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelMouseDrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jPanelContainerCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        if (jPasswordField.getText().equals(""))
        jPasswordField.setText("EntrezLeMotDePasse");
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        if (jPasswordField.getText().equals("EntrezLeMotDePasse"))
        jPasswordField.setText("");
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jTextFieldNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNameFocusLost
        if (jTextFieldName.getText().equals(""))
        jTextFieldName.setText("Nom d'utilisateur");
    }//GEN-LAST:event_jTextFieldNameFocusLost

    private void jTextFieldNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNameFocusGained
        if (jTextFieldName.getText().equals("Nom d'utilisateur"))
        jTextFieldName.setText("");
    }//GEN-LAST:event_jTextFieldNameFocusGained

    private void jLabelExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseReleased
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseReleased

    private void jLabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseExited
        jLabelExit.setBackground(new Color(0,0,0));
        jLabelExit.setOpaque(false);
    }//GEN-LAST:event_jLabelExitMouseExited

    private void jLabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseEntered
        jLabelExit.setBackground(new Color(208,2,28));
        jLabelExit.setOpaque(true);
    }//GEN-LAST:event_jLabelExitMouseEntered

    private void jLabelMinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseReleased
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseReleased

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        jLabelMinimize.setBackground(new Color(0,0,0));
        jLabelMinimize.setOpaque(false);
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        jLabelMinimize.setBackground(new Color(0,157,138));
        jLabelMinimize.setOpaque(true);
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMouseDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMouseDragMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jLabelMouseDragMousePressed

    private void jLabelMouseDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMouseDragMouseDragged
        int coordX = evt.getXOnScreen();
        int coordY = evt.getYOnScreen();

        this.setLocation(coordX-this.mousepX, coordY-this.mousepY);
    }//GEN-LAST:event_jLabelMouseDragMouseDragged

    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
        //On récupère le contenu des champs
        String user = jTextFieldName.getText();
        String password = jPasswordField.getText();
        
        //On test si les champs ne sont pas "vide"
        if (user.equals("Nom d'utilisateur")) {
            jLabelErreur.setText("Entrez le nom d'utilisateur");
        }
        else if (password.equals("EntrezLeMotDePasse")) {
            jLabelErreur.setText("Entrez le mot de passe");
        }
        else {
            try {
                Statement state = conn.createStatement();
                
                //On test s'il y a bien qu'une ligne de renvoyée
                ResultSet resultCount = state.executeQuery("SELECT COUNT(1) FROM Utilisateur WHERE login='" + user + "' and password='" + password + "'");
                resultCount.next();
                if (resultCount.getString(1).equals(1 + "")) {
                    ResultSet result = state.executeQuery("SELECT login, password, type_utilisateur FROM Utilisateur WHERE login='" + user + "' and password='" + password + "'");
                    jLabelErreur.setText("Connection réussie");
                    result.next();
                    switch(result.getString(3)) {
                        case "technicien":
                            this.currentuser = new Technicien(user, password);
                            break;
                        case "commercial":
                            this.currentuser = new Commercial(user, password);
                            break;
                        case "client":
                            this.currentuser = new Client(user, password);
                            break;
                        default:
                            System.out.println("Erreur dans la base de données");
                    }
                    System.out.println(this.currentuser.toString());
                    //TODO : Ouvrir la prochaine fenêtre
                }
                else {
                    jLabelErreur.setText("Nom d'utilisateur ou mot de passe incorrect");
                }
            } catch(Exception e) {
                System.out.println(e);
                jLabelErreur.setText(e.toString());
            }
        }
    }//GEN-LAST:event_jButtonConnectActionPerformed

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
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnect;
    private javax.swing.JLabel jLabelErreur;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelMouseDrag;
    private javax.swing.JPanel jPanelContainerCenter;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelWhiteSquare;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JSeparator jSeparatorName;
    private javax.swing.JSeparator jSeparatorPsw;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
