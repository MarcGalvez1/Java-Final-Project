import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyClass {
    private String courseName = "CPT 101";
    private String sectionNumber = "-001";
    private MyInstructor courseInstructor;
    ArrayList<MyStudent> courseList;

    public MyClass() {
        courseName = "CPT 101";
        sectionNumber = "-001";
    }
    public MyClass(String courseName, String sectionNumber, MyInstructor courseInstructor) {
        setCourseName(courseName);
        setSectionNumber(sectionNumber);
        setCourseInstructor(courseInstructor);
    }
    public void setCourseName(String crsName) {
        String leftCrsName = crsName.substring(0, 3);
        String rightCrsName = crsName.substring(4, crsName.length() + 1);
        String formattedCrsName;
        boolean isLetters = false;
        boolean isNumbers = false;

        for (int i = 0; i < 3; i++) {
            char currLetter = leftCrsName.charAt(i);
            if (Character.isLetter(currLetter)) {
                isLetters = true;
            } else {
                isLetters = false;
                break;
            }
        }

        for (int i = 0; i < 3; i++) {
            char currLetter = rightCrsName.charAt(i);
            if (Character.isDigit(currLetter)) {
                isNumbers = true;
            } else {
                isNumbers = false;
                break;
            }
        }

        if (crsName.length() == 7 && isLetters && isNumbers && crsName.charAt(3) ==  ' ') {
            formattedCrsName = leftCrsName + " " + rightCrsName;
            courseName = formattedCrsName;
        } else {
            if (crsName.length() != 7) {
                System.out.println("ERROR: The Course Name must be 7 characters long.");
            } else if (!isLetters) {
                System.out.println("ERROR: The Course Name must start with 3 letters.");
            } else if (crsName.charAt(3) != ' ') {
                System.out.println("ERROR: The Course name must have a space for the 4th character.");
            } else if (!isNumbers) {
                System.out.println("ERROR: The Course Name must end with 3 digits.");
            }
        }
    }
}
