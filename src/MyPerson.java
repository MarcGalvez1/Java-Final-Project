public class MyPerson {
    // Initialize private fields
    private String firstName = "John";
    private String lastName = "Doe";

    private int idNumber;

    protected static int baseIDNumber = 100000;

    public MyPerson() {
        idNumber = setIDNumber();

    }

    public MyPerson(String fullName) {
        idNumber = setIDNumber();
        setFullName(fullName);
    }

    public void setFirstName(String name) {
        if (!name.isEmpty() && !name.contains(" ")) {
            firstName = name;
        }
        else {
            if (name.isEmpty()) {
                System.out.println("ERROR: First Name cannot be blank.");
            } else if (name.contains(" ")) {
                System.out.println("\"ERROR: First name cannot contain a space.");
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
