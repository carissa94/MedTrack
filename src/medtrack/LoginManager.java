package medtrack;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class LoginManager extends javax.swing.JFrame {

    /**
     * Creates new form LoginApoteker
     */
    public LoginManager() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        bodyPanel = new javax.swing.JPanel();
        logoManager = new javax.swing.JLabel();
        ketLoginManager = new javax.swing.JLabel();
        loginPanelManager = new javax.swing.JPanel();
        idManagerLabel = new javax.swing.JLabel();
        idMTF = new javax.swing.JTextField();
        btnLoginManagerPanel = new javax.swing.JPanel();
        btnLoginManager = new javax.swing.JButton();
        loginPanelManager2 = new javax.swing.JPanel();
        passManagerLabel = new javax.swing.JLabel();
        passMTF1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1023));

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medtrackicon/5.png"))); // NOI18N

        ketLoginManager.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ketLoginManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ketLoginManager.setText("Masuk sebagai Manager");

        loginPanelManager.setBackground(new java.awt.Color(255, 255, 255));
        loginPanelManager.setLayout(new java.awt.GridBagLayout());

        idManagerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idManagerLabel.setText("ID MANAGER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 6, 0);
        loginPanelManager.add(idManagerLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 264;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 12, 6, 0);
        loginPanelManager.add(idMTF, gridBagConstraints);

        btnLoginManagerPanel.setBackground(new java.awt.Color(255, 255, 255));
        btnLoginManagerPanel.setLayout(new java.awt.GridBagLayout());

        btnLoginManager.setBackground(new java.awt.Color(55, 66, 250));
        btnLoginManager.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoginManager.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginManager.setText("Masuk");
        btnLoginManager.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLoginManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginManagerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 319, 6, 317);
        btnLoginManagerPanel.add(btnLoginManager, gridBagConstraints);

        loginPanelManager2.setBackground(new java.awt.Color(255, 255, 255));
        loginPanelManager2.setLayout(new java.awt.GridBagLayout());

        passManagerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passManagerLabel.setText("PASSWORD      ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 166, 6, 0);
        loginPanelManager2.add(passManagerLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 264;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 6, 139);
        loginPanelManager2.add(passMTF1, gridBagConstraints);

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoManager, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ketLoginManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginPanelManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLoginManagerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginPanelManager2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(logoManager)
                .addGap(18, 18, 18)
                .addComponent(ketLoginManager)
                .addGap(27, 27, 27)
                .addComponent(loginPanelManager, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPanelManager2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnLoginManagerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginManagerActionPerformed
        // TODO add your handling code here:
        try {
    Connection c = KoneksiApo.getKoneksi();
    String sql = "SELECT * FROM login_mana WHERE id_mana = ? AND passM = ?";
    PreparedStatement ps = c.prepareStatement(sql);

    ps.setString(1, idMTF.getText());
    ps.setString(2, passMTF1.getText());

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
        JOptionPane.showMessageDialog(null, "Login berhasil");
        new MObatManager().setVisible(true);
        this.dispose(); // close the form
    } else {
        JOptionPane.showMessageDialog(null, "Login Gagal");
        passMTF1.requestFocus();
    }
} catch (SQLException e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_btnLoginManagerActionPerformed

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
            java.util.logging.Logger.getLogger(LoginManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnLoginManager;
    private javax.swing.JPanel btnLoginManagerPanel;
    private javax.swing.JTextField idMTF;
    private javax.swing.JLabel idManagerLabel;
    private javax.swing.JLabel ketLoginManager;
    private javax.swing.JPanel loginPanelManager;
    private javax.swing.JPanel loginPanelManager2;
    private javax.swing.JLabel logoManager;
    private javax.swing.JTextField passMTF1;
    private javax.swing.JLabel passManagerLabel;
    // End of variables declaration//GEN-END:variables
}
