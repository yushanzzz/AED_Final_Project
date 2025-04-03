/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Insurance.Insurance;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Irene, Yushan
 */
public class PatientHomePageJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;    
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientOrganization patientOrganization;
    //private PatientDirectory patientDirectory;
    /**
     * Creates new form PatientHomePageJPanel
     */
    public PatientHomePageJPanel(JPanel userProcessContainer,UserAccount userAccount, PatientOrganization patientOrganization, Enterprise enterprise,EcoSystem ecoSyste) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.patientOrganization = (PatientOrganization)patientOrganization;
        this.enterprise = enterprise;
        patientNameLable.setText(userAccount.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHomePage = new javax.swing.JLabel();
        manageProfileJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        patientNameLable = new javax.swing.JLabel();
        btnViewRecord = new javax.swing.JButton();
        btnViewInsurance = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 196, 122));
        setMaximumSize(new java.awt.Dimension(700, 410));
        setMinimumSize(new java.awt.Dimension(700, 410));
        setPreferredSize(new java.awt.Dimension(700, 410));

        lblTitle.setBackground(new java.awt.Color(250, 196, 122));
        lblTitle.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Medical Integration System");
        lblTitle.setOpaque(true);

        lblHomePage.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblHomePage.setForeground(new java.awt.Color(153, 0, 204));
        lblHomePage.setText("Home Page");

        manageProfileJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageProfileJButton.setText("Manage My Profile");
        manageProfileJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProfileJButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Welcome");
        jLabel1.setEnabled(false);

        patientNameLable.setBackground(new java.awt.Color(0, 153, 153));
        patientNameLable.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        patientNameLable.setForeground(new java.awt.Color(51, 51, 51));
        patientNameLable.setText("<patientName>");
        patientNameLable.setEnabled(false);

        btnViewRecord.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnViewRecord.setText("View Medical Record");
        btnViewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRecordActionPerformed(evt);
            }
        });

        btnViewInsurance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnViewInsurance.setText("View Insurance");
        btnViewInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInsuranceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(patientNameLable))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(lblHomePage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(manageProfileJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(patientNameLable))
                .addGap(5, 5, 5)
                .addComponent(lblHomePage)
                .addGap(55, 55, 55)
                .addComponent(manageProfileJButton)
                .addGap(28, 28, 28)
                .addComponent(btnViewInsurance)
                .addGap(40, 40, 40)
                .addComponent(btnViewRecord)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageProfileJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProfileJButtonActionPerformed
        // TODO add your handling code here:
        ManageMyProfileJPanel panel = new ManageMyProfileJPanel(userProcessContainer,userAccount,patientOrganization,enterprise,ecoSystem);
        userProcessContainer.add("ViewUpdateMyProfileJPane", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProfileJButtonActionPerformed

    private void btnViewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRecordActionPerformed
        // TODO add your handling code here:        
        ViewMedRecord panel = new ViewMedRecord(userProcessContainer,userAccount,patientOrganization,enterprise,ecoSystem);
        userProcessContainer.add("ViewMedRecord", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnViewRecordActionPerformed

    private void btnViewInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInsuranceActionPerformed
        // TODO add your handling code here:
        ViewInsurance panel = new ViewInsurance(userProcessContainer,userAccount,patientOrganization,enterprise,ecoSystem);
        userProcessContainer.add("ViewInsurance", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewInsuranceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewInsurance;
    private javax.swing.JButton btnViewRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHomePage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton manageProfileJButton;
    private javax.swing.JLabel patientNameLable;
    // End of variables declaration//GEN-END:variables
}
