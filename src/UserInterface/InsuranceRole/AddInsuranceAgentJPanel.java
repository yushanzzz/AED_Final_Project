/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.InsuranceRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Insurance.Insurance;
import Business.Organization.InsuranceOrganization;
import Business.Role.InsuranceAgent;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Irene
 */
public class AddInsuranceAgentJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;    
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private InsuranceOrganization insuranceOrganization;
    //private InsuranceAgentOrganization insuranceAgentOrganization;
    /**
     * Creates new form AddInsuranceAgentJPanel
     */
    public AddInsuranceAgentJPanel(JPanel userProcessContainer,UserAccount userAccount, InsuranceOrganization insuranceOrganization, Enterprise enterprise, EcoSystem ecoSyste) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.insuranceOrganization = insuranceOrganization;
        //this.insuranceAgentOrganization = (InsuranceAgentOrganization)insuranceAgentOrganization;
        this.enterprise = enterprise;
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
        txtPwd = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        txtptName = new javax.swing.JTextField();
        lblptName = new javax.swing.JLabel();
        lblinsName = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        lblinsType = new javax.swing.JLabel();
        lblinsHospital = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 410));
        setMinimumSize(new java.awt.Dimension(700, 410));

        jPanel1.setBackground(new java.awt.Color(235, 162, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 410));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 410));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 410));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblTitle.setText("Add insurance agent");

        txtptName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtptNameActionPerformed(evt);
            }
        });

        lblptName.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lblptName.setText("Agent name");

        lblinsName.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lblinsName.setText("Title");

        lblinsType.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lblinsType.setText("Username");

        lblinsHospital.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lblinsHospital.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnBack)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblinsName)
                                    .addComponent(lblinsType)
                                    .addComponent(lblinsHospital)
                                    .addComponent(lblptName))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtptName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnSave)))
                .addGap(222, 222, 222))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblTitle)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtptName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblptName))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblinsName))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinsType)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinsHospital)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(btnSave)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        
        Component[] componentArray = userProcessContainer.getComponents();
        Component lastComponent = componentArray[componentArray.length - 1];
        if (lastComponent instanceof InsuranceWorkAreaJPanel) {
            InsuranceWorkAreaJPanel workAreaPanel = (InsuranceWorkAreaJPanel) lastComponent;
            workAreaPanel.populateTable(); // 調用表格刷新方法
        }
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtptNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtptNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtptNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String agentName = txtptName.getText();
        String Title = txtTitle.getText();
        String username = txtUserName.getText();
        String password = txtPwd.getText();
        if (agentName.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required.");
            return;
        }

        if (agentName.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Agent name cannot contain numbers.");
            return;
        }

        if (Title.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Title cannot contain numbers.");
            return;
        }

        if (password.length() < 8 || password.length() > 16) {
            JOptionPane.showMessageDialog(null, "Password must be between 8 and 16 characters.");
            return;
        }

        try {
            insuranceOrganization.addInsuranceAgent(username, password, agentName);
            JOptionPane.showMessageDialog(null, "Insurance Agent Added Successfully");

            txtptName.setText("");
            txtTitle.setText("");
            txtUserName.setText("");
            txtPwd.setText("");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblinsHospital;
    private javax.swing.JLabel lblinsName;
    private javax.swing.JLabel lblinsType;
    private javax.swing.JLabel lblptName;
    private javax.swing.JTextField txtPwd;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtptName;
    // End of variables declaration//GEN-END:variables
}
