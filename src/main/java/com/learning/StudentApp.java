package com.learning;

public class StudentApp {

    public static void main(String[] args) {
        Student s1 = new Student("Mohit");// c = 1
        Student s2 = s1.returnCurrentStudent();

        System.out.println(s1.toString());

        int count = 1;

        s2.name = "Hack";

//        Student s2 = new Student("Karan"); // c = 2
//        Student s3 = new Student("Aman");// c = 3
//
//        System.out.println(s2.getName());
//        // what out you are expecting???
//        //System.out.println(Student.getName());
//
//        Student.incrementCount(); // c = 4
//
//        System.out.println(Student.count);
        int count1 = Student.count;
        System.out.println(count); // 1
        count = 100;

        System.out.println(Student.count); // 100? No

        //
//        System.out.println(s1.getCount());
////        //....
//
//        Student.incrementCount();
//        Student.incrementCount();
//        System.out.println(Student.count);

        //Student.printName(); // Not Allowed
    }


    //Memory

    //Stack //Heap Memory

    // primitive data types (int, float, double, char, boolean, long, short)

    // String  No: ???

    //Stack: variable is created (all primitive data type comes here with value)

    //Heap Memory: Actual object is created (all properties as well)
}
