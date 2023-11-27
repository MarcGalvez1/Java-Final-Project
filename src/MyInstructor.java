public class MyInstructor extends MyPerson{
    private int hiredYear = 2000;
    private double baseSalary = 20000;

    // Constants
    public final int MIN_HIRED_YEAR = 1963;
    public final int MAX_HIRED_YEAR = 2019;
    public  final double MIN_BASE_SALARY = 0.00;
    public final double MAX_BASE_SALARY = 100_000.00;


    public MyInstructor () {
        setIDNumber();
    }

    public MyInstructor(String fullName, int hiredYear, double baseSalary) {
        setFullName(fullName);
        setHiredYear(hiredYear);
        setBaseSalary(baseSalary);
        setIDNumber();
    }

    public void setHiredYear(int hiredYear) {
        if(hiredYear >= MIN_HIRED_YEAR && hiredYear <= MAX_HIRED_YEAR) {
            this.hiredYear = hiredYear;
        } else {
            if (hiredYear < MIN_HIRED_YEAR) {
                System.out.println("ERROR: Hired Year cannot be less than 1963.");
            }
            if (hiredYear > MAX_HIRED_YEAR) {
                System.out.println("ERROR: Hired Year cannot be greater than 2019.");
            }
        }
    }

    public void setBaseSalary(double baseSalary) {

        if (baseSalary >= MIN_BASE_SALARY && baseSalary <= MAX_BASE_SALARY) {
            this.baseSalary = baseSalary;
        }   else {
            if (baseSalary < MIN_BASE_SALARY) {
                System.out.println("ERROR: Base Salary cannot be less than $0.00.");
            }
            if (baseSalary > MAX_BASE_SALARY) {
                System.out.println("ERROR: Base Salary cannot be greater than $100000.00.");
            }
        }
    }

    public int getHiredYear() {
        return hiredYear;
    }

    public double getBaseSalary() {
        return  baseSalary;
    }

    @Override
    public void printAll() {
        super.printAll();
        System.out.println("   Year hired: " + hiredYear + ", Salary: $" + baseSalary);
    }
}
