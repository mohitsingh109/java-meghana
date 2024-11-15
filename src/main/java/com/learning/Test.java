package com.learning;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        String str = "Print Me!";

//        for(int i = 0; i < str.length(); i++) { // i = 1
//            int start = i; // 1
//            int end = i + 1; // 2
//
//            //str.substring(1, 2);
//            String substring = str.substring(start, end);
//            System.out.println(substring);
//        }

        for(int i = str.length(); i > 0; i--) { // i = 1
            int start = i - 1; // 0
            int end = i; // 1

            //str.substring(1, 2);
            String substring = str.substring(start, end);
            System.out.println(substring);


        }

        String name = "Mohit";
        String replace = name.replace("i", "t");
        System.out.println(replace);

        // Mohit, i, t

        // Mohtt

        //Meghana a ==> b
        //index = 4
        //substr(0, index) + add + substr(index + 1)
        //"Megh" + "b" + "na"
        // Meghbna
        ///substr(0, index) + add + substr(index + 1)
        // "Meghbn" + "b" + ""
        //Meghbnb

        //Meghbnb.indexOf("a") -1

    }
}
