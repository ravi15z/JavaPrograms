package com.programs.javaprograms.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max_Min {

    public static void main(String[] args) {

        maxNumber();

        minAlphabate();

        getLongString();

        maxSalary();

    }

    private static void maxSalary() {
        List<ReduceEmployee> employees = Arrays.asList(
                new ReduceEmployee("John", 3000),
                new ReduceEmployee("Jane", 4000),
                new ReduceEmployee("Mark", 5000));
        ReduceEmployee eSalary = employees.stream().max(Comparator.comparing(e -> e.salary)).get();
        System.out.println("sum of all employee salary:" + eSalary.name + " " + eSalary.salary);
    }

    private static void getLongString() {
        // Find Longest String by Length
        List<String> words = Arrays.asList("Java", "SpringBoot", "AWS", "Microservices");
        String longString = words.stream().max(Comparator.comparing(a -> a.length())).get();
        System.out.println("Longest String in Length: " + longString);
    }

    private static void minAlphabate() {
        // Find Minimum String (Alphabetically)
        List<String> words = Arrays.asList("banana", "apple", "mango", "grape");
        String minAlp = words.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min Alphbate(a-z): " + minAlp);
    }

    private static void maxNumber() {
        // Find Maximum Number from a List
        List<Integer> numbers = Arrays.asList(10, 45, 23, 78, 56);
        Integer maxNumber = numbers.stream().max(Comparator.naturalOrder()).get();
        Integer reversedMaxNumber = numbers.stream().max(Comparator.reverseOrder()).get();
        System.out.println("Numbers: " + numbers);
        System.out.println("natural order Max Number: " + maxNumber);
        System.out.println("reversed Max number: " + reversedMaxNumber);
    }
}
