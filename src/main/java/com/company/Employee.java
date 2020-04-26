package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class Employee {

    String first_name;
    String last_name;
    String team_lead;
    Departments department;
    int dob;
    private String phone_number;
    private int coop_year;
    int salary;
    private double fee;
    static int employees_quantity = 0;

    public Employee(String first_name, String last_name, int dob) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
    }

    String getPhone() {
        return phone_number;
    }
    void setPhone(String phone_number) {
        this.phone_number = phone_number;
    }

    int getSalary() {
        return salary;
    }
    void setSalary(int salary) {
        this.salary = salary;
    }

    int getCoopYear() {
        return coop_year;
    }
    void setCoopYear(int coop_year) {
        this.coop_year = coop_year;
        if (coop_year <= getCurrentYear()) {
            employees_quantity++;
            System.out.println("Employee was added, total: "+ employees_quantity);
        } else {
            System.out.println("Should be less than current year");
        }
    }

    Departments getDepartment() {
        return department;
    }
    void setDepartment(Departments department) {
        this.department = department;
    }

    public static int getCurrentYear() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar.setTime(new Date());
        return calendar.get(Calendar.YEAR);
    }
    public abstract void slogan();
    final public double fee() {
        double length_year = getCurrentYear() - getCoopYear();
        int department_bonus;
        double fee;
        switch (department) {
            case CEO:
                department_bonus = 1000;
                break;
            case QA:
                department_bonus = 50;
                break;
            case DEVELOPER:
                department_bonus = 500;
                break;
            case MANAGER:
                department_bonus = 100;
                break;
            case DESIGNER:
                department_bonus = 200;
                break;
            default:
                department_bonus = 0;
                break;
        }
        fee = salary * (1 + length_year/20) + department_bonus;
        return fee;
    }
    public void getLead() {
        switch(department) {
            case CEO:
                team_lead = "Sasha";
                break;
            case QA:
                team_lead = "Alyona";
                break;
            case DEVELOPER:
                team_lead = "Oleg";
                break;
            case MANAGER:
                team_lead = "Mike";
                break;
            case DESIGNER:
                team_lead = "Grigoriy";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + department);
        }
        System.out.println("Team lead is - " + team_lead);
        return;
    }

    void welcomeMessage() {
        System.out.println("Welcome to our Family");
    }
}