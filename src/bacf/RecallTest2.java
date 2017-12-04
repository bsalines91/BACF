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
 * This class represents the second Recall Test page.
 *
 * @author Brandon Salines
 * @author Anthony Eannarino
 * @author Brian Faria
 */
public class RecallTest2 extends ExaminerPage {
    public static final int ID = 22;
    int counter;
    
    
    /**
     * Creates the page
     * @param c A reference to the Controller Object
     */
    public RecallTest2(Controller c) {
        super(c);
        initComponents();
        counter = 1;
        recallText2.setVisible(false);
        panelRecall2.setBackground(DEFAULT);
        this.setPreviousPage(RecallTest1.ID);
        this.setNextPage(RecallTest3.ID);
        this.setTest(panelRecall2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRecall2 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        spacer = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        buttonLetterCarrier = new javax.swing.JButton();
        recallText2 = new javax.swing.JTextField();

        panelRecall2.setBackground(Color.LIGHT_GRAY);
        panelRecall2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitle.setText("Recall Test");
        panelRecall2.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 25, 160, 34));
        panelRecall2.add(spacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 30, 20));

        errorLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(204, 0, 0));
        panelRecall2.add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 320, 30));

        buttonLetterCarrier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacf/pictures/recalTestpic2.png"))); // NOI18N
        buttonLetterCarrier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetterCarrierActionPerformed(evt);
            }
        });
        panelRecall2.add(buttonLetterCarrier, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 350, 322));

        recallText2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        recallText2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        recallText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recallText2ActionPerformed(evt);
            }
        });
        panelRecall2.add(recallText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 350, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRecall2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRecall2, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLetterCarrierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetterCarrierActionPerformed
    }//GEN-LAST:event_buttonLetterCarrierActionPerformed

    private void recallText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recallText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recallText2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLetterCarrier;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelRecall2;
    private javax.swing.JTextField recallText2;
    private javax.swing.JLabel spacer;
    // End of variables declaration//GEN-END:variables
}