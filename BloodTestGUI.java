/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bloodtestproject;

/**
 *
 * @author Ross
 */
public class BloodTestGUI extends javax.swing.JFrame {

    /**
     * Creates new form BloodTestGUI
     */
 private testScheduler appointmentQueue;
    private DeletedPatients missedAppointments; 
   
    public BloodTestGUI() {
        appointmentQueue = new testScheduler();
        missedAppointments = new DeletedPatients();
        initComponents();
        loadHardCodedData(); 
    }

    private void loadHardCodedData() {
        appointmentQueue.enqueue(1, new patient("Ben Mcquaid", 47, "low", "Dr. Murphy", false));
        appointmentQueue.enqueue(2, new patient("Gary Murtagh", 34, "urgent", "Dr. McCarthy", true));
        appointmentQueue.enqueue(3, new patient("Nico Duffy", 55, "low", "Dr. O'Connor", true));
        appointmentQueue.enqueue(1, new patient("Darren Doherty", 48, "urgent", "Dr. Brennan", true));
        appointmentQueue.enqueue(2, new patient("Ross Gaynor", 30, "urgent", "Dr. O'Sullivan", true));

        missedAppointments.push(new patient("Aaron Gleesom", 36, "medium", "Dr. O'Connor", true));
        missedAppointments.push(new patient("Blake Bolger", 39, "medium", "Dr. Brennan", false));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PatientTA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        NoShowTA = new javax.swing.JTextArea();
        displayPatientBtn = new javax.swing.JButton();
        displayNoShowBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Blood Test Scheduler");

        PatientTA.setColumns(20);
        PatientTA.setRows(5);
        jScrollPane1.setViewportView(PatientTA);

        NoShowTA.setColumns(20);
        NoShowTA.setRows(5);
        jScrollPane2.setViewportView(NoShowTA);

        displayPatientBtn.setText("display patients");
        displayPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayPatientBtnActionPerformed(evt);
            }
        });

        displayNoShowBtn.setText("display last five cancels");
        displayNoShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayNoShowBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayNoShowBtn)
                    .addComponent(displayPatientBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(displayPatientBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(displayNoShowBtn)
                        .addGap(93, 93, 93))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayPatientBtnActionPerformed
        // TODO add your handling code here:
       PatientTA.setText(appointmentQueue.printQueue());
    }//GEN-LAST:event_displayPatientBtnActionPerformed

    private void displayNoShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayNoShowBtnActionPerformed
        // TODO add your handling code here:
        NoShowTA.setText(missedAppointments.displayStack());
    }//GEN-LAST:event_displayNoShowBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BloodTestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodTestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodTestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodTestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodTestGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea NoShowTA;
    private javax.swing.JTextArea PatientTA;
    private javax.swing.JButton displayNoShowBtn;
    private javax.swing.JButton displayPatientBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
