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
import java.awt.Color;
import javax.swing.JButton;

/**
 * This class represents the Association Test page.
 *
 * @author Brandon Salines
 * @author Anthony Eannarino
 * @author Brian Faria
 */
public class AssociationTest extends ExaminerPage {
    public static final int ID = 10;
    int assocCounter;
    String choice1, choice2, choice3, choice4, choice5;
    
    /**
     * Creates the page.
     * @param c A reference to the Controller Object
     */
    public AssociationTest(Controller c) {
        super(c);
        initComponents();
        choice1 = choice2 = choice3 = choice4 = choice5 = "";
        assocCounter = 1;
        panelAssociation.setBackground(DEFAULT);
        this.setPreviousPage(NumbersTest5.ID);
        this.setNextPage(ExclusionTest1.ID);
        this.setTest(panelAssociation);
    }
    
    /**
     * Override the method in Page. Resets the components and timer
     * in order to retake the test.
     */
    @Override
    public void prepPage() {
        super.prepPage();
        this.setEnabledStart(true);
        assocTestBtn1.setVisible(true);
        assocTestBtn2.setVisible(true);
        assocTestBtn3.setVisible(true);
        assocTestBtn4.setVisible(true);
        assocTestBtn5.setVisible(true);
        assocTestBtn6.setVisible(true);
        assocTestBtn7.setVisible(true);
        assocTestBtn8.setVisible(true);
        assocTestBtn9.setVisible(true);
        assocTestBtn10.setVisible(true);
        assocCounter = 1;
        choice1 = choice2 = choice3 = choice4 = choice5 = "";
    }
    
    /**
     * Starts the timer and initializes components.
     */
    @Override
    public void startTest() {
        super.startTest();
        errorLabel.setText("");
        assocTestSetLbl();
    }
    
    /**
     * Updates the database with the ID's of the selected buttons.
     */
    @Override
    public void performUpdate() {
        this.getController().getDatabase().addPicP1Test(
                this.getController().getPatID(), choice1, choice2,
                    choice3, choice4, choice5);
    }
    
    /**
     * Displays the appropriate prompt after clicking a picture.
     */
    public void assocTestSetLbl(){
        switch (assocCounter) {
            case 1:
                assocTestLbl.setText("Baby - Childhood");
                break;
            case 2:
                assocTestLbl.setText("Letter - News");
                break;
            case 3:
                assocTestLbl.setText("Pill - Sickness");
                break;
            case 4:
                assocTestLbl.setText("Page - Knowledge");
                break;
            case 5:
                assocTestLbl.setText("Sand - Work");
                break;
            case 6:
                assocTestLbl.setText("Test Complete");
                System.out.println(choice1 + choice2 + choice3 + choice4 + choice5);
                break;
            default:
                assocTestLbl.setText("");
        }
    }
    
