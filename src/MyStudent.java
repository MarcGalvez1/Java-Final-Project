public class MyStudent extends MyPerson{
    private int startYear = 2018;
    private  double earnedGPA = 3.0;

    public MyStudent() {
        setIDNumber();
    }

    public MyStudent(String fullName, int startYear, double earnedGPA) {
        setFullName(fullName);
        setStartYear(startYear);
        setEarnedGPA(earnedGPA);
    }

    public void setStartYear(int year) {
        if (year >= 2010 && year <= 2019) {
            startYear = year;
        } else {
            if (year < 2010) {
                System.out.println("ERROR: Start Year cannot be less than 2010.");
            }
            if (year > 2019) {
                System.out.println("ERROR: Start Year cannot be greater than 2019.");
            }
        }
    }


}
