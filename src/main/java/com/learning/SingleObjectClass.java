package com.learning;

//AM: [public , default]??
public class SingleObjectClass {

    //AM: [private, public, protracted, default]??
    private String name; // DM

    public final static SingleObjectClass instance = new SingleObjectClass("Mohit"); // single object

    //AM??
    private SingleObjectClass(String name) {
        this.name = name;
    }

    //AM??
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
