package com.company;

public class QA extends Employee{

    QA (String first_name, String last_name, int dob) {
        super(first_name, last_name, dob);
    }
    public void slogan() {
        System.out.println("Slogan: Сry because I'm your nightmare");
    }
    @Override
    void welcomeMessage() {
        System.out.println("Welcome to our Team");
    }

}
