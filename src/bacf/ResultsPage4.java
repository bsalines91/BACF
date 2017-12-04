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
 * This page represents the results recorded from the
 * Generalization test.
 *
 * @author Brandon Salines
 * @author Anthony Eannarino
 * @author Brian Faria
 */
public class ResultsPage4 extends ExaminerPage {
    public static final int ID = 29;
    
    /**
     * Creates the page
     * @param c A reference to the Controller Object
     */
    public ResultsPage4(Controller c) {
        super(c);
        super.setBackground(DEFAULT);
        initComponents();
        panelResults4.setBackground(DEFAULT);
        this.setPreviousPage(ResultsPage3.ID);
        this.setNextPage(ResultsPage5.ID);
        this.setTest(panelResults4);
        this.setEnabledStart(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelResults4 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        spacer = new javax.swing.JLabel();
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        R4_assoc5 = new javax.swing.JLabel();
        R4_assoc3 = new javax.swing.JLabel();
        R4_assoc4 = new javax.swing.JLabel();
        R4_assoc2 = new javax.swing.JLabel();
        R4_assoc1 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        panelResults4.setBackground(Color.LIGHT_GRAY);
        panelResults4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        labelTitle.setText(" Results Page:     Generalization Test");
        panelResults4.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 34));
        panelResults4.add(spacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 30, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Of Objects");
        panelResults4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 140, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Set Number");
        panelResults4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Choice");
        panelResults4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 140, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Time (sec)");
        panelResults4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 80, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Score");
        panelResults4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 50, 40));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("2");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setOpaque(true);
        panelResults4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 159, 60, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("3");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setOpaque(true);
        panelResults4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 188, 60, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("4");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setOpaque(true);
        panelResults4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 217, 60, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("5");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setOpaque(true);
        panelResults4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 246, 60, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("1");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.setOpaque(true);
        panelResults4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("B, D, F");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.setOpaque(true);
        panelResults4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 130, 60, 30));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("A, E, F");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel16.setOpaque(true);
        panelResults4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 159, 60, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("A, C, F");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.setOpaque(true);
        panelResults4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 188, 60, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("A, E, F");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel18.setOpaque(true);
        panelResults4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 217, 60, 30));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("A, C, D");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.setOpaque(true);
        panelResults4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 246, 60, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("0");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.setOpaque(true);
        panelResults4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 130, 60, 30));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("0");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel21.setOpaque(true);
        panelResults4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 159, 60, 30));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("0");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel22.setOpaque(true);
        panelResults4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 188, 60, 30));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("0");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.setOpaque(true);
        panelResults4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 217, 60, 30));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("0");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel24.setOpaque(true);
        panelResults4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 246, 60, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Correct");
        panelResults4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, 40));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Choice");
        panelResults4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 140, 40));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Examinee");
        panelResults4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, 40));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Of Objects");
        panelResults4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 140, 40));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("0");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel28.setOpaque(true);
        panelResults4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 130, 60, 30));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("0");
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel29.setOpaque(true);
        panelResults4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 159, 60, 30));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("0");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel30.setOpaque(true);
        panelResults4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 188, 60, 30));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("0");
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel31.setOpaque(true);
        panelResults4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 217, 60, 30));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("0");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel32.setOpaque(true);
        panelResults4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 246, 60, 30));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("0");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel33.setOpaque(true);
        panelResults4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 159, 60, 30));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("0");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel34.setOpaque(true);
        panelResults4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 130, 60, 30));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("0");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel35.setOpaque(true);
        panelResults4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 188, 60, 30));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("0");
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel36.setOpaque(true);
        panelResults4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 217, 60, 30));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("0");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel37.setOpaque(true);
        panelResults4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 246, 60, 30));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("0");
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel38.setOpaque(true);
        panelResults4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 246, 60, 30));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("0");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel39.setOpaque(true);
        panelResults4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 246, 150, 30));

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("0");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel40.setOpaque(true);
        panelResults4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 217, 150, 30));

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("0");
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel41.setOpaque(true);
        panelResults4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 188, 150, 30));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("0");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel42.setOpaque(true);
        panelResults4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 159, 150, 30));

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("0");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel43.setOpaque(true);
        panelResults4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 130, 150, 30));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("0");
        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel44.setOpaque(true);
        panelResults4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 130, 60, 30));

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("0");
        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel45.setOpaque(true);
        panelResults4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 159, 60, 30));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("0");
        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel46.setOpaque(true);
        panelResults4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 188, 60, 30));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("0");
        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel47.setOpaque(true);
        panelResults4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 217, 60, 30));

        R4_assoc5.setBackground(new java.awt.Color(255, 255, 255));
        R4_assoc5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R4_assoc5.setText("0");
        R4_assoc5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R4_assoc5.setOpaque(true);
        panelResults4.add(R4_assoc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 246, 100, 30));

        R4_assoc3.setBackground(new java.awt.Color(255, 255, 255));
        R4_assoc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R4_assoc3.setText("0");
        R4_assoc3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R4_assoc3.setOpaque(true);
        panelResults4.add(R4_assoc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 188, 100, 30));

        R4_assoc4.setBackground(new java.awt.Color(255, 255, 255));
        R4_assoc4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R4_assoc4.setText("0");
        R4_assoc4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R4_assoc4.setOpaque(true);
        panelResults4.add(R4_assoc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 217, 100, 30));

        R4_assoc2.setBackground(new java.awt.Color(255, 255, 255));
        R4_assoc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R4_assoc2.setText("0");
        R4_assoc2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R4_assoc2.setOpaque(true);
        panelResults4.add(R4_assoc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 159, 100, 30));

        R4_assoc1.setBackground(new java.awt.Color(255, 255, 255));
        R4_assoc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R4_assoc1.setText("0");
        R4_assoc1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R4_assoc1.setOpaque(true);
        panelResults4.add(R4_assoc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 130, 100, 30));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Verbal Reason for Generalization");
        panelResults4.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, 40));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Score");
        panelResults4.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 40));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Form");
        panelResults4.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 140, 40));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Of Association");
        panelResults4.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 140, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Generalization Time");
        panelResults4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 110, 60));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Examinee tempo of");
        panelResults4.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 110, 40));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("and Form of Associative Processes");
        panelResults4.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 280, 80));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Examinee Productivity of Generalizing Operations");
        panelResults4.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 270, 100));

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel62.setOpaque(true);
        panelResults4.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 51, 119, 80));

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel63.setOpaque(true);
        panelResults4.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 51, 424, 80));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);
        panelResults4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 91, 178, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelResults4, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelResults4, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel R4_assoc1;
    private javax.swing.JLabel R4_assoc2;
    private javax.swing.JLabel R4_assoc3;
    private javax.swing.JLabel R4_assoc4;
    private javax.swing.JLabel R4_assoc5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelResults4;
    private javax.swing.JLabel spacer;
    // End of variables declaration//GEN-END:variables
}
