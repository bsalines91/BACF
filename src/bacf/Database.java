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

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Date;

/**
 * Represents a connection with the bacfDatabase using derby.
 * 
 * @author Brandon Salines
 * @author Anthony Eannarino
 * @author Brian Faria
 */
public class Database{

    Connection myconObj;
    Statement stm;
    String dbURL;

    //Patient information variables
    int id;
    String fName;
    String lName;
    Date dob;
    String gender;
    String education;
    String occupation;
    int age;
    Date currDate;
    String location;
    String examiner;

    //Numbers Test Variables
    int numId;
    int time1;
    int time2;
    int time3;
    int time4;
    int time5;
    String columnName;

    //Picture and Symbols Test Part 1
    int picId;
    String pChoice1, pChoice2, pChoice3, pChoice4, pChoice5, eChoice1 = "C",
            eChoice2 = "H", eChoice3 = "I", eChoice4 = "E", eChoice5 = "F";

    //Exclusion Test Variables
    String exclusionChoice1P, exclusionChoice2P, exclusionChoice3P, exclusionChoice4P,
            exclusionChoice5P, exclusionChoice1E, exclusionChoice2E, exclusionChoice3E,
            exclusionChoice4E, exclusionChoice5E, eAssociation1, eAssociation2, eAssociation3,
            eAssociation4, eAssociation5, eReason1, eReason2, eReason3, eReason4, eReason5;

    Integer exId, eTime1, eTime2, eTime3, eTime4, eTime5;

    //Generalization test variables
    String generalChoice1P, generalChoice2P, generalChoice3P, generalChoice4P,
            generalChoice5P, generalChoice1E, generalChoice2E, generalChoice3E,
            generalChoice4E, generalChoice5E, gAssociation1, gAssociation2, gAssociation3,
            gAssociation4, gAssociation5, gReason1, gReason2, gReason3, gReason4, gReason5;

    Integer gId, gTime1, gTime2, gTime3, gTime4, gTime5;

    //Recall test variables
    Integer rId, RecallTime1, RecallTime2, RecallTime3,
            RecallTime4, RecallTime5;
    String P_Recall1, P_Recall2, P_Recall3, P_Recall4, P_Recall5, RecallAssociations1,
            RecallAssociations2, RecallAssociations3, RecallAssociations4, RecallAssociations5;

