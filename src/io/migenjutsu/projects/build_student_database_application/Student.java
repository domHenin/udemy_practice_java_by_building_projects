package io.migenjutsu.projects.build_student_database_application;

import java.util.Scanner;

public class Student {
    private String firsName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses=null;
    private double tuitionBalance=0;
    private static double costOfCourse=600;
    private static int id=1000;

// Constructor: prompt user to enter students name&year
    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's First Name: ");
        this.firsName=scanner.nextLine();

        System.out.print("Enter student's Last Name: ");
        this.lastName=scanner.nextLine();

        System.out.print("1. Freshmen\n2. Sophomore\n3. Junior\n4. Senior\nEnter student's Current Year: ");
        this.gradeYear=scanner.nextInt();

        setStudentID();

        System.out.println(firsName+" "+lastName+" "+gradeYear+" "+studentID);
    }

// Generate an ID
    private void setStudentID() {
        // Grade level + ID
        id++;
        this.studentID =  gradeYear+""+id;
    }

// Enroll in courses
    public void enrol() {
// Get inside a loop, user hit 0
        do {
            System.out.print("Enter Course to Enrol: ([Q]uit)");
            Scanner scanner = new Scanner(System.in);

            String course = scanner.nextLine();

            if (!course.equals("Q".toLowerCase())) {
                courses = courses + "\n" + course;
                tuitionBalance=tuitionBalance+costOfCourse;

                System.out.println("Enrolled in: "+courses);
                System.out.println("Tuition Balance: "+tuitionBalance);
            } else { break; }
        } while (1 != 0);
    }

// View balance and pay tuition.

// Show status

}
