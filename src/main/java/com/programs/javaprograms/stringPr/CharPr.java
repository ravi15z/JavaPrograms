package com.programs.javaprograms.stringPr;

public class CharPr {
    public static void main(String[] args) {

        // input 354 output three five four.
        String number = "354";
        String[] words = { "zero", "one", "two", "three", "four", "five" };
        char[] chars = number.toCharArray();
        for (char ch : chars) {
            System.out.print(words[ch - '0'] + " ");
        }
    }
}
