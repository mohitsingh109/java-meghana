package com.learning;

public class SwitchStatement {

    public static void main(String[] args) {
        int num = 11;
        if(num >= 1 && num <= 5) {
            System.out.println("num is from 1 - 5");
        } else if(num <= 10) { // true
            System.out.println("num is from 6 - 10");
            if(num > 7) {
                System.out.println(" > 7");
            }
        } else {
            System.out.println("value > 10");
        }

        String num1 = "test";
        int number1 = 1;
        switch (num) { // ==
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("num is from 1 - 5");
                //break;
            case 6:
            case 7:
                System.out.println("num is 6-7");
                //break;
            case 8:
            case 9:
            case 10:
                System.out.println("num is from 6 - 10");
                break;
            default:
                System.out.println("value > 10");
                break;
        }
    }
}
