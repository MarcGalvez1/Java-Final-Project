public class MyInstructor extends MyPerson{
    private int hiredYear;
    private double baseSalary;

    // Constants
    public final int MIN_HIRED_YEAR = 1963;
    public final int MAX_HIRED_YEAR = 2019;
    public  final double MIN_BASE_SALARY = 0.00;
    public final double MAX_BASE_SALARY = 100_000.00;


    public MyInstructor () {
        hiredYear = 2000;
        baseSalary = 20_000.00;
    }

    public MyInstructor(String fullName, int hiredYear, double baseSalary) {
        fullName = fullName.trim();
        setFullName(fullName);
        setHiredYear(hiredYear);
        setBaseSalary(baseSalary);
    }

    public void setHiredYear(int hiredYear) {
        if(hiredYear >= MIN_HIRED_YEAR && hiredYear <= MAX_HIRED_YEAR) {
            this.hiredYear = hiredYear;
        } else {
            if (hiredYear < MIN_HIRED_YEAR) {
                System.out.println("ERROR: Hired Year cannot be less than " + MIN_HIRED_YEAR + ".");
            }
            if (hiredYear > MAX_HIRED_YEAR) {
                System.out.println("ERROR: Hired Year cannot be greater than " + MAX_HIRED_YEAR + ".");
            }
        }
    }

    public void setBaseSalary(double baseSalary) {

        if (baseSalary >= MIN_BASE_SALARY && baseSalary <= MAX_BASE_SALARY) {
            this.baseSalary = baseSalary;
        }   else {
            if (baseSalary < MIN_BASE_SALARY) {
                System.out.print("ERROR: Base Salary cannot be less than $");
                System.out.printf("%.2f.\n", MIN_BASE_SALARY);
            }
            if (baseSalary > MAX_BASE_SALARY) {
                System.out.print("ERROR: Base Salary cannot be greater than $");
                System.out.printf("%.2f.\n", MAX_BASE_SALARY);
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
        System.out.print("   Year hired: " + hiredYear + ", Salary: $");
        System.out.printf("%.2f\n", baseSalary);
    }
}
