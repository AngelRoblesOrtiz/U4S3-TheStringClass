package com.codedifferently.labs.partB.ex04;

public class Extraction {

    public static String extraction(){
        String response = "";
        String greeting = "Learning Java is a good time!";

        /* Your code goes here*/
        String newString1 = greeting.substring(0, 5);
        String newString2 = greeting.substring(7, 11);
        String newString3 = greeting.substring(7, 29);
        response += newString1 + "\n" + newString2 + "\n" + newString3;


        return response;

    }
    public static void main(String[] args) {
        String extractionOutput = extraction();
        System.out.println(extractionOutput);
    }
}
