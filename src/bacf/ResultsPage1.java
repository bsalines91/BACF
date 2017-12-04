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
 * This class represents the results recorded from the 25
 * Numbers Test.
 *
 * @author Brandon Salines
 * @author Anthony Eannarino
 * @author Brian Faria
 */
public class ResultsPage1 extends ExaminerPage {
    public static final int ID = 26;
    
    /**
     * Creates the page
     * @param c A reference to the Controller Object
     */
    public ResultsPage1(Controller c) {
        super(c);
        super.setBackground(DEFAULT);
        initComponents();
        panelResults1.setBackground(DEFAULT);
        this.setPreviousPage(RecallTest5.ID);
        this.setNextPage(ResultsPage2.ID);
        this.setTest(panelResults1);
        this.setEnabledStart(false);
    }
    
    /**
     * Populates the table with the results from the database.
     */
    public void populateTable() {
        int[] times = this.getController().getDatabase().getNumbersTest(
                          this.getController().getPatID());
        labelTime1.setText("" + times[1]);
        labelTime2.setText("" + times[2]);
        labelTime3.setText("" + times[3]);
        labelTime4.setText("" + times[4]);
        labelTime5.setText("" + times[5]);
        
        labelTotalTime.setText("" +
                (times[1] + times[2] + times[3] + times[4] + times[5]));
        
        int[] scores = getScores(times);
        labelScore1a.setText("" + scores[0]);
        labelScore1b.setText("" + scores[0]);
        labelScore2a.setText("" + scores[1]);
        labelScore2b.setText("" + scores[1]);
        labelScore3a.setText("" + scores[2]);
        labelScore3b.setText("" + scores[2]);
        labelScore4a.setText("" + scores[3]);
        labelScore4b.setText("" + scores[3]);
        labelScore5a.setText("" + scores[4]);
        labelScore5b.setText("" + scores[4]);
        
        labelTotalIndex1.setText("" +
                (scores[0] + scores[1] + scores[2] + scores[3] + scores[4]));
        labelTotalIndex2.setText("" +
                (scores[0] + scores[1] + scores[2] + scores[3] + scores[4]));
    }
    
