package com.singleton.sample;

public class Citizen {
    
    private String FirstName;
    private String LastName;
    private String DOB;

    public Citizen(String firstName, String lastName, String dob) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.DOB = dob;
    }

    public String getData() {
        return "{FIRST_NAME:\"" + FirstName + "\", LAST_NAME:\"" + LastName + "\", DATE_OF_BIRTH:\"" + DOB  + "\"}";
    }
}
