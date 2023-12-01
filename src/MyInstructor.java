/* Marc Galvez
   November 30, 2023.
   CPT 236 - Java Programming
   Final Project
   MyInstructor class extends MyPerson class to create instructor objects.
   Instructor objects have hired year and base salaries.

   *** The starting point for the Final Project ***
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


    public MyInstructor () {
        // Default constructors to initialize private fields
        hiredYear = 2000;
        baseSalary = 20_000.00;
    }

    public MyInstructor(String fullName, int hiredYear, double baseSalary) {
        // This constructor sets fullName, hiredYear and baseSalary
        fullName = fullName.trim();
        setFullName(fullName);
        setHiredYear(hiredYear);
        setBaseSalary(baseSalary);
    }

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

    public int getHiredYear() { // get value of hiredYear
        return hiredYear;
    }

    public double getBaseSalary() { // get value of baseSalary
        return  baseSalary;
    }

    @Override
    public void printAll() { // print the full name, ID number, hiredYear, baseSalary
        super.printAll();
        System.out.print("   Year hired: " + hiredYear + ", Salary: $");
        System.out.printf("%.2f\n", baseSalary);
    }
}