    /**
     * Generates an array containing the appropriate scores for the
     * given times.
     * @param times The times in seconds of the duration of each Numbers Test.
     * @return An int array containing the points for each Test.
     */
    private int[] getScores(int[] times) {
        int[] scores = new int[5];
        int score = 0;
        
        for (int i = 1; i < times.length; i++) {
            if (times[i] <= 0) {
                score = 0;
            }
            else if (times[i] <= 35) {
                score = 2;
            }
            else {
                score = 1;
            }
            scores[i-1] = score;
        }
        
        return scores;
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        panelResults1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelTime1 = new javax.swing.JLabel();
        labelTime2 = new javax.swing.JLabel();
        labelTime3 = new javax.swing.JLabel();
        labelTime4 = new javax.swing.JLabel();
        labelTime5 = new javax.swing.JLabel();
        labelScore1b = new javax.swing.JLabel();
        labelScore2a = new javax.swing.JLabel();
        labelScore3a = new javax.swing.JLabel();
        labelScore4a = new javax.swing.JLabel();
        labelScore5a = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        labelTotalTime = new javax.swing.JLabel();
        labelScore3b = new javax.swing.JLabel();
        labelScore4b = new javax.swing.JLabel();
        labelScore5b = new javax.swing.JLabel();
        labelScore2b = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        labelScore1a = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        labelTotalIndex1 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        labelTotalIndex2 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Score");

        panelResults1.setBackground(Color.LIGHT_GRAY);
        panelResults1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        labelTitle.setText("Results Page: 25 Numbers Test");
        panelResults1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 34));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Time (sec.)");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelResults1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 80, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("# of tables");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelResults1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 60, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Examinee's productivity");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelResults1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 120, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Score");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelResults1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("sensorimotor reaction time");
        panelResults1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 170, 20));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("2");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setOpaque(true);
        panelResults1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 60, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("3");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setOpaque(true);
        panelResults1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 60, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("4");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setOpaque(true);
        panelResults1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 60, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("5");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setOpaque(true);
        panelResults1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 60, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("1");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.setOpaque(true);
        panelResults1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 60, 30));

        labelTime1.setBackground(new java.awt.Color(255, 255, 255));
        labelTime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTime1.setText("0");
        labelTime1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelTime1.setOpaque(true);
        panelResults1.add(labelTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 80, 30));

        labelTime2.setBackground(new java.awt.Color(255, 255, 255));
        labelTime2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTime2.setText("0");
        labelTime2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelTime2.setOpaque(true);
        panelResults1.add(labelTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 80, 30));

        labelTime3.setBackground(new java.awt.Color(255, 255, 255));
        labelTime3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTime3.setText("0");
        labelTime3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelTime3.setOpaque(true);
        panelResults1.add(labelTime3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 80, 30));

        labelTime4.setBackground(new java.awt.Color(255, 255, 255));
        labelTime4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTime4.setText("0");
        labelTime4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelTime4.setOpaque(true);
        panelResults1.add(labelTime4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 80, 30));

        labelTime5.setBackground(new java.awt.Color(255, 255, 255));
        labelTime5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTime5.setText("0");
        labelTime5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelTime5.setOpaque(true);
        panelResults1.add(labelTime5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 80, 30));

        labelScore1b.setBackground(new java.awt.Color(255, 255, 255));
        labelScore1b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelScore1b.setText("0");
        labelScore1b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelScore1b.setOpaque(true);
        panelResults1.add(labelScore1b, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 120, 30));

        labelScore2a.setBackground(new java.awt.Color(255, 255, 255));
        labelScore2a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelScore2a.setText("0");
        labelScore2a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelScore2a.setOpaque(true);
        panelResults1.add(labelScore2a, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 90, 30));

        labelScore3a.setBackground(new java.awt.Color(255, 255, 255));
        labelScore3a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelScore3a.setText("0");
        labelScore3a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelScore3a.setOpaque(true);
        panelResults1.add(labelScore3a, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 90, 30));

        labelScore4a.setBackground(new java.awt.Color(255, 255, 255));
        labelScore4a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelScore4a.setText("0");
        labelScore4a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelScore4a.setOpaque(true);
        panelResults1.add(labelScore4a, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 90, 30));

        labelScore5a.setBackground(new java.awt.Color(255, 255, 255));
        labelScore5a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelScore5a.setText("0");
        labelScore5a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelScore5a.setOpaque(true);
        panelResults1.add(labelScore5a, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 90, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Examinee's tempo of");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelResults1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 170, 50));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText(" Time");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelResults1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 50, 20));

        labelTotalTime.setBackground(new java.awt.Color(255, 255, 255));
        labelTotalTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotalTime.setText("0");
        labelTotalTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelTotalTime.setOpaque(true);
        panelResults1.add(labelTotalTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 40, 20));

        labelScore3b.setBackground(new java.awt.Color(255, 255, 255));
        labelScore3b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelScore3b.setText("0");
        labelScore3b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelScore3b.setOpaque(true);
        panelResults1.add(labelScore3b, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 120, 30));

        labelScore4b.setBackground(new java.awt.Color(255, 255, 255));
        labelScore4b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelScore4b.setText("0");
        labelScore4b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelScore4b.setOpaque(true);
        panelResults1.add(labelScore4b, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 120, 30));

        labelScore5b.setBackground(new java.awt.Color(255, 255, 255));
        labelScore5b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelScore5b.setText("0");
        labelScore5b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelScore5b.setOpaque(true);
        panelResults1.add(labelScore5b, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 120, 30));

        labelScore2b.setBackground(new java.awt.Color(255, 255, 255));
        labelScore2b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelScore2b.setText("0");
        labelScore2b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelScore2b.setOpaque(true);
        panelResults1.add(labelScore2b, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 120, 30));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("of attention");
        panelResults1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 120, 20));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Score");
        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelResults1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 120, 30));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel55.setText(" Total");
        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel55.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelResults1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 80, 40));

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("- trials");
        jLabel56.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelResults1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 60, 20));

        labelScore1a.setBackground(new java.awt.Color(255, 255, 255));
        labelScore1a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelScore1a.setText("0");
        labelScore1a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelScore1a.setOpaque(true);
        panelResults1.add(labelScore1a, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 90, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText(" Index");
        jLabel29.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelResults1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 50, 20));

        labelTotalIndex1.setBackground(new java.awt.Color(255, 255, 255));
        labelTotalIndex1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotalIndex1.setText("0");
        labelTotalIndex1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelTotalIndex1.setOpaque(true);
        panelResults1.add(labelTotalIndex1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 40, 20));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel60.setText(" Total");
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel60.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelResults1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 90, 40));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText(" Index");
        jLabel35.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelResults1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 50, 20));

        labelTotalIndex2.setBackground(new java.awt.Color(255, 255, 255));
        labelTotalIndex2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotalIndex2.setText("0");
        labelTotalIndex2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelTotalIndex2.setOpaque(true);
        panelResults1.add(labelTotalIndex2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 40, 20));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel61.setText(" Total");
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel61.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelResults1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelResults1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelResults1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelScore1a;
    private javax.swing.JLabel labelScore1b;
    private javax.swing.JLabel labelScore2a;
    private javax.swing.JLabel labelScore2b;
    private javax.swing.JLabel labelScore3a;
    private javax.swing.JLabel labelScore3b;
    private javax.swing.JLabel labelScore4a;
    private javax.swing.JLabel labelScore4b;
    private javax.swing.JLabel labelScore5a;
    private javax.swing.JLabel labelScore5b;
    private javax.swing.JLabel labelTime1;
    private javax.swing.JLabel labelTime2;
    private javax.swing.JLabel labelTime3;
    private javax.swing.JLabel labelTime4;
    private javax.swing.JLabel labelTime5;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTotalIndex1;
    private javax.swing.JLabel labelTotalIndex2;
    private javax.swing.JLabel labelTotalTime;
    private javax.swing.JPanel panelResults1;
    // End of variables declaration//GEN-END:variables
}