    //Misc Results variables
    String Behavior1, Behavior2, Behavior3, Behavior4, Behavior5, Pposition1,
            Pposition2, Pposition3, Pposition4, Pposition5, comments;
    int mId;

//    public static void main(String[] args) {
//        Database test = new PatientData();
//
//        //Test's adding a patient (addPatient method)
//        test.addPatient("brandon", "salines", "1991-07-15", "male", "high school", "It", 25, "2017-11-23", "ric", "zack");
//
//        //Test's printing all the patients in the table (getAllPatients method)
//        ArrayList<String[]> results = test.getAllPatients();
//        for (String[] patient : results) {
//            for (String info : patient) {
//                System.out.print(info + "\t");
//            }
//            System.out.println();
//        }
//        //Test's updating a patient (updatePatient method)
//        test.updatePatient(17, "Tradd", "Kon", "1990-12-01", "male", "bachelors", "programmer", 26, "2017-11-20", "RIC", "Mark");
//
//        //Test's printing or getting a single patient (getPatient method)
//        String[] patient = test.getPatient(17);
//        for (int i = 0; i < patient.length; i++) {
//            System.out.print(patient[i] + ", ");
//        }
//        System.out.println();
//
//        //Test's  addeding the first numbers test ( addNumbersTest method)
//        test.addNumbersTest(17, 17);
//
//        //Prints headers for the numbers test (getNumberHeaders)
//        String[] headers = test.getNumberHeaders();
//        System.out.println("Here is the getNumbersHeaders printout:  ");
//        for (int i = 0; i < headers.length; i++) {
//            System.out.print(headers[i] + ", ");
//        }
//        System.out.println();
//
//        //Test's getting the results from the numbers test for a single patient (getNumbersTest)
//        String[] numTest = test.getNumbersTest(17);
//        System.out.println("Here is the getNumberstest:   ");
//        for (int i = 0; i < numTest.length; i++) {
//            System.out.print(numTest[i] + ", ");
//        }
//        System.out.println();
//
//        //Adds the picture test part 1 (addPicP1Test method)
//        test.addPicP1Test(test.pChoice1 = "c", test.pChoice2 = "d", test.pChoice3 = "e",
//                test.pChoice4 = "f", test.pChoice5 = "g", test.picId = 17);
//
//        //Test's getting the results from test 2 for a single patient (getPicP1 method)
//        String[] picTest = test.getPicP1(17);
//        System.out.println("Here is the getPicP1 Test Method:  ");
//        for (int i = 0; i < picTest.length; i++) {
//            System.out.print(picTest[i] + ", ");
//        }
//        System.out.println();
//
//        //Adds the first iteration for the exclusion test (addPicP1Test method)
//        test.addExclusionTest("c", "It was not a shoe", 7, 17);
//
//        //Test's geting the results from the exclusion test for the first test from a single patient (getExclusionTest method)
//        String[] eTest = test.getExclusionTest(17);
//        System.out.println("Here is the getExclusionTest Method for only the first test:  ");
//        for (int i = 0; i < eTest.length; i++) {
//            System.out.print(eTest[i] + ", ");
//        }
//        System.out.println();
//
//        // Test's adding results for interation 2-5 of the exclusion test
//        test.updateExclusionTest(17, 2, "n", 4, "Not a natural light");
//        test.updateExclusionTest(17, 3, "n", 6, "is not human");
//        test.updateExclusionTest(17, 4, "n", 3, "Diferent color than the others");
//        test.updateExclusionTest(17, 5, "f", 9, "this is the final vaulue");
//
//        //Test's geting the results from the exclusion test 1-5 of a single patient (getExclusionTest method)
//        String[] eTest2 = test.getExclusionTest(17);
//        System.out.println("Here is the getExclusionTest Method:  ");
//        for (int i = 0; i < eTest2.length; i++) {
//            System.out.print(eTest2[i] + ", ");
//        }
//        System.out.println();
//
//        //Test's adding the first genralization test
//        test.addGeneralizationTest("c", "all natural light", 17, 17);
//
//        //Test's geting the results from the generalization test for the first test from a single patient (getExclusionTest method)
//        String[] gTest = test.getGeneralizationTest(17);
//        System.out.println("Here is the getGeneralization Method for only the first test:  ");
//        for (int i = 0; i < gTest.length; i++) {
//            System.out.print(gTest[i] + ", ");
//        }
//        System.out.println();
//
//        // Test's adding results for interation 1-5 of the generalization test
//        test.updateGeneralizationTest(17, 2, "n", 3, "too dark");
//        test.updateGeneralizationTest(17, 3, "n", 3, "they all match");
//        test.updateGeneralizationTest(17, 4, "n", 3, "just because idk");
//        test.updateGeneralizationTest(17, 5, "f", 3, "final general test");
//
//        //Test's geting the results from the generalization test for 1-5 from a single patient (getExclusionTest method)
//        String[] gTest2 = test.getGeneralizationTest(17);
//        System.out.println("Here is the getGeneralization Method for 1-5:  ");
//        for (int i = 0; i < gTest2.length; i++) {
//            System.out.print(gTest2[i] + ", ");
//        }
//        System.out.println();
//
//        //Test's adding the first recall iteration
//        test.addRecallTest("fish", 3, 17);
//
//        //Test's geting the results from the generalization test for the first test from a single patient (getExclusionTest method)
//        String[] rTest = test.getRecallTest(17);
//        System.out.println("Here is the getRecall Method for only the first test:  ");
//        for (int i = 0; i < rTest.length; i++) {
//            System.out.print(rTest[i] + ", ");
//        }
//
//        // Test's adding results for interation 2-5 of the exclusion test
//        test.updateRecallTest(17, 2, "cat", 4);
//        test.updateRecallTest(17, 3, "animal", 3);
//        test.updateRecallTest(17, 4, "dog", 5);
//        test.updateRecallTest(17, 5, "final", 1);
//
//        // Test's adding the associations for the recall test
//        test.updateRecallAssociations(17, "Concrete", "Concrete", "Concrete", "Concrete", "Concrete");
//
//        //Test's geting the results from the generalization test for the first test from a single patient (getExclusionTest method)
//        // After associations are added    
//        String[] raTest = test.getRecallTest(17);
//        System.out.println("Here is the getRecall Method for 1-5  & Associations :  ");
//        for (int i = 0; i < raTest.length; i++) {
//            System.out.print(raTest[i] + ", ");
//        }
//
//        //Test's adding the exclusion for the recall test
//        test.updateExclusionAssociations(17, "Concrete", "Concrete", "Concrete", "Concrete", "Concrete");
//
//        //Test's adding the generalization for the recall test
//        test.updateGeneralizationAssociations(17, "Concrete", "Concrete", "Concrete", "Concrete", "Concrete");
//
//        //Test's geting the results from the exclusion test 1-5 of a single patient (getExclusionTest method)
//        String[] eaTest2 = test.getExclusionTest(17);
//        System.out.println("Here is the getExclusionTest Method:  ");
//        for (int i = 0; i < eaTest2.length; i++) {
//            System.out.print(eaTest2[i] + ", ");
//        }
//        System.out.println();
//
//        //Test's geting the results from the generalization test for the first test from a single patient (getExclusionTest method)
//        String[] gaTest = test.getGeneralizationTest(17);
//        System.out.println("Here is the getGeneralization Method for only the first test:  ");
//        for (int i = 0; i < gaTest.length; i++) {
//            System.out.print(gaTest[i] + ", ");
//        }
//        System.out.println();
//
//        // Test's adding misc results
//        test.addMiscResults(17, "d", "d", "d", "d", "d", "Default", "Default", "Default", "Default", "Default", "comment");
//        //Test's the get misc results
//        String[] mTest = test.getMiscResults(17);
//        System.out.println("Here is the rest of the results:  ");
//        for (int i = 0; i < mTest.length; i++) {
//            System.out.print(mTest[i] + ", ");
//        }
//        System.out.println();
//
//        //Test's updating misc results
//        test.updateMiscResults(17, "n", "n", "n", "n", "n", "NDefault", "NDefault", "NDefault", "NDefault", "NDefault", "Ncomment");
//
//        //Test's the get misc results
//        String[] muTest = test.getMiscResults(17);
//        System.out.println("Here is the rest of the results:  ");
//        for (int i = 0; i < muTest.length; i++) {
//            System.out.print(muTest[i] + ", ");
//        }
//        System.out.println();
//
//        //Shut's down the database connection
//        test.shutdown();
//    }

