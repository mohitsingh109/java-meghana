package com.learning;

public class ScopeInJava {

    private String str;

    public ScopeInJava(String str) {
        //this.str = strNew; // 100
        //String str = strNew; // NO
        this.str = str;
    }

    public String toString() {
        return "ScopeInJava{" +
                "str='" + str + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ScopeInJava obj = new ScopeInJava("Hello");
        System.out.println(obj); // hashcode
    }
}


