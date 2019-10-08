package io.migenjutsu.projects.build_email_administration_application;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailboxCapacity;
    private int defaultPasswordLength=10;
    private String alternateEmail;

// Constructor to recieve first & last names
    public Email(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;

// Call a method asking for the department - return the department
        this.department=setDepartment();
        System.out.println("Department Choice: "+this.department);

// Call a method that returns a random password
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your Password: "+this.password);
    }

// Ask for department 'setDepartment()'
    private String setDepartment() {
        System.out.print("Department Codes:\n1.Sales\n2.Development\n3.Accounting\n0.No Department\n");

        System.out.println("Enter Code: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice==1) { return "Sales"; }
        else if (choice==2) { return "Development"; }
        else if (choice==3) { return "Accounting"; }
        else if (choice==0) { return "No Department"; }
        else { return "ERROR!!"; }
    }

// Generate a random password
// Generate a random password
private String randomPassword(int length) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_-+={}[]:;'<>,.?/";
//        String Capital_chars = "ABCDEFGHIJLMNOPQRSTUVWXYZ";
//        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
//        String numbers = "1234567890";
//        String symbols = "!@#$%^&*()_-+=[]{};':<>,.?/";
//        String values = Capital_chars+Small_chars+numbers+symbols;

    char[] password = new char[length];
//        String[] password = new String[length];

    for (int i=0; i<length; i++) {
        int rand = (int) (Math.random() * passwordSet.length());
        password[i] = passwordSet.charAt(rand);
    }
//            password[i] = values.toString(rnd.nextInt(values.length()));
    return new String(password);
}



// Set the mailbox capacity

}



