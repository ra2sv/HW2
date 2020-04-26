package com.company;

public class DEVELOPER extends Employee{

    String structure;
    DEVELOPER (String first_name, String last_name, int dob, String structure) {
        super(first_name, last_name, dob);
        if (structure.matches("iOS") || structure.matches("Android")) {
            this.structure = structure;
        } else {
            System.out.print("For Developers 'Structure' should be one of: Android + iOS");
        }
    }
    public String getStructure() {
        return structure;
    }
    private String getStructure(String structure) {
        return structure;
    }
    public void slogan() {
        System.out.println("Slogan: Whole world is a matrix and I'm Neo");
    }
}
