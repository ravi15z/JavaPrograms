package com.programs.javaprograms.stringPr;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class String2CharPr {

    public void convertStringToChar() {
        String str = "asdfghjkl";
        char[] char1 = str.toCharArray();
        System.out.println("String converted to char Array: " + char1);

        System.out.println("char[] doesn't override toString(), so printing it directly prints the object reference.\n"
                + "Use Arrays.toString() to print the array as a list of characters.\n"
                + "Or use new String(char[]) if you want to treat the array as a string again.");
        System.out.println("String converted to char Array: " + Arrays.toString(char1));

        System.out.println("\n-------------------------");
        getOccuranceOfChar();
        System.out.println("\n-------------------------");
        reversedStringUsingStringBuilder();
        System.out.println("\n-------------------------");
        System.out.println("Palindrome check:" + checkPalindrome("abb"));
        System.out.println("\n-------------------------");

    }

    private String checkPalindrome(String string) {
        String str1 = string;
        for (int i = 0; i < str1.length() / 2; i++) {
            if (str1.charAt(str1.length() - i - 1) != str1.charAt(i)) {
                return " Not a Palindrome: " + str1;
            }
        }
        return "Palindrom String: " + str1;
    }

    private void reversedStringUsingStringBuilder() {
        System.out.println("Reversed String ");
        String str1 = "abcdefxyz";
        System.out.println("Original String is: " + str1);
        StringBuilder sb = new StringBuilder();
        for (int i = str1.length() - 1; i >= 0; i--) {
            sb.append(str1.charAt(i));
        }
        System.out.println("Reversed String is: " + sb.toString());

        String str2 = "I am java programer";
        System.out.println("Original word is: " + str2);
        String strArray[] = str2.split(" ");
        List<String> list = Arrays.asList(strArray);
        Collections.reverse(list);
        String reverseWord = String.join(" ", list);
        System.out.println("\n String.join(\" \", list)"
                + "does not add a space at the beginning or end of the string — only between the elements.");
        System.out.println("\nReversed word is: " + reverseWord);

    }

    private void getOccuranceOfChar() {
        System.out.println("\n count the frequency of characters in a string");
        String str2 = "aabbbccccddeee";
        System.out.println("String is: " + str2);
        char[] char2 = str2.toCharArray();
        Map<Character, Integer> map1 = new HashMap<>();
        for (char c : char2) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> m : map1.entrySet()) {
            sb.append(m.getKey()).append(m.getValue());
        }
        System.out.println("String : Char[] : map:" + map1);
        System.out.println("Frequency of each character: " + sb.toString());
    }
}
