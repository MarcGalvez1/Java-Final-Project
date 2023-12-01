/* Marc Galvez
   November 30, 2023.
   CPT 236 - Java Programming
   Final Project
   MyStudent class is an extension of MyPerson class.
   It assigns each student object with start years and GPA.

   *** The starting point for the Final Project ***
 */

/**
 *    MyStudent class is an extension of MyPerson class.
 *    It assigns each student object with start years and GPA.
 * @author Marc Galvez
 * @version 1.0
 */
public class MyStudent extends MyPerson{
   // Declare private fields
    private int startYear;
    private  double earnedGPA;

    // Declare class level constants
    public final  int MIN_START_YEAR = 2010;
    public final int MAX_START_YEAR = 2019;

    public final double MIN_EARNED_GPA = 0.0;
    public final double MAX_EARNED_GPA = 4.0;

    /**
     * This is the default constructor of MyStudent to initialize startYear and earnedGPA.
     */
    public MyStudent() {
        // Default constructor to initialize startYear and earnedGPA
        startYear = 2018;
        earnedGPA = 3.0;
    }

    /**
     * This constructor sets the student object's fullName, startYear, and earnedGPA.
     * @param fullName String argument
     * @param startYear int argument
     * @param earnedGPA double argument
     */
    public MyStudent(String fullName, int startYear, double earnedGPA) {
        // This constructor sets fullName, startYear, and earnedGPA
        fullName = fullName.trim();
        setFullName(fullName);
        setStartYear(startYear);
        setEarnedGPA(earnedGPA);
    }

    /**
     * This method sets the student object's startYear between 2010 and 2019 inclusive.
     * @param year int argument
     */
    public void setStartYear(int year) {
        // Set startYear
        if (year >= MIN_START_YEAR && year <= MAX_START_YEAR) { // start year must be between 2010 and 2019
            startYear = year;
        } else {
            if (year < MIN_START_YEAR) { // must be > 2010
                System.out.println("ERROR: Start Year cannot be less than " + MIN_START_YEAR + ".");
            }
            if (year > MAX_START_YEAR) { // must be < 2019
                System.out.println("ERROR: Start Year cannot be greater than " + MAX_START_YEAR + ".");
            }
        }
    }

    /**
     * This method sets the student object's earned GPA between 0.0 and 4.0 inclusive.
     * @param gpa double argument
     */
    public void setEarnedGPA(double gpa) { // Set earnedGPA
        if (gpa >= MIN_EARNED_GPA && gpa <= MAX_EARNED_GPA) { // 0.0 <= GPA <= 4.0
            earnedGPA = gpa;
        } else {
            if (gpa < MIN_EARNED_GPA) { //Error must be > 0.0
                System.out.print("ERROR: Earned GPA cannot be less than ");
                System.out.printf("%.1f.\n", MIN_EARNED_GPA);
            }
            if (gpa > MAX_EARNED_GPA) { // must be < 4.0
                System.out.print("ERROR: Earned GPA cannot be greater than ");
                System.out.printf("%.1f.\n", MAX_EARNED_GPA);
            }
        }
    }

    /**
     * This method returns the value of the student object's startYear
     * @return double startYear
     */
    public int getStartYear() { // get value of startYear
        return startYear;
    }

    /**
     * This method returns the value of the student object's earnedGPA
     * @return double earnedGPA
     */
    public double getEarnedGPA() { // get value of earnedGPA
        return earnedGPA;
    }

    /**
     * This method overrides MyPerson class' printAll() method.
     * It then displays new startYear and earnedGPA along with the data displayed by the overriden printAll() method.
     */
    @Override
    public void printAll() { // print the users full name, ID number, start year, and GPA
        super.printAll();
        System.out.print("   Start Year: " + startYear + ", GPA: ");
        System.out.printf("%.1f\n", earnedGPA);
    }
}
