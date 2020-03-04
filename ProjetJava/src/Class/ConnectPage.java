/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

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
        NamejTextField = new javax.swing.JTextField();
        MDPjPasswordField = new javax.swing.JPasswordField();
        NameLabel = new javax.swing.JLabel();
        MDPLabel = new javax.swing.JLabel();
        ConnjButton = new javax.swing.JButton();
        EntêtePanel = new javax.swing.JPanel();
        EnteteLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondPanel.setBackground(new java.awt.Color(153, 153, 153));

        ContenantPanel.setBackground(new java.awt.Color(102, 102, 102));

        NamejTextField.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        NamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamejTextFieldActionPerformed(evt);
            }
        });

        MDPjPasswordField.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        MDPjPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MDPjPasswordFieldActionPerformed(evt);
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
                                .addComponent(NamejTextField)
                                .addComponent(MDPjPasswordField)
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
                .addComponent(NamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MDPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(MDPjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void NamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamejTextFieldActionPerformed

    private void MDPjPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MDPjPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MDPjPasswordFieldActionPerformed

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
    private javax.swing.JPasswordField MDPjPasswordField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NamejTextField;
    private javax.swing.JPanel fondPanel;
    // End of variables declaration//GEN-END:variables
}
