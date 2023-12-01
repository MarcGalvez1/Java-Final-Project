/* Marc Galvez
   November 30, 2023.
   CPT 236 - Java Programming
   Final Project
   MyInstructor class extends MyPerson class to create instructor objects.
   Instructor objects have hired year and base salaries.

   *** The starting point for the Final Project ***
 */

/**
 * The MyInstructor class extends MyPerson class to create instructor objects.
 * Instructor objects have hired year and base salaries.
 * @author Marc Galvez
 * @version 1.0
 */
public class MyInstructor extends MyPerson{
    // Declare private fields
    private int hiredYear;
    private double baseSalary;

    // Constants
    public final int MIN_HIRED_YEAR = 1963;
    public final int MAX_HIRED_YEAR = 2019;
    public  final double MIN_BASE_SALARY = 0.00;
    public final double MAX_BASE_SALARY = 100_000.00;


    /**
     * This default constructor initializes the hiredYear and baseSalary private fields.
     */
    public MyInstructor () {
        // Default constructors to initialize private fields
        hiredYear = 2000;
        baseSalary = 20_000.00;
    }

    /**
     * This constructor calls the setter methods to set fullName, hiredYear, and baseSalary private fields.
     * @param fullName String argument
     * @param hiredYear int argument
     * @param baseSalary double argument
     */
    public MyInstructor(String fullName, int hiredYear, double baseSalary) {
        // This constructor sets fullName, hiredYear and baseSalary
        fullName = fullName.trim();
        setFullName(fullName);
        setHiredYear(hiredYear);
        setBaseSalary(baseSalary);
    }

    /**
     * This method sets hiredYear between 1963 and 2019 inclusive.
     * @param hiredYear int argument
     */
    public void setHiredYear(int hiredYear) {
        // Set hired year
        if(hiredYear >= MIN_HIRED_YEAR && hiredYear <= MAX_HIRED_YEAR) { // 1963 <= hiredYear <= 2019
            this.hiredYear = hiredYear;
        } else {
            if (hiredYear < MIN_HIRED_YEAR) { // must be >= 1963
                System.out.println("ERROR: Hired Year cannot be less than " + MIN_HIRED_YEAR + ".");
            }
            if (hiredYear > MAX_HIRED_YEAR) { // must be <= 2019
                System.out.println("ERROR: Hired Year cannot be greater than " + MAX_HIRED_YEAR + ".");
            }
        }
    }

    /**
     * This method set's the instructor object's baseSalary between $0.00 and $100,000.00
     * @param baseSalary double argument
     */
    public void setBaseSalary(double baseSalary) { // set base salary

        if (baseSalary >= MIN_BASE_SALARY && baseSalary <= MAX_BASE_SALARY) { // 0.00 <= salary <= 100,000.00
            this.baseSalary = baseSalary;
        }   else {
            if (baseSalary < MIN_BASE_SALARY) { // Must be >= 0.00
                System.out.print("ERROR: Base Salary cannot be less than $");
                System.out.printf("%.2f.\n", MIN_BASE_SALARY);
            }
            if (baseSalary > MAX_BASE_SALARY) { // Must be <= 100,000.00
                System.out.print("ERROR: Base Salary cannot be greater than $");
                System.out.printf("%.2f.\n", MAX_BASE_SALARY);
            }
        }
    }

    /**
     * This method returns the instructor object's hiredYear value.
     * @return hiredYear
     */
    public int getHiredYear() { // get value of hiredYear
        return hiredYear;
    }

    /**
     * This method returns the instructor object's baseSalary.
     * @return baseSalary
     */
    public double getBaseSalary() { // get value of baseSalary
        return  baseSalary;
    }

    /**
     * This method overrides the MyPerson printAll() method to display both sets of data.
     * The additional data displayed is the instructor object's hiredYear, and baseSalary.
     */
    @Override
    public void printAll() { // print the full name, ID number, hiredYear, baseSalary
        super.printAll();
        System.out.print("   Year hired: " + hiredYear + ", Salary: $");
        System.out.printf("%.2f\n", baseSalary);
    }
}
