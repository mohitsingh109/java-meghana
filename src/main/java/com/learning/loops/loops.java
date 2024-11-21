package com.learning.loops;

public class loops {

    public static void main(String[] args) {

        String password = "Mohit@1234"; // 9
        //System.out.println(checkPassword(password));

        //printPattern();
        //printPattern2();
        pattern3();
    }

    public static boolean checkPassword(String password) {
        // 8 char

        if(password.length() < 8) {
            return false;
        }

        //a-z, A-Z, 0-9
        //@Mohit1234
        //A-Z

        for(int i = 0; i < password.length(); i++) {
            char ch = Character.toUpperCase(password.charAt(i)); //70
            if(!((ch >= 'A' && ch <='Z') || (ch >= '0' && ch <= '9'))) {
                return false;
            }
        }

        return true;
    }



    public static void printPattern() {
        // 7
        //******* --> Row - 7
        //******    ---> Row - 6
        //*****   ->  5
        //...
        //* --> Row - 1
        int n = 7;

        for(int row = 1; row <= n; row++) {
            for(int j = 1 ; j <= row; j++) { //1 2
                System.out.print("*");
            }
            System.out.println(); // go to the next line
        }
    }


    public static void printPattern2() {
        /**
         *  $$$$$$$$
         *  $$$$$$$
         *  $$$$$$
         *  $$$$$
         *  $$$$
         *  $$$
         *  $$
         *  $
         */


        //     *_
        //    *_*_
        //   *_*_*_
        //  *_*_*_*_

        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4
        int n = 9;
        for(int i = 1; i <= n; i++) { // Row

            for(int j = 1; j <= n - i; j++) { // n - 1, n -2
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // taking you to the next line
        }

    }

    public static void pattern3() {
        int n = 10;

        /**      C1  C2  C3  C4  C5  C6  C7
         * R1 ->  1  2   3   4   5   6   7
         * R2 ->  2
         * R2 ->  3
         * R4     4
         * R5     5
         * R6     6
         * R7     7
         */

        int start = 1;

        for(int row = 1; row <= n; row ++) {

            int currentNumber = row; // 5

            for(int col = 1; col <= n; col++) {

                System.out.print(start + "\t"); // 5 10 15
                start++;
            }

            System.out.println();
        }
    }

    /*
           k = j; k < 4; k++
           j = 0  "Hello"  "Hello"   "Hello"  "Hello"
           j = 1  "Hello"  "Hello"   "Hello"
           j = 2  "Hello"  "Hello"
           j = 3  "Hello"

           >=
           35, 30, 25, 20, 15, 10, 5, 0


           temp = Mississippi
           value = si

           temp.indexOf(value) >= 0
           position = 3
           temp = temp.substring(position + 1) issippi

           temp.indexOf(value) >= 0
           position = 2
           temp = temp.substring(position + 1) ippi

           temp.indexOf(value) >= 0// -1


           // 0, 2, 4 ..... 98
           // 0, 2, 4 ..... 98, 100

           //
     */
}