    // Constructor
    public Database() {
        dbURL = "jdbc:derby:bacfDatabase";
        this.connectPatientDatabase();
    }

    //Intitalizes a connection to the database
    public void connectPatientDatabase() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            myconObj = DriverManager.getConnection(dbURL);
            System.out.println("Connected to database.");
        } catch (Exception e) {
            System.out.println("Failed to connect to database.");
            e.printStackTrace();
        }
    }
    //Get's the headers of the patient table and returns them as a string array

    public String[] getHeaders() {
        String[] headers = new String[11];
        try {
            stm = myconObj.createStatement();
            ResultSet output = stm.executeQuery("SELECT * FROM PATIENT WHERE PAT_ID = 1");
            ResultSetMetaData d = output.getMetaData();

            int columns = d.getColumnCount();
            for (int i = 0; i < columns; i++) {
                headers[i] = d.getColumnLabel(i + 1);
            }
            output.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return headers;
    }
    // Gets all the patients that are currently in the patient table and returns 
    // a string array containing a single patient with all his/her attributes

    public ArrayList<String[]> getAllPatients() {
        ArrayList<String[]> patients = new ArrayList<>();
        try {
            stm = myconObj.createStatement();
            ResultSet output = stm.executeQuery("SELECT * FROM PATIENT");

            while (output.next()) {
                String[] aPatient = new String[11];
                this.id = output.getInt(1);
                this.fName = output.getString(2);
                this.lName = output.getString(3);
                this.dob = output.getDate(4);
                this.gender = output.getString(5);
                this.education = output.getString(6);
                this.occupation = output.getString(7);
                this.age = output.getInt(8);
                this.currDate = output.getDate(9);
                this.location = output.getString(10);
                this.examiner = output.getString(11);

                aPatient[0] = this.id + "";
                aPatient[1] = this.fName;
                aPatient[2] = this.lName;
                aPatient[3] = this.dob + "";
                aPatient[4] = this.gender;
                aPatient[5] = this.education;
                aPatient[6] = this.occupation;
                aPatient[7] = this.age + "";
                aPatient[8] = this.currDate + "";
                aPatient[9] = this.location;
                aPatient[10] = this.examiner;

                patients.add(aPatient);
            }
            
            output.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patients;
    }

    // Gets a single patient and return the patient as a string array, requires the patient ID
    public String[] getPatient(int ID) {
        String[] result = new String[11];
        try {
            stm = myconObj.createStatement();
            ResultSet output = stm.executeQuery("SELECT * FROM PATIENT"
                    + " WHERE PATIENT.PAT_ID = " + ID);

            while (output.next()) {
                this.id = output.getInt(1);
                this.fName = output.getString(2);
                this.lName = output.getString(3);
                this.dob = output.getDate(4);
                this.gender = output.getString(5);
                this.education = output.getString(6);
                this.occupation = output.getString(7);
                this.age = output.getInt(8);
                this.currDate = output.getDate(9);
                this.location = output.getString(10);
                this.examiner = output.getString(11);

                result[0] = "" + this.id;
                result[1] = this.fName;
                result[2] = this.lName;
                result[3] = this.dob + "";
                result[4] = this.gender;
                result[5] = this.education;
                result[6] = this.occupation;
                result[7] = this.age + "";
                result[8] = this.currDate + "";
                result[9] = this.location;
                result[10] = this.examiner;
            }
            output.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    // Add's a single patient to the database (creates a new row)
    public int addPatient(String fn, String ln, String dob, String gender, String ed,
            String occ, int age, String cDate, String loc, String exam) {
        int id = -1;
        PreparedStatement stmt = null;
        ResultSet rset = null;
        String query = "INSERT INTO Patient VALUES (DEFAULT, '" + fn + "', '" + ln + "', '"
                + dob + "', '" + gender + "', '" + ed + "', '" + occ + "', " + age
                + ", '" + cDate + "', '" + loc + "', '" + exam + "')";

        System.out.println(query);
        try {
            stmt = myconObj.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.executeUpdate();
            rset = stmt.getGeneratedKeys();
            if (rset.next()) {id = rset.getInt(1);}
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    //Updates a single patient, requires the patient's ID (updates existing row)
    public void updatePatient(int ID, String fn, String ln, String dob, String gender, String ed,
        String occ, int age, String cDate, String loc, String exam) {
        String query = "UPDATE Patient SET Fname = '" + fn + "', Lname = '" + ln
                + "', dob = '" + dob + "', Gender = '" + gender + "', Education = '"
                + ed + "', Occupation = '" + occ + "', Age = " + age + ", Curr_Date = '"
                + cDate + "', Location = '" + loc + "', Examiner = '" + exam + "'";
        query += " WHERE Patient.PAT_ID = " + ID;
        System.out.println(query);

        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Disconnects the database safely 

    public void shutdown() {
        try {
            if (stm != null) {
                stm.close();
            }
            if (myconObj != null) {
                myconObj.close();
            }
        } catch (SQLException e) {
            System.out.println("Database disconnect failure.");
        }
    }
    
    

    // Add's a new row the numbers test table, this is done after the first number's tests ends.
    // Requires patient Id 
    public void addNumbersTest(int id, int time1) {
        String query = "INSERT INTO NumbersTest";
        query += " VALUES (" + id + ", " + time1 + ", " + 0 + ", " + 0
                + ", " + 0 + ", " + 0 + ")";

        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
            System.out.println(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Adds the time for numbers test 2-5. Requires the patient Id and the interation the test is on
    public void updateNumbersTest(int id, int time, int testNum) {
        String query = "UPDATE NumbersTest SET TEST" + testNum;
        query += "=" + time + " WHERE NumbersTest.Id = " + id;

        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Get's the numbers table headers (this may be deleted after testing)
    public String[] getNumberHeaders() {
        String[] headers = new String[6];
        try {
            stm = myconObj.createStatement();
            ResultSet output = stm.executeQuery("SELECT * FROM NUMBERSTEST");
            ResultSetMetaData d = output.getMetaData();

            int columns = d.getColumnCount();
            for (int i = 0; i < columns; i++) {
                headers[i] = d.getColumnLabel(i + 1);
            }
            output.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return headers;
    }

    //Gets a a single patients result from the numbers test. Requires the patient Id
    public int[] getNumbersTest(int ID) {

        int[] result = new int[6];
        try {
            stm = myconObj.createStatement();
            ResultSet output = stm.executeQuery("SELECT * FROM NUMBERSTEST"
                    + " WHERE NUMBERSTEST.ID = " + ID);

            while (output.next()) {
                this.numId = output.getInt(1);
                this.time1 = output.getInt(2);
                this.time2 = output.getInt(3);
                this.time3 = output.getInt(4);
                this.time4 = output.getInt(5);
                this.time5 = output.getInt(6);

                result[0] = this.numId;
                result[1] = this.time1;
                result[2] = this.time2;
                result[3] = this.time3;
                result[4] = this.time4;
                result[5] = this.time5;
            }
            output.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    // Add's the picture test results for the entire test. All vaulues must be passed at the same time
    //Requires patient Id
    public void addPicP1Test(int id, String choice1, String choice2, String choice3,
            String choice4, String choice5) {
        String query = "INSERT INTO Pictures_SymbolsTestP1";
        query += " VALUES (" + id + ", '" + choice1 + "', '" + choice2 + "', '" + choice3
                + "', '" + choice4 + "', '" + choice5 +  "', '" + eChoice1 + "', '" + eChoice2
                + "', '" + eChoice3 + "', '" + eChoice4 + "', '" + eChoice5 + "')";

        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
            System.out.println(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Gets the results for a single patients picture test and returns a string array. 
    //Requires patient Id
    public String[] getPicP1(int ID) {
        String[] result = new String[11];
        try {
            stm = myconObj.createStatement();
            ResultSet output = stm.executeQuery("SELECT * FROM Pictures_SymbolsTestP1"
                    + " WHERE Pictures_SymbolsTestP1.Id = " + ID);

            while (output.next()) {
                this.picId = output.getInt(1);
                this.pChoice1 = output.getString(2);
                this.pChoice2 = output.getString(3);
                this.pChoice3 = output.getString(4);
                this.pChoice4 = output.getString(5);
                this.pChoice5 = output.getString(6);
                this.eChoice1 = output.getString(7);
                this.eChoice2 = output.getString(8);
                this.eChoice3 = output.getString(9);
                this.eChoice4 = output.getString(10);
                this.eChoice5 = output.getString(11);

                result[0] = "" + this.picId;
                result[1] = this.pChoice1;
                result[2] = this.pChoice2;
                result[3] = this.pChoice3;
                result[4] = this.pChoice4;
                result[5] = this.pChoice5;
                result[6] = this.eChoice1;
                result[7] = this.eChoice2;
                result[8] = this.eChoice3;
                result[9] = this.eChoice4;
                result[10] = this.eChoice5;
            }
            output.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    // Gets a single patients results for the exclusions test and resturns a string array. 
    //Requires patient Id
    public String[] getExclusionTest(int ID) {
        String[] result = new String[26];
        try {
            stm = myconObj.createStatement();
            ResultSet output = stm.executeQuery("SELECT * FROM ExclusionTest"
                    + " WHERE ExclusionTest.Id = " + ID);

            while (output.next()) {
                this.exId = output.getInt(1);
                this.exclusionChoice1P = output.getString(2);
                this.exclusionChoice2P = output.getString(3);
                this.exclusionChoice3P = output.getString(4);
                this.exclusionChoice4P = output.getString(5);
                this.exclusionChoice5P = output.getString(6);
                this.exclusionChoice1E = output.getString(7);
                this.exclusionChoice2E = output.getString(8);
                this.exclusionChoice3E = output.getString(9);
                this.exclusionChoice4E = output.getString(10);
                this.exclusionChoice5E = output.getString(11);
                this.eTime1 = output.getInt(12);
                this.eTime2 = output.getInt(13);
                this.eTime3 = output.getInt(14);
                this.eTime4 = output.getInt(15);
                this.eTime5 = output.getInt(16);
                this.eAssociation1 = output.getString(17);
                this.eAssociation2 = output.getString(18);
                this.eAssociation3 = output.getString(19);
                this.eAssociation4 = output.getString(20);
                this.eAssociation5 = output.getString(21);
                this.eReason1 = output.getString(22);
                this.eReason2 = output.getString(23);
                this.eReason3 = output.getString(24);
                this.eReason4 = output.getString(25);
                this.eReason5 = output.getString(26);

                result[0] = "" + this.exId;
                result[1] = this.exclusionChoice1P;
                result[2] = this.exclusionChoice2P;
                result[3] = this.exclusionChoice3P;
                result[4] = this.exclusionChoice4P;
                result[5] = this.exclusionChoice5P;
                result[6] = this.exclusionChoice1E;
                result[7] = this.exclusionChoice2E;
                result[8] = this.exclusionChoice3E;
                result[9] = this.exclusionChoice4E;
                result[10] = this.exclusionChoice5E;
                result[11] = "" + this.eTime1;
                result[12] = "" + this.eTime2;
                result[13] = "" + this.eTime3;
                result[14] = "" + this.eTime4;
                result[15] = "" + this.eTime5;
                result[16] = this.eAssociation1;
                result[17] = this.eAssociation2;
                result[18] = this.eAssociation3;
                result[19] = this.eAssociation4;
                result[20] = this.eAssociation5;
                result[21] = this.eReason1;
                result[22] = this.eReason2;
                result[23] = this.eReason3;
                result[24] = this.eReason4;
                result[25] = this.eReason5;
            }
            output.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    //Add's a single patients results for the first iteration of the exclusion test by patient Id
    public void addExclusionTest(String pchoice1, String reason1, int time1, int id) {
        String query = "INSERT INTO ExclusionTest";
        query += " VALUES (" + id + ", '" + pchoice1
                + "', 'd',  'd', 'd', 'd'"
                + ", 'd',  'd', 'd', 'd', 'd'"
                + ", " + time1 + ", " + 0 + ", " + 0 + ", " + 0 + ", " + 0
                + ", 'default',  'default', 'default', 'default', 'default', '" + reason1
                + "', 'default', 'default', 'default', 'default')";

        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Adds a patients results from exclusions test 2-5 by the patint Id
    public void updateExclusionTest(int id, int testOn, String pChoice, int time, String reason) {
        // Toggle Exclusion Test 2-5
        String query = "UPDATE ExclusionTest SET ";

        switch (testOn) {
            case 2:
                query += "PCHOICE2 = '" + pChoice + "', " + "TIME2 = " + time + ", "
                        + "REASON2 = '" + reason + "'";
                break;
            case 3:
                query += "PCHOICE3 = '" + pChoice + "', " + "TIME3 = " + time + ", "
                        + "REASON3 = '" + reason + "'";
                break;
            case 4:
                query += "PCHOICE4 = '" + pChoice + "', " + "TIME4 = " + time + ", "
                        + "REASON4 = '" + reason + "'";
                break;
            case 5:
                query += "PCHOICE5 = '" + pChoice + "', " + "TIME5 = " + time + ", "
                        + "REASON5 = '" + reason + "'";
                break;
            default:
                break;
        }

        query += " WHERE ExclusionTest.ID = " + id;
        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //Get's a patient's results for the generalization test by the patient Id

    public String[] getGeneralizationTest(int ID) {
        String[] result = new String[26];
        try {
            stm = myconObj.createStatement();
            ResultSet output = stm.executeQuery("SELECT * FROM ExclusionTest"
                    + " WHERE ExclusionTest.Id = " + ID);

            while (output.next()) {
                this.gId = output.getInt(1);
                this.generalChoice1P = output.getString(2);
                this.generalChoice2P = output.getString(3);
                this.generalChoice3P = output.getString(4);
                this.generalChoice4P = output.getString(5);
                this.generalChoice5P = output.getString(6);
                this.generalChoice1E = output.getString(7);
                this.generalChoice2E = output.getString(8);
                this.generalChoice3E = output.getString(9);
                this.generalChoice4E = output.getString(10);
                this.generalChoice5E = output.getString(11);
                this.gTime1 = output.getInt(12);
                this.gTime2 = output.getInt(13);
                this.gTime3 = output.getInt(14);
                this.gTime4 = output.getInt(15);
                this.gTime5 = output.getInt(16);
                this.gAssociation1 = output.getString(17);
                this.gAssociation2 = output.getString(18);
                this.gAssociation3 = output.getString(19);
                this.gAssociation4 = output.getString(20);
                this.gAssociation5 = output.getString(21);
                this.gReason1 = output.getString(22);
                this.gReason2 = output.getString(23);
                this.gReason3 = output.getString(24);
                this.gReason4 = output.getString(25);
                this.gReason5 = output.getString(26);

                result[0] = "" + this.gId;
                result[1] = this.generalChoice1P;
                result[2] = this.generalChoice2P;
                result[3] = this.generalChoice3P;
                result[4] = this.generalChoice4P;
                result[5] = this.generalChoice5P;
                result[6] = this.generalChoice1E;
                result[7] = this.generalChoice2E;
                result[8] = this.generalChoice3E;
                result[9] = this.generalChoice4E;
                result[10] = this.generalChoice5E;
                result[11] = "" + this.gTime1;
                result[12] = "" + this.gTime2;
                result[13] = "" + this.gTime3;
                result[14] = "" + this.gTime4;
                result[15] = "" + this.gTime5;
                result[16] = this.gAssociation1;
                result[17] = this.gAssociation2;
                result[18] = this.gAssociation3;
                result[19] = this.gAssociation4;
                result[20] = this.gAssociation5;
                result[21] = this.gReason1;
                result[22] = this.gReason2;
                result[23] = this.gReason3;
                result[24] = this.gReason4;
                result[25] = this.gReason5;
            }
            output.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    //Add's a patients results for the first iteration of the generalization test. Requires patient Id

    public void addGeneralizationTest(String pchoice1, String reason1, int time1, int id) {
        String query = "INSERT INTO GENERALIZATIONTEST";
        query += " VALUES (" + id + ", '" + pchoice1
                + "', 'd',  'd', 'd', 'd'"
                + ", 'd',  'd', 'd', 'd', 'd'"
                + ", " + time1 + ", " + 0 + ", " + 0 + ", " + 0 + ", " + 0
                + ", 'default',  'default', 'default', 'default', 'default', '" + reason1
                + "', 'default', 'default', 'default', 'default')";
        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Add's a patients results for generalization test 2-5. Requires patient Id
    public void updateGeneralizationTest(int id, int testOn, String pChoice, int time, String reason) {
        // Toggle Exclusion Test 2-5
        String query = "UPDATE GENERALIZATIONTEST SET ";

        switch (testOn) {
            case 2:
                query += "PCHOICE2 = '" + pChoice + "', " + "TIME2 = " + time + ", "
                        + "REASON2 = '" + reason + "'";
                break;
            case 3:
                query += "PCHOICE3 = '" + pChoice + "', " + "TIME3 = " + time + ", "
                        + "REASON3 = '" + reason + "'";
                break;
            case 4:
                query += "PCHOICE4 = '" + pChoice + "', " + "TIME4 = " + time + ", "
                        + "REASON4 = '" + reason + "'";
                break;
            case 5:
                query += "PCHOICE5 = '" + pChoice + "', " + "TIME5 = " + time + ", "
                        + "REASON5 = '" + reason + "'";
                break;
            default:
                break;
        }

        query += " WHERE GENERALIZATIONTEST.ID = " + id;
        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Add's a patients results for the first recall test iteration. Requires patient Id
    public void addRecallTest(String word1, int time1, int id) {
        String query = "INSERT INTO Pictures_SymbolsTestP2";
        query += " VALUES (" + id + ", " + time1 + ", " + 0 + ", " + 0 + ", " + 0 + ", " + 0
                + ", '" + word1 + "', " + "'default', 'default', 'default', 'defuault'"
                + ", 'association', 'association', 'association', 'association', 'association')";

        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Gets a patients results for the recall test and returns a string array. Requires patient Id
    public String[] getRecallTest(int ID) {
        String[] result = new String[16];
        try {
            stm = myconObj.createStatement();
            ResultSet output = stm.executeQuery("SELECT * FROM Pictures_SymbolsTestP2"
                    + " WHERE Pictures_SymbolsTestP2.Id = " + ID);

            while (output.next()) {
                this.rId = output.getInt(1);
                this.RecallTime1 = output.getInt(2);
                this.RecallTime2 = output.getInt(3);
                this.RecallTime3 = output.getInt(4);
                this.RecallTime4 = output.getInt(5);
                this.RecallTime5 = output.getInt(6);
                this.P_Recall1 = output.getString(7);
                this.P_Recall2 = output.getString(8);
                this.P_Recall3 = output.getString(9);
                this.P_Recall4 = output.getString(10);
                this.P_Recall5 = output.getString(11);
                this.RecallAssociations1 = output.getString(12);
                this.RecallAssociations2 = output.getString(13);
                this.RecallAssociations3 = output.getString(14);
                this.RecallAssociations4 = output.getString(15);
                this.RecallAssociations5 = output.getString(16);

                result[0] = "" + this.rId;
                result[1] = "" + this.RecallTime1;
                result[2] = "" + this.RecallTime2;
                result[3] = "" + this.RecallTime3;
                result[4] = "" + this.RecallTime4;
                result[5] = "" + this.RecallTime5;
                result[6] = this.P_Recall1;
                result[7] = this.P_Recall2;
                result[8] = this.P_Recall3;
                result[9] = this.P_Recall4;
                result[10] = this.P_Recall5;
                result[11] = this.RecallAssociations1;
                result[12] = this.RecallAssociations2;
                result[13] = this.RecallAssociations3;
                result[14] = this.RecallAssociations4;
                result[15] = this.RecallAssociations5;
            }
            output.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    //Add's patients results for recall test 2-5. Requires patient Id, and test iteration
    public void updateRecallTest(int id, int testOn, String word, int time) {
        // Toggle Exclusion Test 2-5
        String query = "UPDATE Pictures_SymbolsTestP2 SET ";

        switch (testOn) {
            case 2:
                query += "RECALLTIME2 = " + time + ", " + "P_RECALL2 = '" + word + "'";
                break;
            case 3:
                query += "RECALLTIME3 = " + time + ", " + "P_RECALL3 = '" + word + "'";
                break;
            case 4:
                query += "RECALLTIME4 =  " + time + ", " + "P_RECALL4 = '" + word + "'";
                break;
            case 5:
                query += "RECALLTIME5 = " + time + ", " + "P_RECALL5 = '" + word + "'";
                break;
            default:
                break;
        }

        query += "WHERE Pictures_SymbolsTestP2.ID = " + id;
        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Add's recall associations 
    public void updateRecallAssociations(int id, String association1, String association2, String association3,
            String association4, String association5) {
        String query = "UPDATE Pictures_SymbolsTestP2";
        query += " SET ASSOCIATIONS1 = '" + association1 + "', "
                + "ASSOCIATIONS2 = '" + association2 + "', "
                + "ASSOCIATIONS3 = '" + association3 + "', "
                + "ASSOCIATIONS4 = '" + association4 + "', "
                + "ASSOCIATIONS5 = '" + association5 + "' ";
        query += "WHERE Pictures_SymbolsTestP2.Id = " + id;

        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Add's exclusion associations
    public void updateExclusionAssociations(int id, String association1, String association2, String association3,
            String association4, String association5) {
        String query = "UPDATE ExclusionTest";
        query += " SET ASSOCIATIONS1 = '" + association1 + "', "
                + "ASSOCIATIONS2 = '" + association2 + "', "
                + "ASSOCIATIONS3 = '" + association3 + "', "
                + "ASSOCIATIONS4 = '" + association4 + "', "
                + "ASSOCIATIONS5 = '" + association5 + "' ";
        query += "WHERE ExclusionTest.Id = " + id;

        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Add's generalization associations
    public void updateGeneralizationAssociations(int id, String association1, String association2, String association3,
            String association4, String association5) {
        String query = "UPDATE GeneralizationTest";
        query += " SET ASSOCIATIONS1 = '" + association1 + "', "
                + "ASSOCIATIONS2 = '" + association2 + "', "
                + "ASSOCIATIONS3 = '" + association3 + "', "
                + "ASSOCIATIONS4 = '" + association4 + "', "
                + "ASSOCIATIONS5 = '" + association5 + "' ";
        query += "WHERE GeneralizationTest.Id = " + id;

        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Add's the rest of the results for a single patient such as doctors notes
    public void addMiscResults(int id, String b1, String b2, String b3, String b4, String b5,
            String p1, String p2, String p3, String p4, String p5, String c) {
        String query = "INSERT INTO miscResults";
        query += " VALUES (" + id
                + ", '" + b1 + "', " + "'" + b2 + "', " + "'" + b3 + "', "
                + "'" + b4 + "', " + "'" + b5 + "', " + "'" + p1 + "', "
                + "'" + p2 + "', " + "'" + p3 + "', " + "'" + p4 + "', "
                + "'" + p5 + "'," + "'" + c + "')";

        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Gets the remainder of the results
    public String[] getMiscResults(int ID) {
        String[] result = new String[12];
        try {
            stm = myconObj.createStatement();
            ResultSet output = stm.executeQuery("SELECT * FROM miscResults"
                    + " WHERE miscResults.Id = " + ID);

            while (output.next()) {
                this.mId = output.getInt(1);
                this.Behavior1 = output.getString(2);
                this.Behavior2 = output.getString(3);
                this.Behavior3 = output.getString(4);
                this.Behavior4 = output.getString(5);
                this.Behavior5 = output.getString(6);
                this.Pposition1 = output.getString(7);
                this.Pposition2 = output.getString(8);
                this.Pposition3 = output.getString(9);
                this.Pposition4 = output.getString(10);
                this.Pposition5 = output.getString(11);
                this.comments = output.getString(12);

                result[0] = "" + this.mId;
                result[1] = this.Behavior1;
                result[2] = this.Behavior2;
                result[3] = this.Behavior3;
                result[4] = this.Behavior4;
                result[5] = this.Behavior5;
                result[6] = this.Pposition1;
                result[7] = this.Pposition2;
                result[8] = this.Pposition3;
                result[9] = this.Pposition4;
                result[10] = this.Pposition5;
                result[11] = this.comments;
            }
            output.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    //Updates and changes made to a patients results for the final results section
    public void updateMiscResults(int id, String b1, String b2, String b3, String b4, String b5,
            String p1, String p2, String p3, String p4, String p5, String c) {
        String query = "UPDATE miscResults";
        query += " SET Behavior1 = '" + b1 + "', Behavior2 = '" + b2 + "', Behavior3 = '"
                + b3 + "', Behavior4 = '" + b4 + "', Behavior5 = '" + b5
                + "', Pposition1 = '" + p1 + "', Pposition2 = '" + p2 + "', Pposition3 = '" + p3
                + "', Pposition4 = '" + p4 + "', Pposition5 = '" + p5 + "', Comments = '" + c + "' ";
        query += "WHERE miscResults.Id = " + id;
        System.out.println(query);
        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
     public void deletePatient(int id) {
        String query = "DELETE FROM Patient WHERE Patient.Pat_Id = " + id;

        System.out.println(query);
        try {
            stm = myconObj.createStatement();
            stm.execute(query);
            stm.close();
        } catch (SQLException e) {
            // Need to handle deleting Patients with Test Data
            e.printStackTrace();
        }

    }
}
