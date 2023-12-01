/* Marc Galvez
   November 30, 2023.
   CPT 236 - Java Programming
   Final Project
   This class is the base class for MyStudent and MyInstructor classes.
   This class assigns all MyStudent and MyInstructor objects with names and ID numbers

   *** The starting point for the Final Project ***
 */

import java.security.PublicKey;

/**
 * This class creates person objects as a base class for MyInstructor and MyStudent classes.
 * @author Marc Galvez
 * @version 1.0
 */
public class MyPerson {

    // Initialize private fields
    private String firstName;
    private String lastName;

    private String idNumber;

    protected static int baseIDNumber = 100000;

    /**
     *This is the default constructor to initialize private fields.
     */
    public MyPerson() { // Default constructor to initialize private fields and set IDNumbers for all people
        firstName = "John";
        lastName = "Doe";
        setIDNumber();

    }

    /**
     * This sets the firstName and lastName private fields by calling fullName method.
     * @param fullName String argument.
     */
    public MyPerson(String fullName) { // Other constructor to set full name and ID number
        setFullName(fullName);
        setIDNumber();
    }

    /**
     * Separate the full name into 2 strings to set firstName and lastName
     * @param name String argument.
     */
    public void setFullName(String name) {
        // Separates name into 2 to set first and last name
        // Variables
        name = name.trim();
        String fName;
        String lName;
        int spaceIndex;
        if ((name.indexOf(" ") == name.lastIndexOf(" ")) && name.contains(" ") && !name.isBlank()) {
            // Sets 1st and last name by separating the full name into 2 if all conditions passed
            spaceIndex = name.indexOf(" ");
            fName = name.substring(0, spaceIndex);
            lName = name.substring(spaceIndex +1);
            setFirstName(fName);
            setLastName(lName);
        }
        else {
            if (name.isBlank()) { // Name can not be blank
                System.out.println("ERROR: Full Name must cannot be blank.");
            }
            else if (!name.contains(" ")) { // name must contain a space
                System.out.println("ERROR: Full Name must have a space between 1st and last name.");
            }
            else if (name.indexOf(" ") != name.lastIndexOf(" ")) { // can not contain more than 1 space
                System.out.println("ERROR: Full Name must cannot contain more than 1 space.");
            }

        }
    }

    /**
     * sets the firstName private field after validating the name.
     * @param name String argument.
     */
    public void setFirstName(String name) { // sets the 1st name
        name = name.trim();
        if (!name.isEmpty() && !name.contains(" ")) { // sets fistName if all conditions passed
            firstName = name;
        }
        else {
            if (name.isEmpty()) { // Error if name is blank
                System.out.println("ERROR: First Name cannot be blank.");
            } else if (name.contains(" ")) { // Error if name contains a space
                System.out.println("ERROR: First name cannot contain a space.");
            }
        }
    }

    /**
     * Sets the lastName privateField after validating the name argument.
     * @param name String argument.
     */
    public void setLastName(String name) {
        // Sets lastname
        name = name.trim();
        if (!name.isEmpty() && !name.contains(" ")) { // Sets last name if all conditions passed
            lastName = name;
        }
        else {
            if (name.isEmpty()) { // can not be blank
                System.out.println("ERROR: Last Name cannot be blank.");
            } else if (name.contains(" ")) { // can not contain a space
                System.out.println("ERROR: Last name cannot contain a space.");
            }
        }
    }

    /**
     * Sets the idNumber after incrementing the baseIDNumber
     */
    public void setIDNumber() { // Sets and increments ID number
        baseIDNumber++;
        idNumber = "T00" + baseIDNumber;

    }

    /**
     * Returns the person object's first and last name
     * @return String fullName
     */
    public String getFullName () { // Returns full name
         return firstName + " " + lastName;
    }

    /**
     * Returns the value of the person object's last name
     * @return String firstName
     */
    public String getFirstName() { // returns first name
        return firstName;
    }

    /**
     * Returns the person object's last name.
     * @return String lastName
     */
    public String getLastName() { // returns last name
        return lastName;
    }

    /**
     * Returns the person object's IDNumber
     * @return String idNumber
     */
    public String getIDNumber() { // returns id number
        return idNumber;
    }

    /**
     * Displays the person object's full name and IDNumber
     */
    public void printAll() { // displays full name and id number
        System.out.println(firstName + " " + lastName + ", " + idNumber);
    }

}
