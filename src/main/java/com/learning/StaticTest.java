package com.learning;

public class StaticTest {

    private final String word;
    private static String max_word = ""; // 12346

    public StaticTest(String w) { // 1234
        word = w; // 1234

        //4 > 5
        if(word.length() > max_word.length()) {
            max_word = w;
        }
    }

    public static String getMax_word() {
        return max_word;
    }
}
