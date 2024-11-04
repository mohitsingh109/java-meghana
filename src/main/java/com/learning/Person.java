package com.learning;

public class Person {

    private String name; //data member

    private String email; //data member

    private final String bankDetails; //data member

//    public Person() {
//        System.out.println("Hi i am called...");
//    }

    //All arg constructor
    public Person(String name, String email, String bankDetails) {
        this.name = name;
        this.email = email;
        this.bankDetails = bankDetails;
    }

    public Person(String bankDetails) {
        this(null, null, bankDetails); // calling a contructor
    }

    public Person(String name, String bankDetails) {
        this(name, null, bankDetails);
    }

    public void setName(String name) { // behaviour setter function
        this.name = name; // this refer to current object
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public void setBankDetails(String bankDetails) {
//        this.bankDetails = bankDetails;
//    }

    public String getName() {
        //print all the details
        printDetails();
        return name;
    }

    public String getEmail() {
        //print all the details
        printDetails();
        return email;
    }

    private void printDetails() {
        System.out.println("Name: " + name + ", Email: "+ email);
    }

    public String getBankDetails() {
        return bankDetails;
    }
}
