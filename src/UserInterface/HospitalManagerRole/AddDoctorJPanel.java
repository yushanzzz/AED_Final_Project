/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.HospitalManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HospitalOrganization;
import Business.Organization.InsuranceOrganization;
import Business.Role.DoctorRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jiaye
 */
public class AddDoctorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;    
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private HospitalOrganization hospitalOrganization;
    ArrayList<UserAccount> doctorList;
    /**
     * Creates new form AddJPanel
     */
    public AddDoctorJPanel(JPanel userProcessContainer,UserAccount userAccount, HospitalOrganization hospitalOrganization, Enterprise enterprise, EcoSystem ecoSyste, ArrayList doctorList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.hospitalOrganization = hospitalOrganization;
        this.enterprise = enterprise;
        this.doctorList = doctorList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJobTitle = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblDoctorName = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtJobTitle = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnSave1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(253, 223, 223));
        setMaximumSize(new java.awt.Dimension(700, 410));
        setMinimumSize(new java.awt.Dimension(700, 410));
        setPreferredSize(new java.awt.Dimension(700, 410));

        lblJobTitle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblJobTitle.setText("Job Title");

        lblUsername.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUsername.setText("Username");

        lblPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPassword.setText("Password");

        lblDoctorName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDoctorName.setText("Doctor Name");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel12.setText("Detail Information");

        btnSave1.setText("Save");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDoctorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 236, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack)
                .addGap(123, 123, 123)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jLabel12))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnSave1)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

         userProcessContainer.remove(this);

        Component[] componentArray = userProcessContainer.getComponents();
        Component lastComponent = componentArray[componentArray.length - 1];
        if (lastComponent instanceof HospitalManagerRoleJPanel) {
            HospitalManagerRoleJPanel workAreaPanel = (HospitalManagerRoleJPanel) lastComponent;
            workAreaPanel.populateTable(); // 調用表格刷新方法
        }

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
        
        String docName = txtDoctorName.getText();
        String docTitle = txtJobTitle.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        if (docName.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required.");
            return;
        }

        if (docName.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Doctor name cannot contain numbers.");
            return;
        }

    
        if (docTitle.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Title cannot contain numbers.");
            return;
        }

        if (password.length() < 8 || password.length() > 16) {
            JOptionPane.showMessageDialog(null, "Password must be between 8 and 16 characters.");
            return;
        }   
        
        try {

            UserAccount u = new UserAccount();
            u.setName(docName);
            u.setPassword(password);
            u.setUsername(username);
            u.setRole(new DoctorRole());
            doctorList.add(u);
            
            JOptionPane.showMessageDialog(null, "Doctor Added Successfully");
  
            // clear
            txtDoctorName.setText("");
            txtJobTitle.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_btnSave1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblJobTitle;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtJobTitle;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
