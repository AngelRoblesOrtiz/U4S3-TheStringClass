package com.codedifferently.labs.partB.ex01;

public class IndexingExample { //created parent class

    public static String index(){ //created index method class
        String response = ""; //created empty string named response

        String phoneNum = "404-543-2345"; //created phoneNum string and initialized
        int idx1 = phoneNum.indexOf('-'); //gets the index of dashes in phoneNum
        response += "index of first dash: "+ idx1 + "\n"; //puts together a response
        int idx2 = phoneNum.indexOf('-', idx1 + 1); //gets index of dash and the last index of dash plus one
        response += "second dash index: "+ idx2; //added more to the response string

        return response; //returned the response
    } //closed the index method class

    public static void main(String args[]) { //created the main class
        String indexOutput = index(); //gets the output of the index class as string
        System.out.print(indexOutput); //prints out the indexOutput
    } //closes main class
} //closes parents class
