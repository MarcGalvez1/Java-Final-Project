public class MyStudent extends MyPerson{
    private int startYear;
    private  double earnedGPA;

    public final  int MIN_START_YEAR = 2010;
    public final int MAX_START_YEAR = 2019;

    public final double MIN_EARNED_GPA = 0.0;
    public final double MAX_EARNED_GPA = 4.0;
    public MyStudent() {
        startYear = 2018;
        earnedGPA = 3.0;
    }

    public MyStudent(String fullName, int startYear, double earnedGPA) {
        fullName = fullName.trim();
        setFullName(fullName);
        setStartYear(startYear);
        setEarnedGPA(earnedGPA);
    }

    public void setStartYear(int year) {
        if (year >= MIN_START_YEAR && year <= MAX_START_YEAR) {
            startYear = year;
        } else {
            if (year < MIN_START_YEAR) {
                System.out.println("ERROR: Start Year cannot be less than " + MIN_START_YEAR + ".");
            }
            if (year > MAX_START_YEAR) {
                System.out.println("ERROR: Start Year cannot be greater than " + MAX_START_YEAR + ".");
            }
        }
    }

    public void setEarnedGPA(double gpa) {
        if (gpa >= MIN_EARNED_GPA && gpa <= MAX_EARNED_GPA) {
            earnedGPA = gpa;
        } else {
            if (gpa < MIN_EARNED_GPA) {
                System.out.print("ERROR: Earned GPA cannot be less than ");
                System.out.printf("%.1f.\n", MIN_EARNED_GPA);
            }
            if (gpa > MAX_EARNED_GPA) {
                System.out.println("ERROR: Earned GPA cannot be greater than ");
                System.out.printf("%.1f.\n", MAX_EARNED_GPA);
            }
        }
    }

    public int getStartYear() {
        return startYear;
    }

    public double getEarnedGPA() {
        return earnedGPA;
    }

    @Override
    public void printAll() {
        super.printAll();
        System.out.print("   Start Year: " + startYear + ", GPA: ");
        System.out.printf("%.1f\n", earnedGPA);
    }
}
