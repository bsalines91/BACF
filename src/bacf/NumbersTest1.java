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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

/**
 * This class represent the first 25 Numbers Test page.
 *
 * @author Brandon Salines
 * @author Anthony Eannarino
 * @author Brian Faria
 */
public class NumbersTest1 extends ExaminerPage {
    public static final int ID = 5;
    int counter;
    
    
    /**
     * Creates the page.
     * @param c A reference to the Controller Object
     */
    public NumbersTest1(Controller c) {
        super(c);
        initComponents();
        counter = 1;
        numTestPanel1.setBackground(DEFAULT);
        this.setPreviousPage(NeworPrevPatient.ID);
        this.setNextPage(NumbersTest2.ID);
        this.setTest(numTestPanel1);
    }
    
    /**
     * Resets the timer and page components to retake the test.
     */
    @Override
    public void prepPage () {
        super.prepPage();
        this.setEnabledStart(true);
    }
    
    /**
     * Updates the database with the time taken to complete the test.
     */
    @Override
    public void performUpdate() {
        this.getController().getDatabase().addNumbersTest(
                this.getController().getPatID(), finalTime);
    }
    
    /**
     * Checks to see if the button clicked was the correct number
     * in the sequence. Displays an error and stops the timer
     * accordingly.
     * @param buttonNum The number of the button clicked.
     */
    private void checkNumber(int buttonNum) {
        if(counter==buttonNum && testStarted==true){
            if (buttonNum == 25) {
                testComplete = true;
                this.stopTimer();
                this.setEnabledStart(false); // Hide Start button because test complete
            }
            errorLabel.setText("");
            counter++;
        }
        else if(testStarted == false){
            //display test not started error
            errorLabel.setText("Press Start to begin the test."); 
        }
        else{
            //display wrong number error
            errorLabel.setText("Wrong number. Try again.");
            int delay = 2500; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    errorLabel.setText("");
                }
            };
            new Timer(delay, taskPerformer).start();
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

        numTestPanel1 = new javax.swing.JPanel();
        numTest1_btn_2 = new javax.swing.JButton();
        numTest1_btn_10 = new javax.swing.JButton();
        numTest1_btn_6 = new javax.swing.JButton();
        numTest1_btn_8 = new javax.swing.JButton();
        numTest1_btn_13 = new javax.swing.JButton();
        numTest1_btn_20 = new javax.swing.JButton();
        numTest1_btn_19 = new javax.swing.JButton();
        numTest1_btn_16 = new javax.swing.JButton();
        numTest1_btn_17 = new javax.swing.JButton();
        numTest1_btn_21 = new javax.swing.JButton();
        numTest1_btn_22 = new javax.swing.JButton();
        numTest1_btn_23 = new javax.swing.JButton();
        numTest1_btn_25 = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        numTest1_btn_3 = new javax.swing.JButton();
        numTest1_btn_1 = new javax.swing.JButton();
        numTest1_btn_5 = new javax.swing.JButton();
        numTest1_btn_12 = new javax.swing.JButton();
        numTest1_btn_4 = new javax.swing.JButton();
        numTest1_btn_18 = new javax.swing.JButton();
        numTest1_btn_7 = new javax.swing.JButton();
        numTest1_btn_14 = new javax.swing.JButton();
        numTest1_btn_24 = new javax.swing.JButton();
        numTest1_btn_9 = new javax.swing.JButton();
        numTest1_btn_15 = new javax.swing.JButton();
        numTest1_btn_11 = new javax.swing.JButton();
        spacer = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();

        setAutoscrolls(true);

