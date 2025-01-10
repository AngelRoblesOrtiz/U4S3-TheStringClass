package com.codedifferently.labs.partB.ex02;

public class Concatenate {
    public static String concatenateStrings() {
        String response = "";
        /* Your code goes here*/
        String firstName = "Abe ";
        String lastName = "Lincoln";
        response += firstName + lastName;

        return response;
    }

    public static void main(String[] args) {
        String stringOutput = concatenateStrings();
        System.out.println(stringOutput);

    }
}
