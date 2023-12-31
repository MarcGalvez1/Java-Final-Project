/* Marc Galvez
   November 30, 2023.
   CPT 236 - Java Programming
   Final Project
   The MyClass class is used to store and create classes at tri-county.
   MyClass displays the courseList from an ArrayList.

   *** The starting point for the Final Project ***
 */
import java.util.ArrayList;

/**
 *    The MyClass class is used to store and create classes at tri-county.
 *    MyClass displays the courseList from an ArrayList.
 * @author Marc Galvez
 * @version 1.0
 */
public class MyClass {
    // Private variables
    private String courseName = "CPT 101";
    private String sectionNumber = "-001";
    private MyInstructor courseInstructor;
    ArrayList<MyStudent> courseList = new ArrayList<>();

    /**
     * The default constructor initializes the courseName and section number to CPT 101-001
     */
    public MyClass() {
        // Default constructor to initialize the private variables.
        courseName = "CPT 101";
        sectionNumber = "-001";
    }

    /**
     * This constructor calls the setter methods to set the courseName, sectionNumber, and courseInstructor private fields.
     * @param courseName String argument
     * @param sectionNumber String argument
     * @param courseInstructor String argument
     */
    public MyClass(String courseName, String sectionNumber, MyInstructor courseInstructor) {
        // This constructor sets the courseName, sectionNumber, and courseInstructor
        courseName = courseName.trim();
        sectionNumber = sectionNumber.trim();
        setCourseName(courseName);
        setSectionNumber(sectionNumber);
        setCourseInstructor(courseInstructor);
    }

    /**
     * This method validates the courseName inputted to ensure that the courseName is:
     * 7 characters long,
     * The 1st 3 characters are letters,
     * The last 3 characters are numbers,
     * and that there is a space in the 3rd index
     * It then ensures that the 1st 3 characters are capitalized.
     * @param crsName String argument
     */
    public void setCourseName(String crsName) {
        // Set the variable courseName to equal the crsName argument
        // Variables
        crsName = crsName.trim();
            // Separates the 1st 3 characters before the space from the last 3 characters
        String leftCrsName = crsName.substring(0, 3);
        String rightCrsName = crsName.substring(4);
        String formattedCrsName;
            // used for validating that the left and right sides of the strings are either letters or numbers respectively
        boolean isLetters = false;
        boolean isNumbers = false;

        for (int i = 0; i < leftCrsName.length(); i++) {
            // Ensures that each character of the left side of the string is a letter.
            char currLetter = leftCrsName.charAt(i);
            if (Character.isLetter(currLetter)) {
                isLetters = true;
            } else {
                isLetters = false;
                break;
            }
        }

        for (int i = 0; i < rightCrsName.length(); i++) {
            // Ensures that each character on the right side of the string is a number
            char currLetter = rightCrsName.charAt(i);
            if (Character.isDigit(currLetter)) {
                isNumbers = true;
            } else {
                isNumbers = false;
                break;
            }
        }

        if (crsName.length() == 7 && isLetters && isNumbers && crsName.charAt(3) ==  ' ') {
            // Assigns the formatted course name to courseName if the string passes the validation
            leftCrsName = leftCrsName.toUpperCase();
            formattedCrsName = leftCrsName + " " + rightCrsName;
            courseName = formattedCrsName;
        } else {
            if (crsName.length() != 7) { // Error if string != 7
                System.out.println("ERROR: The Course Name must be 7 characters long.");
            } else if (!isLetters) { // Error if 1 character is not a letter on the left side of the string
                System.out.println("ERROR: The Course Name must start with 3 letters.");
            } else if (crsName.charAt(3) != ' ') { // 4th char must be a space
                System.out.println("ERROR: The Course name must have a space for the 4th character.");
            } else if (!isNumbers) { // Error if 1 character is not a number on the right side of the string
                System.out.println("ERROR: The Course Name must end with 3 digits.");
            }
        }
    }

    /**
     * This method ensures the section number has a dash in index 0, has 3 characters after the dash, and that those 3 characters are numbers.
     * @param sectNumber String input
     */
    public void setSectionNumber(String sectNumber) {
        // sets the sectionNumber private variable
        // Variables
        sectNumber = sectNumber.trim();
            // Separates the right side of the string from '-'
        String rightSectNumber = sectNumber.substring(1);
            // used to validate that the right side is all numbers
        boolean isNumbers = false;

        for (int i = 0; i < rightSectNumber.length(); i++) {
            // for each character on the right side of the string ensure that it is a number
            char currNumber = rightSectNumber.charAt(i);
            if (Character.isDigit(currNumber)) {
                isNumbers = true;
            } else {
                isNumbers = false;
                break;
            }
        }
        if (sectNumber.charAt(0) == '-' && rightSectNumber.length() == 3 && isNumbers) {
            // assign sectNumber to sectionNumber if it passes all validations
            sectionNumber = sectNumber;
        } else {
            if (sectNumber.charAt(0) != '-') { // Error if the 1st character isn't a dash
                System.out.println("ERROR: Section Number must start with a dash.");
            } else if (rightSectNumber.length() != 3) { // Error if the string does not have 3 characters on the right
                System.out.println("ERROR: Section numbers must be 3 characters after the dash.");
            } else if (!isNumbers) { // Error if the 3 characters isn't numbers
                System.out.println("ERROR: Section numbers must be 3 numbers after the dash.");
            }
        }
    }

    /**
     * This sets the course instructor of the class object.
     * @param instructor object argument
     */
    public void setCourseInstructor(MyInstructor instructor) { // Set course instructor no validations
        courseInstructor = instructor;
    }

    /**
     * This method adds student object to the ArrayList courseList.
     * @param student object method
     */
    public void addStudent(MyStudent student)  { // Adds students to the ArrayList
        courseList.add(student);
    }


    /**
     * This method displays the student in the class object who has the highestGPA
     *
     */
    public void printMaxGpa() { // displays the student with the highest gpa in the ArrayList
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

    /**
     * This method displays the student who in the clas who started the earliest.
     */
    public void printMinYear() { // displays the student who started school the earliest
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


    /**
     * This method displays all the student taking the class.
     */
    public void printCourseList() { // Displays all students in the class
        System.out.println("Course List: ");
        for (MyStudent student:courseList) {
            System.out.println(student.getFullName() + " - " + student.getIDNumber());
        }
        // Displays number of students in the class
        System.out.println("There are " + courseList.size() + " students in " + courseName);
        System.out.println();
    }

    /**
     * This method displays the class information like: courseName, sectionNumber, and courseInstructor's full name.
     */
    public void printAll() { // Displays the specific class and the professor of the class
        System.out.println(courseName + sectionNumber + ", taught by: " + courseInstructor.getFullName());
    }

    /**
     * this method returns the class object's courseName
     * @return String courseName
     */
    public String getCourseName()  { // returns the value of courseName

        return courseName;
    }

    /**
     * this method returns the class object's sectionNumber
     * @return String sectionNumber
     */
    public String getSectionNumber()
    { // returns the value of sectionNumber
        return sectionNumber;
    }

    /**
     * This method returns the class object's courseInstructor.
     * @return object courseInstructor
     */
    public MyInstructor getCourseInstructor() { // returns the value of courseInstructor

        return courseInstructor;
    }

}
