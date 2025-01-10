package com.codedifferently.labs.partC;

public class AlgoChallenge {

/* Problem 1
    The instructor provided you with a non-empty string and a number n.
    The instructor wants you to remove the letter at index n and provide a new string.
    Tip: Value of n should be a valid index of a given letter in the original string,
    such as 0 or str.length()-1 inclusive
    missingLetter("kitten", 1) --> "ktten"
    missingLetter("kitten", 0) --> "itten"
    missingLetter("kitten", 4) --> "kittn"
     */

    public static String missingLetter(String letter, int n) {
        String response = "";
        int letterLength = letter.length();
        String firstString = letter.substring(0, n);
        String secondString = letter.substring((n + 1), letterLength);
        response += firstString + secondString;

        return response;
    }

    /* Problem 2
    Given the word of the day, take the last letter and
    return a new word of the day when you add the last letter to the front and back of the word.
    For example, "founder" yields "rfounderr".
    Tip: The word of the day will be a length 1 or more
    wordOfDay("cat") --> "tcatt"
    wordOfDay("Hello" --> "oHelloo"
    wordOfDay("a") --> "aaa"
     */

    public static String wordOfDay(String word) {
        String response = "";
        int wordLength = word.length();
        String lastLetter = word.substring(wordLength - 1, wordLength);
        String mainWord = word.substring(0, wordLength);
        response += lastLetter + mainWord + lastLetter;

        return response;
    }

}

