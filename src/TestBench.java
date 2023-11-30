public class TestBench {
    public void testProject() {
        System.out.println("****************************");
        System.out.println("Testing the 'MyPerson' class");

        // Test default constructor
        MyPerson testPerson1 = new MyPerson();
        if (!testPerson1.getFullName().equals("John Doe"))
            System.out.println("testPerson1.getFullName failed - returned " + testPerson1.getFullName());
        if (!testPerson1.getIDNumber().equals("T00100019"))
            System.out.println("testPerson1.getIDNumber failed - returned " + testPerson1.getIDNumber());
        if (!testPerson1.getFirstName().equals("John"))
            System.out.println("testPerson1.getFirstName failed - returned " + testPerson1.getFirstName());
        if (!testPerson1.getLastName().equals("Doe"))
            System.out.println("testPerson1.getLastName failed - returned " + testPerson1.getLastName());

        // Test additional constructor
        MyPerson testPerson = new MyPerson("George Fiori");
        if (!testPerson.getFullName().equals("George Fiori"))
            System.out.println("testPerson.getFullName failed - returned " + testPerson.getFullName());
        if (!testPerson.getIDNumber().equals("T00100020"))
            System.out.println("testPerson.getIDNumber failed - returned " + testPerson.getIDNumber());
        if (!testPerson.getFirstName().equals("George"))
            System.out.println("testPerson.getFirstName failed - returned " + testPerson.getFirstName());
        if (!testPerson.getLastName().equals("Fiori"))
            System.out.println("testPerson.getLastName failed - returned " + testPerson.getLastName());

        // test setFullName
        testPerson.setFullName("  George Fiori  "); // No error
        System.out.print("1. ");
        testPerson.setFullName(""); // Cannot be blank error
        System.out.print("2. ");
        testPerson.setFullName("  GeorgeFiori  "); // Missing space error
        System.out.print("3. ");
        testPerson.setFullName("  George  Fiori  "); // Too many spaces error

        //Test setFirstName
        testPerson.setFirstName("  George  "); // No error
        System.out.print("4. ");
        testPerson.setFirstName(""); // Cannot be blank error
        System.out.print("5. ");
        testPerson.setFirstName("George Fiori"); // Cannot have a space error

        // Test setLastName
        testPerson.setLastName("  Fiori  "); // No error
        System.out.print("6. ");
        testPerson.setLastName(""); // Cannot be blank error
        System.out.print("7. ");
        testPerson.setLastName("George Fiori"); // Cannot have a space error

        System.out.println("There should be 7 errors.");

        // Test printAll
        System.out.println("Compare:");
        System.out.println("George Fiori, T00100020");
        testPerson.printAll();

        System.out.println("Tests of 'MyPerson' complete");
        System.out.println("****************************");

        // Test MyInstructor Class
        System.out.println("Tests of 'MyInstructor' class");

        // Test Default constructor
        MyInstructor testInstructor1 = new MyInstructor();
        if (!testInstructor1.getFullName().equals("John Doe"))
            System.out.println("testInstructor1.getFullName failed - returned " + testInstructor1.getFullName());
        if (!testInstructor1.getIDNumber().equals("T00100021"))
            System.out.println("testInstructor1.getIDNumber failed - returned " + testInstructor1.getIDNumber());
        if (!testInstructor1.getFirstName().equals("John"))
            System.out.println("testInstructor1.getFirstName failed - returned " + testInstructor1.getFirstName());
        if (!testInstructor1.getLastName().equals("Doe"))
            System.out.println("testInstructor1.getLastName failed - returned " + testInstructor1.getLastName());
        if(testInstructor1.getHiredYear() != 2000) {
            System.out.println("testInstructor1.getHiredYear failed - returned " + testInstructor1.getHiredYear());
        }
        if (testInstructor1.getBaseSalary() != 20000) {
            System.out.println("testInstructor1.getBaseSalary failed - returned " + testInstructor1.getBaseSalary());
        }

        // Test other constructor
        // Test additional constructor
        MyInstructor testInstructor2 = new MyInstructor("George Fiori", 2019, 99_999);
        if (!testInstructor2.getFullName().equals("George Fiori"))
            System.out.println("testInstructor2.getFullName failed - returned " + testInstructor2.getFullName());
        if (!testInstructor2.getIDNumber().equals("T00100022"))
            System.out.println("testInstructor2.getIDNumber failed - returned " + testInstructor2.getIDNumber());
        if (!testInstructor2.getFirstName().equals("George"))
            System.out.println("testInstructor2.getFirstName failed - returned " + testInstructor2.getFirstName());
        if (!testInstructor2.getLastName().equals("Fiori"))
            System.out.println("testInstructor2.getLastName failed - returned " + testInstructor2.getLastName());
        if (testInstructor2.getHiredYear() != 2019)
            System.out.println("testInstructor2.getLastName failed - returned " + testInstructor2.getHiredYear());
        if (testInstructor2.getBaseSalary() != 99_999)
            System.out.println("testInstructor2.getLastName failed - returned " + testInstructor2.getBaseSalary());
        System.out.println();

        // test setFullName
        testInstructor2.setFullName("  Marc Galvez  "); // No error
        System.out.print("1. ");
        testInstructor2.setFullName(""); // Cannot be blank error
        System.out.print("2. ");
        testInstructor2.setFullName("  MarcGalvez  "); // Missing space error
        System.out.print("3. ");
        testInstructor2.setFullName("  Ma rc Galvez  "); // Too many spaces error

        //Test setFirstName
        testInstructor2.setFirstName("  Marc  "); // No error
        System.out.print("4. ");
        testInstructor2.setFirstName(""); // Cannot be blank error
        System.out.print("5. ");
        testInstructor2.setFirstName("Marc Galvez"); // Cannot have a space error

        // Test setLastName
        testInstructor2.setLastName("  Galvez  "); // No error
        System.out.print("6. ");
        testInstructor2.setLastName(""); // Cannot be blank error
        System.out.print("7. ");
        testInstructor2.setLastName("  Galv ez  "); // Cannot have a space error

        // Test setHireYear
        testInstructor2.setHiredYear(1963); // No Error
        testInstructor2.setHiredYear(2019); // No error
        System.out.print("8. ");
        testInstructor2.setHiredYear(1962); // Cannot be < 1963
        System.out.print("9. ");
        testInstructor2.setHiredYear(2020); // Cannot be > 2019

        // Test setBaseSalary
        testInstructor2.setBaseSalary(0.00); // no error
        testInstructor2.setBaseSalary(100_000.00); // no error
        System.out.print("10. ");
        testInstructor2.setBaseSalary(-0.01); // can not be less than 0.00
        System.out.print("11. ");
        testInstructor2.setBaseSalary(100_000.01); // cannot be more than 100,000.00
        System.out.println();


        System.out.println("There should be 11 errors.");

        // Test printAll
        System.out.println("Compare:");
        System.out.println("Marc Galvez, T00100022");
        System.out.println("   Year hired: 2019, Salary: $100000.00");
        testInstructor2.printAll();

        System.out.println("Tests of 'MyInstructor' complete");
        System.out.println("****************************");
        System.out.println();
    }
}
