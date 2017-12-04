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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

/**
 * This page is a template that includes side buttons for use
 * on the pages (Start, Previous, and Next). It also contains
 * variables for handling the Timer and page ID's.
 *
 * @author Brandon Salines
 * @author Anthony Eannarino
 * @author Brian Faria
 */
public class ExaminerPage extends Page {
    
    private GridBagLayout layout;
    private GridBagConstraints c;
    private ButtonPanel buttonArea;
    int secondsPassed = 0;
    int minutesPassed = 0;
    int finalTime = 0; // in seconds
    public Timer myTimer;
    public boolean testStarted = false;
    public boolean testComplete = false;
    
    private int nextPage;
    private int previousPage;
    private boolean isEnabledButtons = true;
    
    /**
     * Creates the template.
     * @param c A reference to the Controller object
     */
    public ExaminerPage (Controller c) {
        super(c);
    }
    
    /**
     * Enables/Disables the included panel that contains the
     * Start, Previous, and Next buttons. If disabling buttons,
     * call before setTest().
     * @param status A boolean value representing the visibility of the buttons.
     */
    public void setEnabledButtons(boolean status) {
        isEnabledButtons = status;
    }
    
    /**
     * Loads the given panel with the side buttons
     * @param testPage The panel to be loaded.
     */
    public void setTest(JPanel testPage) {
        this.layout = new GridBagLayout();
        this.setLayout(this.layout);
        this.c = new GridBagConstraints();
        this.c.fill = GridBagConstraints.HORIZONTAL;
        
        // Add test page passed as argument to panel
        this.c.gridx = 0;
        this.c.gridy = 0;
        this.layout.setConstraints(testPage, this.c);
        this.add(testPage);
        
        // Create button area on right-hand side
        if (isEnabledButtons) {
            this.buttonArea = new ButtonPanel(this.getController(), this);
            this.buttonArea.setBackground(DEFAULT);
        
            // Add button area to panel
            this.c.gridx = 1;
            this.c.gridy = 0;
            this.layout.setConstraints(this.buttonArea, this.c);
            this.add(this.buttonArea);
        }
    }
    
    /**
     * Enables/Disables the Start button. If disabling the start button,
     * call after setTest().
     * @param status A boolean value representing the visibility of the Start button.
     */
    public void setEnabledStart(boolean status) {
        this.buttonArea.setEnabledStart(status);
    }
    
    /**
     * Sets the page the Next button will show to the one with the
     * given ID.
     * @param id The ID of the page.
     */
    public void setNextPage(int id) {
        this.nextPage = id;
    }
    
    /**
     * Sets the page the Previous button will show to the one with the
     * given ID
     * @param id The id of the page. 
     */
    public void setPreviousPage(int id) {
        this.previousPage = id;
    }
    
    /**
     * @return The ID of the next page to show.
     */
    public int getNextPage() {
        return this.nextPage;
    }
    
    /**
     * @return The ID of the previous page to show.
     */
    public int getPreviousPage() {
        return this.previousPage;
    }
    
    /**
     * Stops the timer and calculates the final time of the test.
     */
    public void stopTimer() {
        if (testStarted) {
            myTimer.stop();
            if (testComplete) {
                finalTime = (minutesPassed * 60) + secondsPassed;
            }
            else {
                finalTime = 0;
            }
        }
    }
    
    /**
     * Overrides method in Page class. Resets the timer for re-taking the test.
     */
    @Override
    public void prepPage() {
        testStarted = false;
        testComplete = false;
        finalTime = 0;
    }
    
    /**
     * Called when the Start button is clicked. Starts the timer.
     */
    public void startTest() {
        if(testStarted==false){
            testStarted=true;
            secondsPassed = 0;
            minutesPassed = 0;
            myTimer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    secondsPassed++;
                    if (secondsPassed>=60){
                        minutesPassed++;
                        secondsPassed=0;
                    }
                    if(secondsPassed<=9){
                        System.out.println(minutesPassed+ ":0" +secondsPassed);  
                    }
                    else {
                        System.out.println(minutesPassed+ ":" +secondsPassed);
                    }
                }
            });
            myTimer.start();
        }
    }   
}
