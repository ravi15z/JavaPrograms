package com.programs.javaprograms.java8;

import java.util.Arrays;
import java.util.Comparator;

public class StreamApi {

    public static String highestLength() {
        String sentence = "I am learning Streams Api in Java";
        System.out.println("find the word that has the highest lenth");
        // we can use sorted().skip(0).findfirst() it will sort alphabatically.
        return Arrays.stream(sentence.split(" "))
                .max(Comparator.comparing(s -> s.length()))
                .get();
    }
}
