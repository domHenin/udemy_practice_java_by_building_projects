package io.migenjutsu.projects.build_student_database_application;

import java.util.Scanner;

public class Student {
    private String firsName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private double tuitionBalance;
    private double costOfCourse=600;

// Constructor: prompt user to enter students name&year
    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's First Name: ");
        this.firsName=scanner.nextLine();

        System.out.println("Enter student's Last Name: ");
        this.lastName=scanner.nextLine();

        System.out.println("1. Freshmen\n2. Sophomore\n3. Junior\n4. Senior\nEnter student's Current Year: ");
        this.gradeYear=scanner.nextInt();
        System.out.println(firsName+" "+lastName+" "+gradeYear);
    }

// Generate an ID

// Enroll in courses

// View balance and pay tuition.

// Show status

}
