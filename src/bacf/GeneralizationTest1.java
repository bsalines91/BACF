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

/**
 * This class represents the first Generalization Test page.
 *
 * @author Brandon Salines
 * @author Anthony Eannarino
 * @author Brian Faria
 */
public class GeneralizationTest1 extends ExaminerPage {
    public static final int ID = 16;
    int counter;
    int genCounter;
    
    /**
     * Creates the page.
     * @param c A reference to the Controller Object
     */
    public GeneralizationTest1(Controller c) {
        super(c);
        initComponents();
        counter = 1;
        genCounter = 1;
        reasonlbl.setVisible(false);
        reasonText.setVisible(false);
        panelGeneralization1.setBackground(DEFAULT);
        this.setPreviousPage(ExclusionTest5.ID);
        this.setNextPage(GeneralizationTest2.ID);
        this.setTest(panelGeneralization1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneralization1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        spacer = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        genTestBtn1b = new javax.swing.JButton();
        reasonText = new javax.swing.JTextField();
        reasonlbl = new javax.swing.JLabel();
        genTestBtn1c = new javax.swing.JButton();
        genTestBtn1a = new javax.swing.JButton();
        genTestBtn1d = new javax.swing.JButton();
        genTestBtn1e = new javax.swing.JButton();
        genTestBtn1f = new javax.swing.JButton();

        panelGeneralization1.setBackground(Color.LIGHT_GRAY);
        panelGeneralization1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitle.setText("Generalization Test");
        panelGeneralization1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 25, 220, 34));
        panelGeneralization1.add(spacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 30, 20));

        errorLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(204, 0, 0));
        panelGeneralization1.add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 320, 30));

        genTestBtn1b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/GenTestpic1b.png"))); // NOI18N
        genTestBtn1b.setBorderPainted(false);
        genTestBtn1b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genTestBtn1bActionPerformed(evt);
            }
        });
        panelGeneralization1.add(genTestBtn1b, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 140, 177));

        reasonText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reasonTextActionPerformed(evt);
            }
        });
        panelGeneralization1.add(reasonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 410, 40));

        reasonlbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reasonlbl.setText("Reasoning:");
        panelGeneralization1.add(reasonlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 564, 110, 30));

        genTestBtn1c.setForeground(new java.awt.Color(240, 240, 240));
        genTestBtn1c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/GenTestpic1c.png"))); // NOI18N
        genTestBtn1c.setBorderPainted(false);
        genTestBtn1c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genTestBtn1cActionPerformed(evt);
            }
        });
        panelGeneralization1.add(genTestBtn1c, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 140, 140, 177));

        genTestBtn1a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/GenTestpic1a.png"))); // NOI18N
        genTestBtn1a.setBorderPainted(false);
        genTestBtn1a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genTestBtn1aActionPerformed(evt);
            }
        });
        panelGeneralization1.add(genTestBtn1a, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 140, 140, 177));

        genTestBtn1d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/GenTestpic1d.png"))); // NOI18N
        genTestBtn1d.setBorderPainted(false);
        genTestBtn1d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genTestBtn1dActionPerformed(evt);
            }
        });
        panelGeneralization1.add(genTestBtn1d, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 313, 140, 177));

        genTestBtn1e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/GenTestpic1e.png"))); // NOI18N
        genTestBtn1e.setBorderPainted(false);
        genTestBtn1e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genTestBtn1eActionPerformed(evt);
            }
        });
        panelGeneralization1.add(genTestBtn1e, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 313, 140, 177));

        genTestBtn1f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/GenTestpic1f.png"))); // NOI18N
        genTestBtn1f.setBorderPainted(false);
        genTestBtn1f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genTestBtn1fActionPerformed(evt);
            }
        });
        panelGeneralization1.add(genTestBtn1f, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 313, 140, 177));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneralization1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGeneralization1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void genTestBtn1bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genTestBtn1bActionPerformed
        // TODO add your handling code here:
        if(genCounter==3 && testStarted == true){
        errorLabel.setText("");
        myTimer.stop();
        reasonlbl.setVisible(true);
        reasonText.setVisible(true);
        }
        else if(testStarted == false){
            errorLabel.setText("Press Start to begin the test.");
        }
        else{
            genCounter++;
        }
    }//GEN-LAST:event_genTestBtn1bActionPerformed

    private void reasonTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reasonTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reasonTextActionPerformed

    private void genTestBtn1cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genTestBtn1cActionPerformed
        // TODO add your handling code here:
        if(genCounter==3 && testStarted == true){
        errorLabel.setText("");
        myTimer.stop();
        reasonlbl.setVisible(true);
        reasonText.setVisible(true);
        }
        else if(testStarted == false){
            errorLabel.setText("Press Start to begin the test.");
        }
        else{
            genCounter++;
        }
    }//GEN-LAST:event_genTestBtn1cActionPerformed

    private void genTestBtn1aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genTestBtn1aActionPerformed
        // TODO add your handling code here:
        if(genCounter==3 && testStarted == true){
        errorLabel.setText("");
        myTimer.stop();
        reasonlbl.setVisible(true);
        reasonText.setVisible(true);
        }
        else if(testStarted == false){
            errorLabel.setText("Press Start to begin the test.");
        }
        else{
            genCounter++;
        }
    }//GEN-LAST:event_genTestBtn1aActionPerformed

    private void genTestBtn1dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genTestBtn1dActionPerformed
        // TODO add your handling code here:
        if(genCounter==3 && testStarted == true){
        errorLabel.setText("");
        myTimer.stop();
        reasonlbl.setVisible(true);
        reasonText.setVisible(true);
        }
        else if(testStarted == false){
            errorLabel.setText("Press Start to begin the test.");
        }
        else{
            genCounter++;
        }
    }//GEN-LAST:event_genTestBtn1dActionPerformed

    private void genTestBtn1eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genTestBtn1eActionPerformed
        // TODO add your handling code here:
        if(genCounter==3 && testStarted == true){
        errorLabel.setText("");
        myTimer.stop();
        reasonlbl.setVisible(true);
        reasonText.setVisible(true);
        }
        else if(testStarted == false){
            errorLabel.setText("Press Start to begin the test.");
        }
        else{
            genCounter++;
        }
    }//GEN-LAST:event_genTestBtn1eActionPerformed

    private void genTestBtn1fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genTestBtn1fActionPerformed
        // TODO add your handling code here:
        if(genCounter==3 && testStarted == true){
        errorLabel.setText("");
        myTimer.stop();
        reasonlbl.setVisible(true);
        reasonText.setVisible(true);
        }
        else if(testStarted == false){
            errorLabel.setText("Press Start to begin the test.");
        }
        else{
            genCounter++;
        }
    }//GEN-LAST:event_genTestBtn1fActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton genTestBtn1a;
    private javax.swing.JButton genTestBtn1b;
    private javax.swing.JButton genTestBtn1c;
    private javax.swing.JButton genTestBtn1d;
    private javax.swing.JButton genTestBtn1e;
    private javax.swing.JButton genTestBtn1f;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelGeneralization1;
    private javax.swing.JTextField reasonText;
    private javax.swing.JLabel reasonlbl;
    private javax.swing.JLabel spacer;
    // End of variables declaration//GEN-END:variables
}
