package com.company;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Employee QA1 = new QA("Sergey", "Veremienko", 1989);
        QA1.setCoopYear(2018);
        QA1.setDepartment(Departments.QA);
        QA1.setPhone("778-93-88");
        QA1.setSalary(1000);
        System.out.println("Current Fee: " + QA1.fee());
        QA1.slogan();
        QA1.getLead();
        QA1.welcomeMessage();


        //
        System.out.println();

        Employee DEV1 = new DEVELOPER("Anton", "Ermolov", 1989, "iOS");
        DEV1.setCoopYear(2020);
        DEV1.setDepartment(Departments.DEVELOPER);
        DEV1.setPhone("0502385866");
        DEV1.setSalary(2000);
        System.out.println("Current Fee: " + DEV1.fee());
        DEV1.slogan();
        DEV1.getLead();
        DEV1.welcomeMessage();
    }
}
