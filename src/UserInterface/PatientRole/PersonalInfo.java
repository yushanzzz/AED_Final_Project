/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.Patient.Record;
import Business.Patient.RecordHistory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Irene, Yushan
 */
public class PersonalInfo extends javax.swing.JPanel {
    private JPanel userProcessContainer;    
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientOrganization patientOrganization;
    private Patient patient;
    /**
     * Creates new form ViewVitalSignsJPanel
     */
    public PersonalInfo(JPanel userProcessContainer,UserAccount userAccount, PatientOrganization patientOrganization, Enterprise enterprise,EcoSystem ecoSyste) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.patientOrganization = (PatientOrganization)patientOrganization;
        this.enterprise = enterprise;
        this.patient= userAccount.getPatient();

        populateDetails();
    }

    private void populateDetails() {
        if (patient.getRecord() != null){
            Record record = patient.getRecord();
            txtRec1.setText(String.valueOf(record.getRespiratoryRate()));
            txtRec2.setText(String.valueOf(record.getHeartRate()));
            txtRec3.setText(String.valueOf(record.getSystolicBloodPressure()));
            txtRec4.setText(String.valueOf(record.getWeightInPounds()));
            txtRec5.setText(String.valueOf(record.getStandTime()));
            txtRec6.setText(String.valueOf(record.getMoveTime()));
            txtRec7.setText(String.valueOf(record.getExcerciseTime()));
            txtRec8.setText(String.valueOf(record.getTotalTime()));
        } else {
            Record record = patient.getRecord();
            txtRec1.setText(String.valueOf(record.getRespiratoryRate()));
            txtRec2.setText(String.valueOf(record.getHeartRate()));
            txtRec3.setText(String.valueOf(record.getSystolicBloodPressure()));
            txtRec4.setText(String.valueOf(record.getWeightInPounds()));
            txtRec5.setText(String.valueOf(record.getStandTime()));
            txtRec6.setText(String.valueOf(record.getMoveTime()));
            txtRec7.setText(String.valueOf(record.getExcerciseTime()));
            txtRec8.setText(String.valueOf(record.getTotalTime()));
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        txtRec1 = new javax.swing.JTextField();
        txtRec2 = new javax.swing.JTextField();
        txtRec3 = new javax.swing.JTextField();
        txtRec4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        saveJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        updateJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtRec5 = new javax.swing.JTextField();
        txtRec6 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtRec7 = new javax.swing.JTextField();
        txtRec8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 196, 122));
        setInheritsPopupMenu(true);
        setMaximumSize(new java.awt.Dimension(700, 410));
        setMinimumSize(new java.awt.Dimension(700, 410));
        setPreferredSize(new java.awt.Dimension(700, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Weight in pounds");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        txtRec1.setEnabled(false);
        add(txtRec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 159, -1));

        txtRec2.setEnabled(false);
        add(txtRec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 159, -1));

        txtRec3.setEnabled(false);
        add(txtRec3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 159, -1));

        txtRec4.setEnabled(false);
        add(txtRec4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 159, -1));

        jLabel13.setText("Respiratory rate");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel14.setText("Heart rate");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel15.setText("Systolic blood pressure");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        saveJButton.setText("Save");
        saveJButton.setEnabled(false);
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });
        add(saveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });
        add(updateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        jLabel9.setText("Move Time (mins)");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel10.setText("Excercise Time (mins)");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, 26));

        jLabel11.setText("Total Time (mins)");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        txtRec5.setEnabled(false);
        txtRec5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRec5ActionPerformed(evt);
            }
        });
        add(txtRec5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 162, -1));

        txtRec6.setEnabled(false);
        add(txtRec6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 159, -1));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel17.setText("View Record Details");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 28, 269, -1));

        txtRec7.setEnabled(false);
        add(txtRec7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 159, -1));

        txtRec8.setEditable(false);
        txtRec8.setEnabled(false);
        add(txtRec8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 159, -1));

        jLabel8.setText("Stand Time (mins)");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 122, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtRec5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRec5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRec5ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
        txtRec8.setEnabled(false);
        if((txtRec1.getText().length()==0)||
                (txtRec2.getText().length()==0)||
                (txtRec3.getText().length()==0)||
                (txtRec4.getText().length()==0)||
                (txtRec5.getText().length()==0)||
                (txtRec6.getText().length()==0)||
                (txtRec7.getText().length()==0))
        {
            JOptionPane.showMessageDialog(null, "Alert! Inputs can not be empty! ", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if((txtRec1.getText().length() != 0) ||
             (txtRec2.getText().length()!=0) ||
             (txtRec3.getText().length() != 0)||
             (txtRec4.getText().length() !=0)||
             (txtRec5.getText().length() !=0)||
             (txtRec6.getText().length() !=0)||
             (txtRec7.getText().length() !=0)) {
            try{
                float respiratoryRate = Float.parseFloat(txtRec1.getText());
                float heartRate = Float.parseFloat(txtRec2.getText());
                float systolicBloodPressure = Float.parseFloat(txtRec3.getText());
                float weightInPounds = Float.parseFloat(txtRec4.getText());
                int standTime = Integer.parseInt(txtRec5.getText());
                int moveTime = Integer.parseInt(txtRec6.getText());
                int excerciseTime = Integer.parseInt(txtRec7.getText());
              
                Record record = patient.getRecord();
                record.setRespiratoryRate(respiratoryRate);
                record.setHeartRate(heartRate);
                record.setSystolicBloodPressure(systolicBloodPressure);
                record.setWeightInPounds(weightInPounds);
                record.setStandTime(standTime);
                record.setMoveTime(moveTime);
                record.setExcerciseTime(excerciseTime);
                record.setTotalTime();
                txtRec8.setText(String.valueOf(record.getTotalTime()));

                JOptionPane.showMessageDialog(null, "Save Patient Information Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                //resetFields();
                
                txtRec1.setEnabled(false);
                txtRec2.setEnabled(false);
                txtRec3.setEnabled(false);
                txtRec4.setEnabled(false);
                txtRec5.setEnabled(false);
                txtRec6.setEnabled(false);
                txtRec7.setEnabled(false);
                txtRec8.setEnabled(false);
                updateJButton.setEnabled(true);
                saveJButton.setEnabled(false);
      
            }catch(Exception e){

                JOptionPane.showMessageDialog(null, "Alert! Please enter appropriate values! ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        Record record = patient.getRecord();
        txtRec1.setText(String.valueOf(record.getRespiratoryRate()));
        txtRec2.setText(String.valueOf(record.getHeartRate()));
        txtRec3.setText(String.valueOf(record.getSystolicBloodPressure()));
        txtRec4.setText(String.valueOf(record.getWeightInPounds()));
        txtRec5.setText(String.valueOf(record.getStandTime()));
        txtRec6.setText(String.valueOf(record.getMoveTime()));
        txtRec7.setText(String.valueOf(record.getExcerciseTime()));
        txtRec8.setText(String.valueOf(record.getTotalTime()));
        
        txtRec1.setEnabled(true);
        txtRec2.setEnabled(true);
        txtRec3.setEnabled(true);
        txtRec4.setEnabled(true);
        txtRec5.setEnabled(true);
        txtRec6.setEnabled(true);
        txtRec7.setEnabled(true);
        txtRec8.setEnabled(true);
        
        updateJButton.setEnabled(false);
        saveJButton.setEnabled(true);

    }//GEN-LAST:event_updateJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton saveJButton;
    private javax.swing.JTextField txtRec1;
    private javax.swing.JTextField txtRec2;
    private javax.swing.JTextField txtRec3;
    private javax.swing.JTextField txtRec4;
    private javax.swing.JTextField txtRec5;
    private javax.swing.JTextField txtRec6;
    private javax.swing.JTextField txtRec7;
    private javax.swing.JTextField txtRec8;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables
}
