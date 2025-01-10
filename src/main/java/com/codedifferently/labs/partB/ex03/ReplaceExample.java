package com.codedifferently.labs.partB.ex03;

public class ReplaceExample { //creates the parent class

    public static String replace(){ //creates replace method
        String response = ""; //creates empty response string

        String replace = "String replace with replace First"; //creates replace string
        String newString = replace.replaceFirst("re", "RE"); //replaces any re with RE in replace string
        response += newString; //sets replaced string to the empty response string

        return response; //returns the response string
    } //closes the replace method
    public static void main(String[] args) { //creates the main class
        String replacedOutput = replace(); //sets a string to equal to output of replace method
        System.out.println(replacedOutput); //prints out the value of method
    } //closes the main class
} //closes the parent class
