package com.learning.loops;

import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {
        //Arrays

        // For
        // While
        // Do While
        // ini; condition; step up or down
        //int start = 1; execute once
         //1 <= 10

        //step up loop
//        for(int start = 1; start <= 10; start++) { // 2
//            System.out.println(start); //2
//        }
//
//        //step down loop
//        for(int start = 10; start >= 1; start--) {
//            System.out.println(start);
//        }
//
//        for(int start = 1; start <= 10; start = start + 2) { // 2
//            System.out.println(start); //2
//        }
//
//        for(int start = 10; start >= 1; start = start - 2) {
//            System.out.println(start);
//        }
        //-----------------
//        int start = 1;
//        int start1 = 10;
//        for(; start <= 10; start++, start1++) { // 2
//            System.out.println(start + " : " + start1); //2
//        }
        //-----------------

        // Arrays
        // Range loop (1000 - 10000)
//        for(int i = 1; i <= 10; i ++) {
//            System.out.println("10 X " + i + " = " + 10 * i);
//        }
//        //                      0 1 2 3 4
//        String s = "Mohit"; // [M o h i t]
//        //                                 i
//        for(int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i)); // M
//        }
//
//        for(int i = s.length() - 1; i >= 0; i--) {
//            System.out.println(s.charAt(i)); // M
//        }

        // Arrays for is used

        // condition is true continue the loop
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        while (input != 0) { // player provide values as 0
//            System.out.println("Playing the game");
//            input = scanner.nextInt();
//        }

        int index = 0;

//        while (index < s.length()) { // true
//            System.out.println(s.charAt(index));
//            index++;
//        }

//        for(;;) {
//            System.out.println("10...");
//        }

        // break
        // continue


        String str = "AABFJ$FHJFJD$KFK$FAS$F";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '$') {
                break;
            }
            System.out.println(str.charAt(i));
        }

        System.out.println("----------------");

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '$') {
                continue; // skip below code take to the step operation
            }
            System.out.println(str.charAt(i));
        }

        /**
         * * --- Row 1
         * **  ---- Row 2
         * ***
         * **** ---- Row 4
         */
                         // 4 <= 4
        for(int row = 1; row <= 4; row++) { // row = 4
            // * based on the row number
            // nested for loop
            //                1  <=  2
            for(int col = 1; col <= row; col++) { // col = 1
                System.out.print("*");
            }
            System.out.println(); // taking to next line
        }

        //*
        //**
        //***
        //****

       // for > while
        System.out.println("-----------");
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <= 10; i++) { // i = 3

            int printHello = 1; //  printHello = 3
                     // 3 <= 2
            while (printHello <= i) {
                System.out.println("Hello " + i);
                printHello++;
            }

            String input = scanner.nextLine();

            if(input.equals("exit")) {
                System.out.println("stop the for loop");
                break;
            } else {
                System.out.println("continue the loop");
            }
        }

        int i = 1;
              // 1 != 1
        while (i != 1) { // false
            System.out.println("this will not print");
        }

        do {
            System.out.println("start the code first");
            //...

            //input =
        }while (i != 1);

//        String returnValue = learnReturn();
//        System.out.println(returnValue);
        learnReturn();
        //...
        //...
    }


    public static void learnReturn() {
        int counter = 1;

        while (true) {
            if(counter == 5) {
                return; // exit the function, return the control to the main()
            }
            System.out.println("I am running " + counter);
            counter++;
        }
    }
}
