package io.migenjutsu.projects.build_email_administration_application;

public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World");

        Email email = new Email("John", "Doe");

        email.setAlternateEmail("js@gmail.com");
        System.out.println("Alternate Email: "+email.getAlternateEmail());

        System.out.println(email.toString());

    }
}
