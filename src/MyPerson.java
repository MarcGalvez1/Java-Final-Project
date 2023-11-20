import java.util.Scanner;


public class MyPerson {

    Scanner scnr = new Scanner(System.in);

    // Initialize private fields
    private String firstName = "John";
    private String lastName = "Doe";

    private int idNumber;

    protected static int baseIDNumber = 100000;

    public MyPerson() {
        //idNumber = setIDNumber();

    }

    public MyPerson(String fullName) {
        //idNumber = setIDNumber();
        setFullName(fullName);
    }

    public void setFullName(String name) {
        String fName;
        String lName;
        if ((name.indexOf(" ") == name.lastIndexOf(" ")) && name.contains(" ") && !name.isBlank()) {
            fName = scnr.next(name);
            lName = scnr.next(name);
            setFirstName(fName);
            setLLastName(lName);
        }
        else {
            if (name.isBlank()) {
                System.out.println("ERROR: Full Name must cannot be blank.");
            }
            else if (!name.contains(" ")) {
                System.out.println("ERROR: Full Name must have a space between 1st and last name.");
            }
            else if (name.indexOf(" ") != name.lastIndexOf(" ")) {
                System.out.println("ERROR: Full Name must cannot contain more than 1 space.");
            }

        }
    }
    public void setFirstName(String name) {
        if (!name.isEmpty() && !name.contains(" ")) {
            firstName = name;
        }
        else {
            if (name.isEmpty()) {
                System.out.println("ERROR: First Name cannot be blank.");
            } else if (name.contains(" ")) {
                System.out.println("ERROR: First name cannot contain a space.");
            }
        }
    }

    public void setLLastName(String name) {
        if (!name.isEmpty() && !name.contains(" ")) {
            lastName = name;
        }
        else {
            if (name.isEmpty()) {
                System.out.println("ERROR: Last Name cannot be blank.");
            } else if (name.contains(" ")) {
                System.out.println("\"ERROR: Last name cannot contain a space.");
            }
        }
    }



}
