/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import javax.swing.JOptionPane;

/**
 *
 * @author itsia
 */
public class ConnectPage extends javax.swing.JFrame {

    /**
     * Creates new form ConnectPage
     */
    public ConnectPage() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondPanel = new javax.swing.JPanel();
        ContenantPanel = new javax.swing.JPanel();
        caseNom = new javax.swing.JTextField();
        caseMDP = new javax.swing.JPasswordField();
        NameLabel = new javax.swing.JLabel();
        MDPLabel = new javax.swing.JLabel();
        ConnjButton = new javax.swing.JButton();
        EntêtePanel = new javax.swing.JPanel();
        EnteteLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondPanel.setBackground(new java.awt.Color(153, 153, 153));

        ContenantPanel.setBackground(new java.awt.Color(102, 102, 102));

        caseNom.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        caseNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseNomActionPerformed(evt);
            }
        });

        caseMDP.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        caseMDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseMDPActionPerformed(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Nom");

        MDPLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        MDPLabel.setForeground(new java.awt.Color(255, 255, 255));
        MDPLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MDPLabel.setText("Mot de passe");

        ConnjButton.setBackground(new java.awt.Color(204, 204, 204));
        ConnjButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        ConnjButton.setText("Connexion");
        ConnjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenantPanelLayout = new javax.swing.GroupLayout(ContenantPanel);
        ContenantPanel.setLayout(ContenantPanelLayout);
        ContenantPanelLayout.setHorizontalGroup(
            ContenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenantPanelLayout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(ContenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenantPanelLayout.createSequentialGroup()
                        .addGroup(ContenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MDPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(caseNom)
                                .addComponent(caseMDP)
                                .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenantPanelLayout.createSequentialGroup()
                        .addComponent(ConnjButton)
                        .addGap(202, 202, 202))))
        );
        ContenantPanelLayout.setVerticalGroup(
            ContenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenantPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caseNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MDPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(caseMDP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(ConnjButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        EntêtePanel.setBackground(new java.awt.Color(102, 102, 102));
        EntêtePanel.setToolTipText("");
        EntêtePanel.setAutoscrolls(true);

        EnteteLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        EnteteLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnteteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnteteLabel.setText("Connexion");

        javax.swing.GroupLayout EntêtePanelLayout = new javax.swing.GroupLayout(EntêtePanel);
        EntêtePanel.setLayout(EntêtePanelLayout);
        EntêtePanelLayout.setHorizontalGroup(
            EntêtePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EntêtePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnteteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
        EntêtePanelLayout.setVerticalGroup(
            EntêtePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EntêtePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(EnteteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout fondPanelLayout = new javax.swing.GroupLayout(fondPanel);
        fondPanel.setLayout(fondPanelLayout);
        fondPanelLayout.setHorizontalGroup(
            fondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondPanelLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(ContenantPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(fondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(EntêtePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondPanelLayout.setVerticalGroup(
            fondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondPanelLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(ContenantPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(fondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondPanelLayout.createSequentialGroup()
                    .addComponent(EntêtePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 430, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caseNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseNomActionPerformed

    private void caseMDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseMDPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseMDPActionPerformed

    private void ConnjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnjButtonActionPerformed
        String nomSaisi = caseNom.getText();
        String MDPSaisi= caseMDP.getText();
        ConnectBDD conn = new ConnectBDD();
        conn.Connect();
      //  Connection conn = ConnectBDD.ConnectBDD();
        if(conn.connectUser(nomSaisi, MDPSaisi)==true){
            JOptionPane.showMessageDialog(null,"Connexion réussie");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"incorrect");
        }
        
        /*try {
            Connection conn = ConnectBDD.ConnectBDD();
            Statement state = (Statement) conn.createStatement();
            ResultSet result = state.executeQuery("SELECT * FROM Utilisateur WHERE LOGIN='"+nomSaisi+"'and PASSWORD='"+MDPSaisi+"'");
            ResultSetMetaData resultMeta = result.getMetaData();
            
            
            if (result.next()){
                this.dispose();  
            }else{
                JOptionPane.showMessageDialog(null,"incorrect");
            }
        }catch(Exception e){
            System.out.println(e);
        }*/

 
    }//GEN-LAST:event_ConnjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConnectPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnectPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConnjButton;
    private javax.swing.JPanel ContenantPanel;
    private javax.swing.JLabel EnteteLabel;
    private javax.swing.JPanel EntêtePanel;
    private javax.swing.JLabel MDPLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPasswordField caseMDP;
    private javax.swing.JTextField caseNom;
    private javax.swing.JPanel fondPanel;
    // End of variables declaration//GEN-END:variables
}
