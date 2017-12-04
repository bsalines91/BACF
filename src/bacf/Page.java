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

import javax.swing.JPanel;
import java.awt.Color;

/**
 * This is a superclass for all pages created. It holds a reference to the
 * Controller class and has the necessary methods for updating and prepping
 * the pages/database.
 *
 * @author Brandon Salines
 * @author Anthony Eannarino
 * @author Brian Faria
 */
public class Page extends JPanel {
    public static final Color DEFAULT = new Color(78, 165, 217); // BACF Blue
    private final Controller controller;
    
    /**
     * Creates a template for a page.
     * @param me 
     */
    public Page(Controller me) {
        this.controller = me;
        this.setBackground(DEFAULT);
    }
    
    /**
     * @return A reference to the Controller object.
     */
    public Controller getController() {
        return this.controller;
    }
    
    /**
     * This method is used to update pages and the database.
     */
    public void performUpdate() {
        System.out.println("Perform update");
    }
    
    /**
     * This method is used to prep or reset a page for use.
     */
    public void prepPage() {
        System.out.println("Page Loaded.");
    }
}
