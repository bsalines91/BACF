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

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 * This class is the controller for page transitions, connecting to the
 * database, and storing the pages for use.
 *
 * @author Brandon Salines
 * @author Anthony Eannarino
 * @author Brian Faria
 */
public class Controller extends JFrame implements WindowListener {
    
    private CardLayout layout; 
    private JPanel container;
    private Page[] pages;
    private final Database data;
    private int patID; // The id of the patient in the database
    
    public Controller () {
        this.initComponents();
        data = new Database();
        patID = -1;
    }
   
    /**
     * Creates a Controller object to load the frame, page components,
     * and launches the program.
     * @param args 
     */
    public static void main(String[] args) {
        Controller bacf = new Controller();
        bacf.start();
    }
    
    /**
     * @return The ID of the patient currently taking the test.
     */
    public int getPatID() {
        return this.patID;
    }
    
    /**
     * Stores the ID of the current patient taking the test.
     * @param id 
     */
    public void setPatID(int id) {
        this.patID = id;
    }
    
    /**
     * @param pageID
     * @return Returns the page as a Page object with the given ID.
     */
    public Page getPage(int pageID) {
        return this.pages[pageID - 1];
    }
    
    /**
     * @return The database object.
     */
    public Database getDatabase() {
        return data;
    }
    
    /**
     * Sets frame and container components in order to load all
     * of the pages.
     */
    private void initComponents() {
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // Set App to launch full-screen
        // this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setSize(1024, 768); // Default Size
        this.addWindowListener(this); // Handle user clicking red "x" button
        
        this.layout = new CardLayout();
        this.container = new JPanel(this.layout);
        
        // !!! KEEP PAGES IN ORDER !!! //
        this.pages = new Page[32];
        this.pages[0] = new NeworPrevPatient(this);
        this.pages[1] = new NewPatient(this);
        this.pages[2] = new PrevPatient(this);
        this.pages[3] = new UpdatePatient(this);
        this.pages[4] = new NumbersTest1(this);
        this.pages[5] = new NumbersTest2(this);
        this.pages[6] = new NumbersTest3(this);
        this.pages[7] = new NumbersTest4(this);
        this.pages[8] = new NumbersTest5(this);
        this.pages[9] = new AssociationTest(this);
        this.pages[10] = new ExclusionTest1(this);
        this.pages[11] = new ExclusionTest2(this);
        this.pages[12] = new ExclusionTest3(this);
        this.pages[13] = new ExclusionTest4(this);
        this.pages[14] = new ExclusionTest5(this);
        this.pages[15] = new GeneralizationTest1(this);
        this.pages[16] = new GeneralizationTest2(this);
        this.pages[17] = new GeneralizationTest3(this);
        this.pages[18] = new GeneralizationTest4(this);
        this.pages[19] = new GeneralizationTest5(this);
        this.pages[20] = new RecallTest1(this);
        this.pages[21] = new RecallTest2(this);
        this.pages[22] = new RecallTest3(this);
        this.pages[23] = new RecallTest4(this);
        this.pages[24] = new RecallTest5(this);
        this.pages[25] = new ResultsPage1(this); 
        this.pages[26] = new ResultsPage2(this);
        this.pages[27] = new ResultsPage3(this);
        this.pages[28] = new ResultsPage4(this);
        this.pages[29] = new ResultsPage5(this);
        this.pages[30] = new ResultsPage6(this);
        this.pages[31] = new ResultsPage7(this);
        
        // Add pages to containter
        for (int i = 1; i <= this.pages.length; i++) {
            this.container.add(pages[i-1], ""+i);
        }
        
        this.setContentPane(this.container);
        this.setVisible(true);
    }
    
    /**
     * Shows the main page.
     */
    public void start() {
        showPage(NeworPrevPatient.ID);
    }
    
    /**
     * Displays the page with the specified ID.
     * @param pageID The ID of the page to be shown.
     */
    public void showPage(int pageID) {
        if (pageID == NeworPrevPatient.ID) {
            for (Page page : this.pages) {
                page.prepPage();
            }
            this.setPatID(-1); // No patient exists at start.
        }
        this.layout.show(this.container, "" + pageID);
    }
    
    /**
     * Closes the database connection and exits the program.
     */
    public void exit() {
        this.data.shutdown();
        System.exit(0);
    }
    
    /**
     * Displays a confirmation box before exiting the program. 
     * @param e The WindowEvent object
     */
    @Override
    public void windowClosing(WindowEvent e) {
        String message = "Are you sure you want to exit?";
        int buttonOption = JOptionPane.YES_NO_OPTION;
        int confirmClose = JOptionPane.showConfirmDialog(this, message, "Exit", buttonOption);
        if (confirmClose == JOptionPane.YES_OPTION) {
            this.exit();
        }
    }
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    
}
