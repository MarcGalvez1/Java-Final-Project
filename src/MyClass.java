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
        courseName = courseName.trim();
        sectionNumber = sectionNumber.trim();
        setCourseName(courseName);
        setSectionNumber(sectionNumber);
        setCourseInstructor(courseInstructor);
    }
    public void setCourseName(String crsName) {
        crsName = crsName.trim();
        String leftCrsName = crsName.substring(0, 3);
        String rightCrsName = crsName.substring(4);
        String formattedCrsName;
        boolean isLetters = false;
        boolean isNumbers = false;

        for (int i = 0; i < leftCrsName.length(); i++) {
            char currLetter = leftCrsName.charAt(i);
            if (Character.isLetter(currLetter)) {
                isLetters = true;
            } else {
                isLetters = false;
                break;
            }
        }

        for (int i = 0; i < rightCrsName.length(); i++) {
            char currLetter = rightCrsName.charAt(i);
            if (Character.isDigit(currLetter)) {
                isNumbers = true;
            } else {
                isNumbers = false;
                break;
            }
        }

        if (crsName.length() == 7 && isLetters && isNumbers && crsName.charAt(3) ==  ' ') {
            leftCrsName = leftCrsName.toUpperCase();
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
        sectNumber = sectNumber.trim();
        String rightSectNumber = sectNumber.substring(1);
        boolean isNumbers = false;

        for (int i = 0; i < rightSectNumber.length(); i++) {
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
        String studentName = "";
        for (MyStudent student : courseList) {
            if (student.getEarnedGPA() > maxGPA) {
               maxGPA = student.getEarnedGPA();
               studentName = student.getFullName();
            }
        }
        System.out.println("In " + courseName + sectionNumber + ", " + studentName + " has the highest GPA of " + maxGPA + ".");
    }

    public void printMinYear() {
        int minYear = courseList.get(0).getStartYear();
        String studentName = "";
        for (MyStudent student : courseList) {
            if(student.getStartYear() < minYear) {
                minYear = student.getStartYear();
                studentName = student.getFullName();
            }
        }
        System.out.println("In " + courseName + sectionNumber + ", " + studentName + " has the earliest start date of " + minYear + ".");
    }

    public void printCourseList() {
        System.out.println("Course List: ");
        for (MyStudent student:courseList) {
            System.out.println(student.getFullName() + " - " + student.getIDNumber());
        }
        System.out.println("There are " + courseList.size() + " students in " + courseName);
        System.out.println();
    }

    public void printAll() {
        System.out.println(courseName + sectionNumber + ", thought by: " + courseInstructor.getFullName());
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
