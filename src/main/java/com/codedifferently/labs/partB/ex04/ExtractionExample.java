package com.codedifferently.labs.partB.ex04;

public class ExtractionExample { //creates parent class

    public static String extract(){ //creates extract method
        String response = ""; //creates empty response string

        String phoneNumber = "867-5309"; //creates string with a phone number
        String subString = phoneNumber.substring(3,6); //creates a string that takes a section of phoneNumber
        response += subString; //makes response equal the substring


        return response; //returns the response that was previously empty
    }
    public static void main(String[] args) { //creates main class
        String extractOutput = extract(); //sets a string to the return of extract()
        System.out.print(extractOutput); //prints out the return
    } //closes main class
} //closes the parent class
