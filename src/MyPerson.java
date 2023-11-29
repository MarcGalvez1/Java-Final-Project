import java.security.PublicKey;

public class MyPerson {

    // Initialize private fields
    private String firstName;
    private String lastName;

    private String idNumber;

    protected static int baseIDNumber = 100000;

    public MyPerson() {
        firstName = "John";
        lastName = "Doe";
        setIDNumber();

    }

    public MyPerson(String fullName) {
        setFullName(fullName);
        setIDNumber();
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

    public void setIDNumber() {
        baseIDNumber++;
        idNumber = "T00" + baseIDNumber;

    }

    public String getFullName () { return firstName + " " + lastName;}
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void printAll() {
        System.out.println(firstName + " " +lastName + idNumber);
    }

}
