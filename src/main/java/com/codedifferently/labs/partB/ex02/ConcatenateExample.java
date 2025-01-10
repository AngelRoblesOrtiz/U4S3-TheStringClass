package com.codedifferently.labs.partB.ex02;

public class ConcatenateExample { //create parent class
    public static String concat(){ //create concat method
        String response = ""; //sets empty string
        String myString = "Hello"; //sets string to hello

        myString = myString + "!"; //adds ! to string
        response += myString; //sets value to empty string

        return response; //returns the previously empty string
    } //closes the concat method
    public static void main(String[] args) { //creates main class
        String concat = concat(); //assigns value of concat method to a string
        System.out.print(concat); //prints the concat method value
    } //closes the main class
} //closes the parent class
