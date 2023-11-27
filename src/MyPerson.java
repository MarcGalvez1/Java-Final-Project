import java.security.PublicKey;

public class MyPerson {

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
        int spaceIndex;
        if ((name.indexOf(" ") == name.lastIndexOf(" ")) && name.contains(" ") && !name.isBlank()) {
            spaceIndex = name.indexOf(" ");
            fName = name.substring(0, spaceIndex);
            lName = name.substring(spaceIndex +1);
            setFirstName(fName);
            setLastName(lName);
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

    public void setLastName(String name) {
        if (!name.isEmpty() && !name.contains(" ")) {
            lastName = name;
        }
        else {
            if (name.isEmpty()) {
                System.out.println("ERROR: Last Name cannot be blank.");
            } else if (name.contains(" ")) {
                System.out.println("ERROR: Last name cannot contain a space.");
            }
        }
    }

    public void setIdNumber() {
        baseIDNumber++;
        idNumber = baseIDNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