        numTestPanel1.setBackground(Color.LIGHT_GRAY);
        numTestPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numTest1_btn_2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_2.setText("2");
        numTest1_btn_2.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_2ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 385, -1, -1));

        numTest1_btn_10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_10.setText("10");
        numTest1_btn_10.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_10ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        numTest1_btn_6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_6.setText("6");
        numTest1_btn_6.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_6ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 490, -1, -1));

        numTest1_btn_8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_8.setText("8");
        numTest1_btn_8.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_8ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 280, -1, -1));

        numTest1_btn_13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_13.setText("13");
        numTest1_btn_13.setAlignmentY(0.0F);
        numTest1_btn_13.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_13ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 280, -1, -1));

        numTest1_btn_20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_20.setText("20");
        numTest1_btn_20.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_20ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 385, -1, -1));

        numTest1_btn_19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_19.setText("19");
        numTest1_btn_19.setAlignmentY(0.0F);
        numTest1_btn_19.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_19ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 175, -1, -1));

        numTest1_btn_16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_16.setText("16");
        numTest1_btn_16.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_16ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 385, -1, -1));

        numTest1_btn_17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_17.setText("17");
        numTest1_btn_17.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_17ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        numTest1_btn_21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_21.setText("21");
        numTest1_btn_21.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_21ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 175, -1, -1));

        numTest1_btn_22.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_22.setText("22");
        numTest1_btn_22.setAlignmentY(0.0F);
        numTest1_btn_22.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_22ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 280, -1, -1));

        numTest1_btn_23.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_23.setText("23");
        numTest1_btn_23.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_23ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 490, 101, -1));

        numTest1_btn_25.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_25.setText("25");
        numTest1_btn_25.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_25ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_25, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 175, -1, -1));

        labelTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitle.setText("Numbers Test");
        numTestPanel1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 11, 168, 34));

        numTest1_btn_3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_3.setText("3");
        numTest1_btn_3.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_3ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 70, -1, -1));

        numTest1_btn_1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_1.setText("1");
        numTest1_btn_1.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_1ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 175, -1, -1));

        numTest1_btn_5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_5.setText("5");
        numTest1_btn_5.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_5ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 175, -1, -1));

        numTest1_btn_12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_12.setText("12");
        numTest1_btn_12.setAlignmentY(0.0F);
        numTest1_btn_12.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_12ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 70, -1, -1));

        numTest1_btn_4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_4.setText("4");
        numTest1_btn_4.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_4ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 385, 98, -1));

        numTest1_btn_18.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_18.setText("18");
        numTest1_btn_18.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_18ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        numTest1_btn_7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_7.setText("7");
        numTest1_btn_7.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_7ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 70, -1, -1));

        numTest1_btn_14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_14.setText("14");
        numTest1_btn_14.setAlignmentY(0.0F);
        numTest1_btn_14.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_14ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        numTest1_btn_24.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_24.setText("24");
        numTest1_btn_24.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_24ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_24, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        numTest1_btn_9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_9.setText("9");
        numTest1_btn_9.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_9ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 490, -1, -1));

        numTest1_btn_15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_15.setText("15");
        numTest1_btn_15.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_15ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        numTest1_btn_11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numTest1_btn_11.setText("11");
        numTest1_btn_11.setPreferredSize(new java.awt.Dimension(100, 100));
        numTest1_btn_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTest1_btn_11ActionPerformed(evt);
            }
        });
        numTestPanel1.add(numTest1_btn_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 385, -1, -1));
        numTestPanel1.add(spacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 30, 20));

        errorLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numTestPanel1.add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 320, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(numTestPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(numTestPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void numTest1_btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_2ActionPerformed
        // TODO add your handling code here:
        checkNumber(2);
    }//GEN-LAST:event_numTest1_btn_2ActionPerformed

    private void numTest1_btn_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_10ActionPerformed
        // TODO add your handling code here:
        checkNumber(10);
    }//GEN-LAST:event_numTest1_btn_10ActionPerformed

    private void numTest1_btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_6ActionPerformed
        // TODO add your handling code here:
        checkNumber(6);
    }//GEN-LAST:event_numTest1_btn_6ActionPerformed

    private void numTest1_btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_8ActionPerformed
        // TODO add your handling code here:
        checkNumber(8);
    }//GEN-LAST:event_numTest1_btn_8ActionPerformed

    private void numTest1_btn_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_13ActionPerformed
        // TODO add your handling code here:
        checkNumber(13);
    }//GEN-LAST:event_numTest1_btn_13ActionPerformed

    private void numTest1_btn_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_20ActionPerformed
        // TODO add your handling code here:
        checkNumber(20);
    }//GEN-LAST:event_numTest1_btn_20ActionPerformed

    private void numTest1_btn_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_19ActionPerformed
        // TODO add your handling code here:
        checkNumber(19);
    }//GEN-LAST:event_numTest1_btn_19ActionPerformed

    private void numTest1_btn_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_16ActionPerformed
        // TODO add your handling code here:
        checkNumber(16);
    }//GEN-LAST:event_numTest1_btn_16ActionPerformed

    private void numTest1_btn_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_17ActionPerformed
        // TODO add your handling code here:
        checkNumber(17);
    }//GEN-LAST:event_numTest1_btn_17ActionPerformed

    private void numTest1_btn_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_21ActionPerformed
        // TODO add your handling code here:
        checkNumber(21);
    }//GEN-LAST:event_numTest1_btn_21ActionPerformed

    private void numTest1_btn_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_22ActionPerformed
        // TODO add your handling code here:
        checkNumber(22);
    }//GEN-LAST:event_numTest1_btn_22ActionPerformed

    private void numTest1_btn_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_23ActionPerformed
        // TODO add your handling code here:
        checkNumber(23);
    }//GEN-LAST:event_numTest1_btn_23ActionPerformed

    private void numTest1_btn_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_25ActionPerformed
        // TODO add your handling code here:
        checkNumber(25);
    }//GEN-LAST:event_numTest1_btn_25ActionPerformed

    private void numTest1_btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_3ActionPerformed
        // TODO add your handling code here:
        checkNumber(3);
    }//GEN-LAST:event_numTest1_btn_3ActionPerformed

    private void numTest1_btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_1ActionPerformed
        // TODO add your handling code here:
        checkNumber(1);
    }//GEN-LAST:event_numTest1_btn_1ActionPerformed

    private void numTest1_btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_5ActionPerformed
        // TODO add your handling code here:
        checkNumber(5);
    }//GEN-LAST:event_numTest1_btn_5ActionPerformed

    private void numTest1_btn_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_12ActionPerformed
        // TODO add your handling code here:
        checkNumber(12);
    }//GEN-LAST:event_numTest1_btn_12ActionPerformed

    private void numTest1_btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_4ActionPerformed
        // TODO add your handling code here:
        checkNumber(4);
    }//GEN-LAST:event_numTest1_btn_4ActionPerformed

    private void numTest1_btn_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_18ActionPerformed
        // TODO add your handling code here:
        checkNumber(18);
    }//GEN-LAST:event_numTest1_btn_18ActionPerformed

    private void numTest1_btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_7ActionPerformed
        // TODO add your handling code here:
        checkNumber(7);
    }//GEN-LAST:event_numTest1_btn_7ActionPerformed

    private void numTest1_btn_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_14ActionPerformed
        // TODO add your handling code here:
        checkNumber(14);
    }//GEN-LAST:event_numTest1_btn_14ActionPerformed

    private void numTest1_btn_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_24ActionPerformed
        // TODO add your handling code here:
        checkNumber(24);
    }//GEN-LAST:event_numTest1_btn_24ActionPerformed

    private void numTest1_btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_9ActionPerformed
        // TODO add your handling code here:
        checkNumber(9);
    }//GEN-LAST:event_numTest1_btn_9ActionPerformed

    private void numTest1_btn_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_15ActionPerformed
        // TODO add your handling code here:
        checkNumber(15);
    }//GEN-LAST:event_numTest1_btn_15ActionPerformed

    private void numTest1_btn_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTest1_btn_11ActionPerformed
        // TODO add your handling code here:
        checkNumber(11);
    }//GEN-LAST:event_numTest1_btn_11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JButton numTest1_btn_1;
    private javax.swing.JButton numTest1_btn_10;
    private javax.swing.JButton numTest1_btn_11;
    private javax.swing.JButton numTest1_btn_12;
    private javax.swing.JButton numTest1_btn_13;
    private javax.swing.JButton numTest1_btn_14;
    private javax.swing.JButton numTest1_btn_15;
    private javax.swing.JButton numTest1_btn_16;
    private javax.swing.JButton numTest1_btn_17;
    private javax.swing.JButton numTest1_btn_18;
    private javax.swing.JButton numTest1_btn_19;
    private javax.swing.JButton numTest1_btn_2;
    private javax.swing.JButton numTest1_btn_20;
    private javax.swing.JButton numTest1_btn_21;
    private javax.swing.JButton numTest1_btn_22;
    private javax.swing.JButton numTest1_btn_23;
    private javax.swing.JButton numTest1_btn_24;
    private javax.swing.JButton numTest1_btn_25;
    private javax.swing.JButton numTest1_btn_3;
    private javax.swing.JButton numTest1_btn_4;
    private javax.swing.JButton numTest1_btn_5;
    private javax.swing.JButton numTest1_btn_6;
    private javax.swing.JButton numTest1_btn_7;
    private javax.swing.JButton numTest1_btn_8;
    private javax.swing.JButton numTest1_btn_9;
    private javax.swing.JPanel numTestPanel1;
    private javax.swing.JLabel spacer;
    // End of variables declaration//GEN-END:variables
}
