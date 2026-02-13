package com.programs.javaprograms.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {

        // duplicate and unique no
        List<Integer> intList = Arrays.asList(9, 8, 1, 2, 3, 4, 2, 3, 4, 2, 5, 6, 8);
        System.out.println("List of Integer" + intList);
        List<Integer> duplicateNos = intList.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream().filter(n -> n.getValue() > 1).map(k -> k.getKey()).collect(Collectors.toList());
        System.out.println("Duplicate no list:" + duplicateNos);
        // List<Integer> uniqueNos =
        System.out.println("Unique Nos: ");
        intList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(v -> v.getValue() == 1)
                .forEach(k -> System.out.println(k.getKey()));
        // moveZeroToLast();
    }

    public static String highestLength() {
        String sentence = "I am learning Streams Api in Java";
        System.out.println("find the word that has the highest lenth");
        // we can use sorted().skip(0).findfirst() it will sort alphabatically.
        return Arrays.stream(sentence.split(" "))
                .max(Comparator.comparing(s -> s.length()))
                .get();
    }

    public static void moveZeroToLast() {

        // long
        List<Integer> numbers = Arrays.asList(-1, -2, 3, 0, 2, 0, 4, -5, 0);
        List<Integer> zeroList = numbers.stream().filter(n -> n == 0).collect(Collectors.toList());
        System.out.println("zeroList :" + zeroList);
        List<Integer> noZeroList = numbers.stream().filter(n -> n != 0).collect(Collectors.toList());
        System.out.println("noZeroList :" + noZeroList);
        List<Integer> moveZeroList = new ArrayList<>();
        moveZeroList.addAll(noZeroList);
        moveZeroList.addAll(zeroList);
        System.out.println("moveZeroList :" + moveZeroList);

        // short
        System.out.println("Short way:");
        List<Integer> numberss = Arrays.asList(-1, -2, 3, 0, 2, 0, 4, -5, 0);
        System.out.println(":" + numberss);
        List<Integer> moveZeroList1 = numberss.stream()
                .sorted(Comparator.comparingInt(n -> n == 0 ? 1 : 0))
                .collect(Collectors.toList());
        System.out.println("moveZeroList :" + moveZeroList1);

    }
}
