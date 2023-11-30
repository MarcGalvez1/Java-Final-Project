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

        // Test MyStudent class
        System.out.println("Tests of 'MyStudent' class");
        // Test the default constructor
        // Stopped testing things from MyPerson class like name because they work.
        MyStudent testStudent1 = new MyStudent();
        if (testStudent1.getStartYear() != 2018) // tests default start year
            System.out.println("testStudent1.getStartYear failed - returned " + testStudent1.getStartYear());
        if (testStudent1.getEarnedGPA() != 3.0)
            System.out.println("testStudent1.getEarnedGPA failed - returned " + testStudent1.getEarnedGPA());

        // Test other constructor
        MyStudent testStudent2 = new MyStudent("Marc Galvez", 2016, 3.1);
        if (testStudent2.getStartYear() != 2016)
            System.out.println("testStudent2.getStartYear failed - returned " + testStudent2.getStartYear());
        if (testStudent2.getEarnedGPA() != 3.1)
            System.out.println("testStudent2.getEarnedGPA failed - returned " + testStudent2.getEarnedGPA());

        // Test setStartYear method
        testStudent2.setStartYear(2019); // No Error checking for inclusivity
        testStudent2.setStartYear(2010); // No Error checking for inclusivity
        System.out.print("1. ");
        testStudent2.setStartYear(2020); // Error startYear > 2019
        System.out.print("2. ");
        testStudent2.setStartYear(2009); // Error startYear < 2010

        // Test setEarnedGPA
        testStudent2.setEarnedGPA(0.0); // No Error checking for inclusivity
        testStudent2.setEarnedGPA(4.0); // No Error checking for inclusivity
        System.out.print("3. ");
        testStudent2.setEarnedGPA(-0.1); // -0.1 < 0.0
        System.out.print("4. ");
        testStudent2.setEarnedGPA(4.1); // 4.1 > 4.0

        System.out.println("There should be 4 errors.");

        // Test printAll
        System.out.println("Compare:");
        System.out.println("Marc Galvez, T00100024");
        System.out.println("   Start Year: 2020, GPA: 4.0");
        testStudent2.printAll();

        System.out.println("Tests of 'MyStudent' complete");
        System.out.println("****************************");

        // Test MyClass class
        System.out.println("Tests of 'MyClass' class");

        //Test default constructor
        MyClass testClass1 = new MyClass();
        if (!testClass1.getCourseName().equals("CPT 101"))
            System.out.println("testClass1.getCourseName failed - returned " + testClass1.getCourseName());
        if (!testClass1.getSectionNumber().equals("-001"))
            System.out.println("testClass1.getSectionNumber failed - returned " + testClass1.getSectionNumber());

        // Test of other constructor
        MyClass testClass2 = new MyClass("IST 256", "-002", testInstructor2);
        if (!testClass2.getCourseName().equals("IST 256"))
            System.out.println("testClass2.getCourseName failed - returned " + testClass2.getCourseName());
        if (!testClass2.getSectionNumber().equals("-002"))
            System.out.println("testClass2.getSectionNumber failed - returned " + testClass2.getSectionNumber());
        if (!testClass2.getCourseInstructor().getFullName().equals("Marc Galvez"))
            System.out.println("testClass2.getCourseInstructor failed - returned " + testClass2.getCourseInstructor().getFullName()); // tests that the course instructor is set correctly

        // Test setCourseName
        testClass2.setCourseName("  CPT 256"); // No Error
        testClass2.setCourseName("  cpt 256  "); // No Error caps shouldn't matter
        System.out.print("1. ");
        testClass2.setCourseName("  CPT 2567"); // Error > 7 characters
        System.out.print("2. ");
        testClass2.setCourseName("Ct 256  "); // Error < 7 character
        System.out.print("3. ");
        testClass2.setCourseName(" Cp 2567 "); // Error Must start with 3 characters
        System.out.print("4. ");
        testClass2.setCourseName("CPT2 56 "); // Error no space in the 4th character
        System.out.print("5. ");
        testClass2.setCourseName("CPT 3A4"); // Must end with 3 numbers

        // Test setSectionNumber
        testClass2.setSectionNumber("-003"); // No Error
        System.out.print("6. ");
        testClass2.setSectionNumber("0003"); // Error must have - at the beginning
        System.out.print("7. ");
        testClass2.setSectionNumber("-00"); // Error must have 3 characters after the dash
        System.out.print("8. ");
        testClass2.setSectionNumber("-00A"); // Error must have 3 digits after dash
        System.out.println("There should be 8 errors.");

        // Test print statements
        MyStudent testStudent3 = new MyStudent("Test One", 2018, 4.0 );
        MyStudent testStudent4 = new MyStudent("Test Two", 2019, 3.1);
        MyStudent testStudent5 = new MyStudent("Test Three", 2016, 2.0);

        testClass2.addStudent(testStudent3);
        testClass2.addStudent(testStudent4);
        testClass2.addStudent(testStudent5);

        // Test printAll
        System.out.println("Compare:");
        System.out.println("CPT 256-001, taught by: Marc Galvez");
        testClass2.printAll();

        // Test printCourseList
        System.out.println("Compare:");
        System.out.println("Test One - T00100025");
        System.out.println("Test Two - T00100026");
        System.out.println("Test Three - T00100027");
        testClass2.printCourseList();


        // Test printMinYear
        System.out.println("Compare:");
        System.out.println("In CPT 256-003, Test Three has the earliest start date of 2016.");
        testClass2.printMinYear();

        // Test printMaxGpa
        System.out.println("Compare:");
        System.out.println("In CPT 256-003, Test One has the highest GPA of 4.0.");
        testClass2.printMaxGpa();

        System.out.println("Tests of 'MyStudent' complete");
        System.out.println("****************************");
    }
}
