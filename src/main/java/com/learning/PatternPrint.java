package com.learning;

public class PatternPrint {

    public static void main(String[] args) {


        /***
         *
         * i = 5
         * k = 2
         *
         * 2 - - - - -
         * - 4 - - - -
         * - - 6 - - -
         * - - - 8 - -
         * - - - - 10 -
         * - - - - - 12
         *
         *
         *
         *
         *
         * for (int i = 1; i <= 6; i++) {
         *      for (int k = 1; k <= 6; k++)
         *          if (k == i)
         *              System.out.print(2 * k):
         *          else
         *              System.out.print("-");
         *
         *      System.out.println();
         * }
         *
         */

        /**
         * i = 3
         * k = 1
         *
         * 2 - - - - -
         * - 4 - - - -
         * - - 6 - - -
         *
         *
         * for (int i = 1; i <= 6; i++) {
         *     for (int k = 1; k <= i-1; k++) 3 <= 2
         *         System.out.print("-");
         *
         *     System.out.print(2 * i);
         *
         *     for (int k = 1; k <= 6 - i; k++)
         *         System.out.print("-");
         *
         *     System.out.println();
         * }
         */

        /**
         *
         * i = 3, 4, 5 , 6
         * k = 4
         *
         * 2 - - - - -
         * - 4 - - - -
         * - - 6 - - -
         *
         * for (int i = 1; i <= 6; i++) {
         *     for (int k = 1; k <= i-1; k++)
         *         System.out.print("-");
         *
         *     System.out.print(2 * i);
         *     for (int k = i + 1; k <= 6; k++) T, T, T
         *         System.out.print("-");
         *
         *     System.out.println();
         * }
         */

        /**
         *
         * 1234 --> 4321
         *
         * 9  ----> 9
         *
         *
         *
         * int newNum = 0, temp;
         * int num = k; //k is some predefined integer value ≥ 0
         * // k = 100
         * while (num >= 10) {
         *      temp = num % 10;  12 % 10 ==> 2
         *      num /= 10;  12/10 --> 1
         *      newNum = newNum * 10 + temp;  ===> 30 + 2 => 32
         * }
         * print(newNum) ; 432
         *
         *
         *
         */
    }
}
