package com.learning;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("ABC");
        Car car2 = new Car("ABC");
        Car car3 = car1;

        boolean result = car1 == car2; // they are comparing the memory address
        System.out.println(result); // false
        System.out.println(car1.equals(car2)); // true class Object (Parent of every class)

        result = car1 == car3; // true
        System.out.println(result);

        String literal = "Test!";
        String strObject = new String("Test!");
        System.out.println(literal == strObject); // false
        System.out.println(literal.equals(strObject)); // true

        /**
         * Which of the following best describes the value of the Boolean expression: a && !(a)
         *
         * a = false b = false
         * false && (anything) ==> false
         *
         * a = true b = true
         *
         * a = true b = false
         *
         * a = false b = false
         */
    }

}