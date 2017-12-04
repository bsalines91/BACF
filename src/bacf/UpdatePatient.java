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

/**
 * This class represents the page that allows the
 * user to update the personal information of a 
 * patient.
 *
 * @author Brandon Salines
 * @author Anthony Eannarino
 * @author Brian Faria
 */
public class UpdatePatient extends ExaminerPage {
    public static final int ID = 4;
    private int pID; // patient ID

    /**
     * Creates the page
     * @param c A reference to the Controller object
     */
    public UpdatePatient(Controller c) {
        super(c);
        initComponents();
        radioButtonMale.setBackground(DEFAULT);
        radioButtonFemale.setBackground(DEFAULT);
        labelError.setText("");
        jPanel1.setBackground(DEFAULT);
        this.setEnabledButtons(false);
        this.setTest(jPanel1);
    }
    
    public void setPatient(String[] patient) {
        boolean isMale = patient[4].equalsIgnoreCase("Male");
        
        this.pID = Integer.parseInt(patient[0]);
        firstNameField.setText(patient[1]);
        lastNameField.setText(patient[2]);
        birthDateField.setText(patient[3]);
        radioButtonMale.setSelected(isMale);
        radioButtonFemale.setSelected(! isMale);
        educationField.setSelectedItem(patient[5]);
        occupationField.setText(patient[6]);
        ageField.setText(patient[7]);
        currDateField.setText(patient[8]);
        locationField.setText(patient[9]);
        examinerField.setText(patient[10]);
        
        labelTitle.setText("Update " + patient[1] + " " + patient[2]);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelFName = new javax.swing.JLabel();
        labelLName = new javax.swing.JLabel();
        labelDOB = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelEducation = new javax.swing.JLabel();
        labelOccupation = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        birthDateField = new javax.swing.JFormattedTextField();
        educationField = new javax.swing.JComboBox<>();
        occupationField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        labelTitle = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelLocation = new javax.swing.JLabel();
        labelExaminer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        locationField = new javax.swing.JTextArea();
        currDateField = new javax.swing.JFormattedTextField();
        examinerField = new javax.swing.JTextField();
        radioButtonMale = new javax.swing.JRadioButton();
        radioButtonFemale = new javax.swing.JRadioButton();
        labelError = new javax.swing.JLabel();
        buttonUpdate = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();

        setAutoscrolls(true);

        jPanel1.setAutoscrolls(true);

        labelFName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelFName.setText("First Name: ");

        labelLName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLName.setText("Last Name: ");

        labelDOB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelDOB.setText("DOB: ");

        labelGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelGender.setText("Gender: ");

        labelEducation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelEducation.setText("Education: ");

        labelOccupation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelOccupation.setText("Occupation:");

        labelAge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelAge.setText("Age: ");

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        birthDateField.setText("YYYY-MM-DD");

        educationField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        educationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                educationFieldActionPerformed(evt);
            }
        });

        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitle.setText("Update Patient");

        labelDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelDate.setText("Date:");

        labelLocation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLocation.setText("Location:");

        labelExaminer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelExaminer.setText("Examiner:");

        locationField.setColumns(20);
        locationField.setRows(5);
        jScrollPane1.setViewportView(locationField);

        currDateField.setText("YYYY-MM-DD");

        examinerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examinerFieldActionPerformed(evt);
            }
        });

        radioButtonMale.setText("Male");
        radioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonMaleActionPerformed(evt);
            }
        });

        radioButtonFemale.setText("Female");
        radioButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonFemaleActionPerformed(evt);
            }
        });

        buttonUpdate.setText("Update");
        buttonUpdate.setBorderPainted(false);
        buttonUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFName)
                            .addComponent(labelLName)
                            .addComponent(labelDOB)
                            .addComponent(labelGender)
                            .addComponent(labelEducation)
                            .addComponent(labelOccupation)
                            .addComponent(labelAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioButtonMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonFemale))
                            .addComponent(educationField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDate)
                                    .addComponent(labelLocation)
                                    .addComponent(labelExaminer))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(examinerField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(currDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(166, 166, 166))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(labelError)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelFName)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDate)
                        .addComponent(currDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLName)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLocation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDOB)
                            .addComponent(birthDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelGender)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radioButtonMale)
                                .addComponent(radioButtonFemale)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEducation)
                    .addComponent(educationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelExaminer)
                    .addComponent(examinerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOccupation)
                    .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAge)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(labelError)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method handles the event for the Update button. It checks the
     * information entered before updating the database and returning to
     * the PrevPatient page.
     * @param evt 
     */
    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
        this.performUpdate();
        PrevPatient prevPage = (PrevPatient) this.getController().getPage(PrevPatient.ID);
        prevPage.populateTable();
        this.getController().showPage(PrevPatient.ID);
    }//GEN-LAST:event_buttonUpdateActionPerformed

    /**
     * This method handles the event when the Female Radio Dial is selected.
     * It ensures that only one of the two radio dials may be selected at
     * a time.
     * @param evt 
     */
    private void radioButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonFemaleActionPerformed
        // Female
        if (radioButtonFemale.isSelected()) {
            radioButtonMale.setSelected(false);
        }
    }//GEN-LAST:event_radioButtonFemaleActionPerformed

    /**
     * This method handles the event when the Male Radio Dial is selected.
     * It ensures that only one of the two radio dials may be selected at
     * a time.
     * @param evt 
     */
    private void radioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonMaleActionPerformed
        // Male
        if (radioButtonMale.isSelected()) {
            radioButtonFemale.setSelected(false);
        }
    }//GEN-LAST:event_radioButtonMaleActionPerformed

    /**
     * AUTO-GENERATED -> Unused and cannot be deleted.
     * @param evt 
     */
    private void examinerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examinerFieldActionPerformed
    }//GEN-LAST:event_examinerFieldActionPerformed

    /**
     * AUTO-GENERATED -> Unused and cannot be deleted.
     * @param evt 
     */
    private void educationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_educationFieldActionPerformed
    }//GEN-LAST:event_educationFieldActionPerformed

    /**
     * AUTO-GENERATED -> Unused and cannot be deleted.
     * @param evt 
     */
    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
    }//GEN-LAST:event_firstNameFieldActionPerformed

    /**
     * This method handles the event when the Cancel button is clicked. It
     * re-populates the table on the PrevPatient page before switching pages.
     * @param evt 
     */
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
        PrevPatient prevPage = (PrevPatient) this.getController().getPage(PrevPatient.ID);
        prevPage.populateTable();
        this.getController().showPage(PrevPatient.ID);
    }//GEN-LAST:event_buttonCancelActionPerformed

    /**
     * Overriden method from ExaminerPage. This method checks that all fields
     * have correctly formatted data before updating the Database.
     */
    @Override
    public void performUpdate() {
        // Perform Database queries here...
        String gender = (radioButtonMale.isSelected()) ? "Male" : "Female";
        if (checkFields()) {
            this.getController().getDatabase().updatePatient(this.pID, firstNameField.getText(),
                    lastNameField.getText(), birthDateField.getText(),
                    gender, educationField.getSelectedItem().toString(),
                    occupationField.getText(), Integer.parseInt(ageField.getText()),
                    currDateField.getText(), locationField.getText(),
                    examinerField.getText());
        }
    }
    
    /**
     * Checks all fields for correctness of input. Will display error messages
     * accordingly.
     * @return True if all fields have valid data. False otherwise.
     */
    private boolean checkFields() {
        boolean isValid = true;
        if (firstNameField.getText().equals("") || (!firstNameField.getText().matches("[A-Za-z]+"))) {
            labelError.setText("First name field is empty or contains invaild charactors");
            isValid = false;
        } else if (lastNameField.getText().equals("") || (!lastNameField.getText().matches("[A-Za-z]+"))) {
            labelError.setText("Last name field is empty or contains invaild charactors");
            isValid = false;
        } else if (!(birthDateField.getText().matches("([0-9]{4})-([0-9]{2})-([0-9]{2})"))) {
            labelError.setText("Birth Date field is empty or contains invaild charactors");
            isValid = false;
        } else if (!(radioButtonMale.isSelected() || radioButtonFemale.isSelected())) {
            labelError.setText("Gender is not selected");
            isValid = false;
        } else if (educationField.getSelectedItem().equals("None Selected")) {
            labelError.setText("Education field is not selected");
            isValid = false;
        } else if (occupationField.getText().equals("") || (!occupationField.getText().matches("[A-Za-z]+"))) {
            labelError.setText("Occupation field is empty or contains invaild charactors");
            isValid = false;
        } else if (!(ageField.getText().matches("[0-9]+"))) {
            labelError.setText("Age field is empty or contains invaild charactors");
            isValid = false;
        } else if (!(currDateField.getText().matches("([0-9]{4})-([0-9]{2})-([0-9]{2})"))) {
            labelError.setText("Current date field is empty or contains invaild charactors");
            isValid = false;
        } else if (locationField.getText().equals("")) {
            labelError.setText("Location field is empty");
            isValid = false;
        } else if (examinerField.getText().equals("") || (!examinerField.getText().matches("[A-Za-z]+"))) {
            labelError.setText("Examiner field is empty or contains invaild charactors");
            isValid = false;
        }

        return isValid;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JFormattedTextField birthDateField;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JFormattedTextField currDateField;
    private javax.swing.JComboBox<String> educationField;
    private javax.swing.JTextField examinerField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelDOB;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelEducation;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelExaminer;
    private javax.swing.JLabel labelFName;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelLName;
    private javax.swing.JLabel labelLocation;
    private javax.swing.JLabel labelOccupation;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextArea locationField;
    private javax.swing.JTextField occupationField;
    private javax.swing.JRadioButton radioButtonFemale;
    private javax.swing.JRadioButton radioButtonMale;
    // End of variables declaration//GEN-END:variables
}
