package com.programs.javaprograms.stringPr;

import java.util.Arrays;
import java.util.HashMap;
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
