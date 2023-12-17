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
public class LoginApoteker extends javax.swing.JFrame {

    /**
     * Creates new form LoginApoteker
     */
    public LoginApoteker() {
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
        logoApoteker = new javax.swing.JLabel();
        ketLoginApoteker = new javax.swing.JLabel();
        loginPanelApo = new javax.swing.JPanel();
        idApotekerLabel = new javax.swing.JLabel();
        idATF = new javax.swing.JTextField();
        loginPanelApo2 = new javax.swing.JPanel();
        passATF = new javax.swing.JTextField();
        passApotekerLabel = new javax.swing.JLabel();
        btnLoginApoPanel = new javax.swing.JPanel();
        btnLoginApo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1023));

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoApoteker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoApoteker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medtrackicon/6.png"))); // NOI18N

        ketLoginApoteker.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ketLoginApoteker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ketLoginApoteker.setText("Masuk sebagai Apoteker");

        loginPanelApo.setBackground(new java.awt.Color(255, 255, 255));
        loginPanelApo.setLayout(new java.awt.GridBagLayout());

        idApotekerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idApotekerLabel.setText("ID APOTEKER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 6, 0);
        loginPanelApo.add(idApotekerLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 264;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 12, 6, 0);
        loginPanelApo.add(idATF, gridBagConstraints);

        loginPanelApo2.setBackground(new java.awt.Color(255, 255, 255));
        loginPanelApo2.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 264;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 15, 136);
        loginPanelApo2.add(passATF, gridBagConstraints);

        passApotekerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passApotekerLabel.setText("PASSWORD   ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 167, 15, 0);
        loginPanelApo2.add(passApotekerLabel, gridBagConstraints);

        btnLoginApoPanel.setBackground(new java.awt.Color(255, 255, 255));
        btnLoginApoPanel.setLayout(new java.awt.GridBagLayout());

        btnLoginApo.setBackground(new java.awt.Color(55, 66, 250));
        btnLoginApo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoginApo.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginApo.setText("Masuk");
        btnLoginApo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLoginApo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginApoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 319, 6, 317);
        btnLoginApoPanel.add(btnLoginApo, gridBagConstraints);

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoApoteker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ketLoginApoteker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginPanelApo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginPanelApo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLoginApoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(logoApoteker)
                .addGap(18, 18, 18)
                .addComponent(ketLoginApoteker)
                .addGap(27, 27, 27)
                .addComponent(loginPanelApo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPanelApo2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoginApoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void btnLoginApoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginApoActionPerformed
        // TODO add your handling code here:
        try {
    Connection c = KoneksiApo.getKoneksi();
    String sql = "SELECT * FROM login_apok WHERE id_apo = ? AND passApo = ?";
    PreparedStatement ps = c.prepareStatement(sql);

    ps.setString(1, idATF.getText());
    ps.setString(2, passATF.getText());

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
        JOptionPane.showMessageDialog(null, "Login berhasil");
        this.dispose(); // close the form
        new MObatApoteker().setVisible(true);// mengarah ke dashboard apoteker
    } else {
        JOptionPane.showMessageDialog(null, "Login Gagal");
        passATF.requestFocus();
    }
} catch (SQLException e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_btnLoginApoActionPerformed

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
            java.util.logging.Logger.getLogger(LoginApoteker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginApoteker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginApoteker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginApoteker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginApoteker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnLoginApo;
    private javax.swing.JPanel btnLoginApoPanel;
    private javax.swing.JTextField idATF;
    private javax.swing.JLabel idApotekerLabel;
    private javax.swing.JLabel ketLoginApoteker;
    private javax.swing.JPanel loginPanelApo;
    private javax.swing.JPanel loginPanelApo2;
    private javax.swing.JLabel logoApoteker;
    private javax.swing.JTextField passATF;
    private javax.swing.JLabel passApotekerLabel;
    // End of variables declaration//GEN-END:variables
}
