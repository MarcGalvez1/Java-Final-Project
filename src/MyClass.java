import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyClass {
    private String courseName = "CPT 101";
    private String sectionNumber = "-001";
    private MyInstructor courseInstructor;
    ArrayList<MyStudent> courseList = new ArrayList<MyStudent>();

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

    public void setSectionNumber(String sectNumber) {
        String rightSectNumber = sectNumber.substring(1);
        boolean isNumbers = false;

        for (int i = 0; i < 3; i++) {
            char currNumber = rightSectNumber.charAt(i);
            if (Character.isDigit(currNumber)) {
                isNumbers = true;
            } else {
                isNumbers = false;
                break;
            }
        }
        if (sectNumber.charAt(0) == '-' && rightSectNumber.length() == 3 && isNumbers) {
            sectionNumber = sectNumber;
        } else {
            if (sectNumber.charAt(0) != '-') {
                System.out.println("ERROR: Section Number must start with a dash.");
            } else if (rightSectNumber.length() != 3) {
                System.out.println("ERROR: Section numbers must be 3 characters after the dash.");
            } else if (!isNumbers) {
                System.out.println("ERROR: Section numbers must be 3 numbers after the dash.");
            }
        }
    }

    public void setCourseInstructor(MyInstructor instructor) {
        courseInstructor = instructor;
    }

    public void addStudent(MyStudent student) {
        courseList.add(student);
    }

    public void printMaxGpa() {
        double maxGPA = 0.0;
        String student;
        for (MyStudent student: courseList) {
            if (student.getEarnedGPA() > maxGPA) {
               maxGPA = student.getEarnedGPA();
               student = student.get
            }
        }
        System.out.print(maxGPA);
    }

    public void printMinYear() {
        int minYear = 2010;

    }

    public String getCourseName() {
        return courseName;
    }

    public String getSectionNumber() {
        return sectionNumber;
    }

    public MyInstructor getCourseInstructor() {
        return courseInstructor;
    }

}
