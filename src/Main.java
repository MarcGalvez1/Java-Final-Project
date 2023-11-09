/* Your name
   Date
   CPT 236 - Java Programming
   Final Project

   *** The starting point for the Final Project ***
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // *************************************************************
        // This code is made available to students as a 'starting file'
        //  *** DO NOT MODIFY THIS CODE! ***

        // Create people (instructors and students)
        MyInstructor gFiori = new MyInstructor("George Fiori", 1999, 62250);
        MyStudent pJones = new MyStudent("Paul Jones", 2017, 3.0);
        MyStudent rReeves = new MyStudent("Robert Reeves", 2019, 2.8);
        MyStudent mAllen = new MyStudent("Meg Allen", 2018, 3.7);
        MyStudent wLevi = new MyStudent("William Levi", 2017, 2.5);
        MyStudent aSmith = new MyStudent("Ann Smith", 2016, 2.9);
        MyInstructor pSmith = new MyInstructor("Phil Smith", 2000, 64750);
        MyStudent bKennedy = new MyStudent("Bob Kennedy", 2018, 1.8);
        MyStudent jGilbert = new MyStudent("Jerry Gilbert", 2019, 3.2);
        MyStudent zBooth = new MyStudent("Zach Booth", 2017, 2.5);
        MyStudent sSavoca = new MyStudent("Sam Savoca", 2019, 2.6);
        MyStudent jEvans = new MyStudent("Julie Evans", 2019, 2.2);
        MyInstructor bCarson = new MyInstructor();
        MyStudent nMcMillian = new MyStudent("Nancy McMillian", 2018, 3.4);
        MyStudent cPhilo = new MyStudent("Cameron Philo", 2019, 2.7);
        MyStudent jQueen = new MyStudent("Jeanne Queen", 2017, 1.8);
        MyStudent dCiao = new MyStudent("Daniel Ciao", 2019, 3.9);
        MyStudent fDeLeo = new MyStudent("Frank DeLeo", 2018, 3.3);

        // Create classes
        MyClass CPT234 = new MyClass("CPT 234", "-001", gFiori);
        MyClass IST222 = new MyClass("IST 222", "-003", pSmith);

        // *****************************************************************

        // Code below here to be written by students

        // Enter Billy Carson's data (using setters for
        //  first name, last name, hire year, and base salary)

        // Update Julie Evans to Julie Randall (she got married)

        // Add the first 10 students to CPT 234 (in the order listed above)
        // starting with Paul Jones and ending with Julie (Evans) Randall

        // Add the last 10 student to IST 222 (in the order listed above)
        // starting with Bob Kennedy and ending with Frank DeLeo

        // Display the CPT 234 info

        // Display the IST 222 info

        // Display Billy Carson's info

        // Display CPT 234 student with earliest start year

        // Display IST 222 student with highest GPA

    }
}