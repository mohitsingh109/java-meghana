package com.learning;

public class StaticApp {

    public static void main(String[] args) {
        StaticTest s1 = new StaticTest("123");
        //max_word = 123
        StaticTest s2 = new StaticTest("12346");
        //max_word = 12346
        StaticTest s3 = new StaticTest("12");
        //max_word = 12346
        StaticTest s4 = new StaticTest("1234");
        // max_word = 12346
        System.out.println(StaticTest.getMax_word()); // 12346
    }
}