    /**
     * Checks if the picture clicked is the final one. Updates the prompt, stops
     * the timer, and records the choice accordingly.
     * @param pic The JButton object of the button clicked.
     * @param choice The choice associated with the button.
     */
    private void checkSelection(JButton pic, String choice) {
        if (assocCounter < 6) {
            if(testStarted){
                if (assocCounter == 5) {
                    myTimer.stop();
                    this.setEnabledStart(false);
                }
                switch (assocCounter) {
                    case 1:
                        choice1 = choice;
                        break;
                    case 2:
                        choice2 = choice;
                        break;
                    case 3:
                        choice3 = choice;
                        break;
                    case 4:
                        choice4 = choice;
                        break;
                    case 5:
                        choice5 = choice;
                        break;
                    default:
                        break;
                }
                assocCounter++;
                pic.setVisible(false);
                errorLabel.setText("");
                assocTestSetLbl();
            }
            else {
                errorLabel.setText("Press Start to begin the test.");
            }
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

        panelAssociation = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        spacer = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        assocTestBtn3 = new javax.swing.JButton();
        assocTestBtn1 = new javax.swing.JButton();
        assocTestBtn4 = new javax.swing.JButton();
        assocTestBtn5 = new javax.swing.JButton();
        assocTestBtn2 = new javax.swing.JButton();
        assocTestBtn10 = new javax.swing.JButton();
        assocTestBtn9 = new javax.swing.JButton();
        assocTestBtn8 = new javax.swing.JButton();
        assocTestBtn7 = new javax.swing.JButton();
        assocTestBtn6 = new javax.swing.JButton();
        assocTestLbl = new javax.swing.JLabel();
        errorLabel1 = new javax.swing.JLabel();

        panelAssociation.setBackground(Color.LIGHT_GRAY);
        panelAssociation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        labelTitle.setText("Associations Test");
        panelAssociation.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 25, 230, 34));
        panelAssociation.add(spacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 30, 20));

        errorLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelAssociation.add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 320, 30));

        assocTestBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/assoTestpic3.png"))); // NOI18N
        assocTestBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assocTestBtn3ActionPerformed(evt);
            }
        });
        panelAssociation.add(assocTestBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 175, 120, 120));

        assocTestBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/assoTestpic1.png"))); // NOI18N
        assocTestBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assocTestBtn1ActionPerformed(evt);
            }
        });
        panelAssociation.add(assocTestBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 175, 120, 120));

        assocTestBtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/assoTestpic4.png"))); // NOI18N
        assocTestBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assocTestBtn4ActionPerformed(evt);
            }
        });
        panelAssociation.add(assocTestBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 175, 120, 120));

        assocTestBtn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/assoTestpic5.png"))); // NOI18N
        assocTestBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assocTestBtn5ActionPerformed(evt);
            }
        });
        panelAssociation.add(assocTestBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 175, 120, 120));

        assocTestBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/assoTestpic2.png"))); // NOI18N
        assocTestBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assocTestBtn2ActionPerformed(evt);
            }
        });
        panelAssociation.add(assocTestBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 175, 120, 120));

        assocTestBtn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/assoTestpic10.png"))); // NOI18N
        assocTestBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assocTestBtn10ActionPerformed(evt);
            }
        });
        panelAssociation.add(assocTestBtn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 325, 120, 120));

        assocTestBtn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/assoTestpic9.png"))); // NOI18N
        assocTestBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assocTestBtn9ActionPerformed(evt);
            }
        });
        panelAssociation.add(assocTestBtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 325, 120, 120));

        assocTestBtn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/assoTestpic8.png"))); // NOI18N
        assocTestBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assocTestBtn8ActionPerformed(evt);
            }
        });
        panelAssociation.add(assocTestBtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 325, 120, 120));

        assocTestBtn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/assoTestpic7.png"))); // NOI18N
        assocTestBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assocTestBtn7ActionPerformed(evt);
            }
        });
        panelAssociation.add(assocTestBtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 325, 120, 120));

        assocTestBtn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/assoTestpic6.png"))); // NOI18N
        assocTestBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assocTestBtn6ActionPerformed(evt);
            }
        });
        panelAssociation.add(assocTestBtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 325, 120, 120));

        assocTestLbl.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        assocTestLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assocTestLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelAssociation.add(assocTestLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 230, -1));
        panelAssociation.add(errorLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 320, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAssociation, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAssociation, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assocTestBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assocTestBtn1ActionPerformed
        // TODO add your handling code here:
        checkSelection(assocTestBtn1, "A");
    }//GEN-LAST:event_assocTestBtn1ActionPerformed

    private void assocTestBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assocTestBtn2ActionPerformed
        // TODO add your handling code here:
        checkSelection(assocTestBtn2, "B");
    }//GEN-LAST:event_assocTestBtn2ActionPerformed

    private void assocTestBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assocTestBtn3ActionPerformed
        // TODO add your handling code here:
        checkSelection(assocTestBtn3, "C");
    }//GEN-LAST:event_assocTestBtn3ActionPerformed

    private void assocTestBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assocTestBtn4ActionPerformed
        // TODO add your handling code here:
        checkSelection(assocTestBtn4, "D");
    }//GEN-LAST:event_assocTestBtn4ActionPerformed

    private void assocTestBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assocTestBtn5ActionPerformed
        // TODO add your handling code here:
        checkSelection(assocTestBtn5, "E");
    }//GEN-LAST:event_assocTestBtn5ActionPerformed

    private void assocTestBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assocTestBtn6ActionPerformed
        // TODO add your handling code here:
        checkSelection(assocTestBtn6, "F");
    }//GEN-LAST:event_assocTestBtn6ActionPerformed

    private void assocTestBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assocTestBtn7ActionPerformed
        // TODO add your handling code here:
        checkSelection(assocTestBtn7, "G");
    }//GEN-LAST:event_assocTestBtn7ActionPerformed

    private void assocTestBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assocTestBtn8ActionPerformed
        // TODO add your handling code here:
        checkSelection(assocTestBtn8, "H");
    }//GEN-LAST:event_assocTestBtn8ActionPerformed

    private void assocTestBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assocTestBtn9ActionPerformed
        // TODO add your handling code here:
        checkSelection(assocTestBtn9, "I");
    }//GEN-LAST:event_assocTestBtn9ActionPerformed

    private void assocTestBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assocTestBtn10ActionPerformed
        // TODO add your handling code here:
        checkSelection(assocTestBtn10, "J");
    }//GEN-LAST:event_assocTestBtn10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assocTestBtn1;
    private javax.swing.JButton assocTestBtn10;
    private javax.swing.JButton assocTestBtn2;
    private javax.swing.JButton assocTestBtn3;
    private javax.swing.JButton assocTestBtn4;
    private javax.swing.JButton assocTestBtn5;
    private javax.swing.JButton assocTestBtn6;
    private javax.swing.JButton assocTestBtn7;
    private javax.swing.JButton assocTestBtn8;
    private javax.swing.JButton assocTestBtn9;
    private javax.swing.JLabel assocTestLbl;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel errorLabel1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelAssociation;
    private javax.swing.JLabel spacer;
    // End of variables declaration//GEN-END:variables
}
