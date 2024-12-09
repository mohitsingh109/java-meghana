package com.learning;


//java --> .class --> JVM --> load all the static data --> trigger main
public class Student {

    String name; // object variable

    static int count = 0; // class variable

    public Student(String name) {
        this.name = name;
        count++;
    }

    // Object Function
    // Data Member Function
    // Instance variable Function
    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    //class function
    //static function
    // We can't use object variable inside a static function
    public static void incrementCount() {
        count++;
        //System.out.println(name);
    }

//    public static void printName() {
//        System.out.println(name);
//    }

    // nested class...


    public Student returnCurrentStudent() {
        return this;
    }


    public void test() {
        //int messageCount = 1; // yes
    }

    public String toString() {
        return "Name :" + name + " Age: , Address: {}" ;
    }
}
