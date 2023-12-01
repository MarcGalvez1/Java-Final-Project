/* Marc Galvez
   November 30, 2023.
   CPT 236 - Java Programming
   Final Project
   MyStudent class is an extension of MyPerson class.
   It assigns each student object with start years and GPA.

   *** The starting point for the Final Project ***
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
    public MyStudent() {
        // Default constructor to initialize startYear and earnedGPA
        startYear = 2018;
        earnedGPA = 3.0;
    }

    public MyStudent(String fullName, int startYear, double earnedGPA) {
        // This constructor sets fullName, startYear, and earnedGPA
        fullName = fullName.trim();
        setFullName(fullName);
        setStartYear(startYear);
        setEarnedGPA(earnedGPA);
    }

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

    public int getStartYear() { // get value of startYear
        return startYear;
    }

    public double getEarnedGPA() { // get value of earnedGPA
        return earnedGPA;
    }

    @Override
    public void printAll() { // print the users full name, ID number, start year, and GPA
        super.printAll();
        System.out.print("   Start Year: " + startYear + ", GPA: ");
        System.out.printf("%.1f\n", earnedGPA);
    }
}
