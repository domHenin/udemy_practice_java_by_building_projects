package io.migenjutsu.projects.build_email_administration_application;

import java.util.Random;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

// Constructor to recieve first & last names
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: "+this.firstName+" "+this.lastName);

// Call a method asking for the department - return the department
        this.department=setDepartment();
        System.out.println("Department: "+this.department);

    }

// Ask for department 'setDepartment()'
    private String setDepartment() {
        System.out.print("Department Codes::\n1. Sales\n2. Development\n3. Accounting\n0. No Department");
        System.out.print("\nEnter Code: ");
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        if (choice==1) { return "Sales"; }
        else if (choice==2) { return "Development"; }
        else if (choice==3) { return "Accounting"; }
        else { return "None"; }
    }

// Generate a random password
//    private String setPassword() {
//        Random rnd = new Random();
//    }
// Set the mailbox capacity

}



