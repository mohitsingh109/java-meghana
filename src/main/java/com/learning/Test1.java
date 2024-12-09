package com.learning;

public class Test1 {

    public static void main(String[] args) {

        int count = 1;

        int count2 = count;

        count = 100;

        System.out.println(count2); // 1
    }
}
