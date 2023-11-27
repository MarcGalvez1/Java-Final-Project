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



}
