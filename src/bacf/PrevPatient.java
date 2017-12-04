/**
 * BACF - Battery of Assessment of Cognitive Functioning
 * 
 * This program represents a test for gauging the cognitive reasoning
 * of an individual whom has suffered a traumatic brain injury. There are
 * five separate tests: 25 Numbers, Association, Exclusion, Generalization,
 * and Recall. Each use a timer an point system in order to calculate results,
 * show them to the examiner, and store the information in a database for
 * future management.
 * 
 * Written for Michael Meyerson
 */
package bacf;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 * This class represents the Previous Patients page. It loads all
 * of the patients from the database into a table for management.
 *
 * @author Brandon Salines
 * @author Anthony Eannarino
 * @author Brian Faria
 */
public class PrevPatient extends ExaminerPage {
    public static final int ID = 3;
    private ArrayList<String[]> all;

    /**
     * Creates the PrevPatient page.
     */
    public PrevPatient(Controller c) {
        super(c);
        initComponents();
        panelPrevPatient.setBackground(DEFAULT);
        this.setEnabledButtons(false);
        this.setTest(panelPrevPatient);
        labelMessage.setText("");
    }
    
    /**
     * Populates the table by querying the database for the patients.
     */
    public void populateTable() {
        all = this.getController().getDatabase().getAllPatients();
        DefaultTableModel dtm = new DefaultTableModel(new String[]{"Exam Date", "Name"}, 0);
        table.setModel(dtm); // Set table headers
        
        // Load patients names and date of examination.
        for (int i = 0; i < all.size(); i++) {
            String[] currentPatient = all.get(i);
            String examDate = currentPatient[8];
            String name = currentPatient[1] + " " + currentPatient[2];

            dtm.addRow(new String[]{examDate, name});
        }
        // Resize date column
        table.getColumnModel().getColumn(0).setMaxWidth(100);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrevPatient = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonPrint = new javax.swing.JButton();
        buttonPrevious = new javax.swing.JButton();
        labelMessage = new java.awt.Label();
        buttonRetake = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitle.setText("Previous Patients");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonPrint.setText("Print");
        buttonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintActionPerformed(evt);
            }
        });

        buttonPrevious.setText("Previous");
        buttonPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPreviousActionPerformed(evt);
            }
        });

        labelMessage.setText("label1");

        buttonRetake.setText("Retake");
        buttonRetake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrevPatientLayout = new javax.swing.GroupLayout(panelPrevPatient);
        panelPrevPatient.setLayout(panelPrevPatientLayout);
        panelPrevPatientLayout.setHorizontalGroup(
            panelPrevPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrevPatientLayout.createSequentialGroup()
                .addGroup(panelPrevPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrevPatientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTitle))
                    .addGroup(panelPrevPatientLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panelPrevPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrevPatientLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPrevPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonRetake, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelPrevPatientLayout.setVerticalGroup(
            panelPrevPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrevPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addGroup(panelPrevPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPrevPatientLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrevPatientLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRetake, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(labelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        add(panelPrevPatient, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method handles the event from the Edit button. It loads the Update
     * Patient page with the information of the patient selected from the table.
     * @param evt 
     */
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
       int patientIndex = table.getSelectedRow();
        if (patientIndex == -1) {
            labelMessage.setText("Please select a patient");
        } else {
            UpdatePatient updatePage = ((UpdatePatient) this.getController().getPage(UpdatePatient.ID));
            updatePage.setPatient(all.get(patientIndex));
            this.getController().showPage(UpdatePatient.ID);
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    /**
     * This method handles the event from the Delete button. It deletes the
     * selected patient from the database.
     * @param evt 
     */
    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        int patientIndex = table.getSelectedRow();
        if (patientIndex == -1) {
            labelMessage.setText("Please select a patient");
        } else {
            // Confirm the user wants to delete the patient
            String message = "Are you sure you want to delete the Patient?";
            int confirmDelete = JOptionPane.showConfirmDialog(null, message);

            if (confirmDelete == JOptionPane.YES_OPTION) {
                String[] patient = all.get(patientIndex);
                String info = "";
                for (int i = 0; i < patient.length; i++) {
                    info += patient[i] + ", ";
                }
                this.getController().getDatabase().deletePatient(Integer.parseInt(patient[0]));
                
                // Reload table to reflect updated database
                all = this.getController().getDatabase().getAllPatients();
                for (int j = 0; j < all.size() && j < table.getRowCount(); j++) {
                    String[] currentPatient = all.get(j);
                    String examDate = currentPatient[8];
                    String name = currentPatient[1] + " " + currentPatient[2];

                    table.setValueAt(examDate, j, 0);
                    table.setValueAt(name, j, 1);
                }
                
                // If unsuccessful, print approprate error message
                if (all.size() == table.getRowCount()) {
                    labelMessage.setText("ERROR: Patient " + patient[1] + " " + patient[2] + " could not be deleted.");
                }
                else {
                    labelMessage.setText("Patient " + patient[1] + " " + patient[2] + " was succesfully deleted.");
                    ((DefaultTableModel) table.getModel()).removeRow(table.getRowCount() - 1);
                } 
            }
        }


    }//GEN-LAST:event_buttonDeleteActionPerformed

    /**
     * Returns to the main page (NeworPrevPatient)
     * @param evt 
     */
    private void buttonPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPreviousActionPerformed
        // TODO add your handling code here:
        this.getController().showPage(NeworPrevPatient.ID);
    }//GEN-LAST:event_buttonPreviousActionPerformed

    /**
     * Redirects user to result Pages for review/printing of scores.
     * @param evt 
     */
    private void buttonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintActionPerformed
    }//GEN-LAST:event_buttonPrintActionPerformed

    /**
     * Redirects user to take tests again and updates the selected patient
     * from the table.
     * @param evt 
     */
    private void buttonRetakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetakeActionPerformed
        // TODO add your handling code here:
        int patientIndex = table.getSelectedRow();
        if (patientIndex == -1) {
            labelMessage.setText("Please select a patient");
        } else {
            String[] patient = all.get(patientIndex);
            this.getController().setPatID(Integer.parseInt(patient[0]));
            this.getController().showPage(NumbersTest1.ID);
        }
    }//GEN-LAST:event_buttonRetakeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonPrevious;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JButton buttonRetake;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label labelMessage;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelPrevPatient;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}