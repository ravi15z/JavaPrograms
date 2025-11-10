package com.programs.javaprograms.java8;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> numberList1 = Arrays.asList(1, 2, 3, 6, 7, 8, 9, 10, 4, 5);
        System.out.println("Numbers :" + numberList1);
        sumNumbers(numberList1);
        max_min_Numbers(numberList1);
        stringConacted();

        employee();
    }

    private static void employee() {
        // Sum of Employee Salaries
        List<ReduceEmployee> employees = Arrays.asList(
                new ReduceEmployee("John", 3000),
                new ReduceEmployee("Jane", 4000),
                new ReduceEmployee("Mark", 5000));
        Integer eSalary = employees.stream().map(e -> e.salary).reduce((a, b) -> a + b).get();
        System.out.println("sum of all employee salary:" + eSalary);

        System.out.println("Concated Name: " + employees.stream().map(e -> e.name).reduce((a, b) -> a + "_" + b).get());
    }

    private static void sumNumbers(List<Integer> numberList1) {
        // sum of numbers
        Integer r1 = numberList1.stream().reduce((a, b) -> a + b).get();
        System.out.println("sum of numbers" + r1);
    }

    private static void stringConacted() {
        // String concatination
        List<String> words = Arrays.asList("Java", "is", "awesome");
        String str1 = words.stream().reduce((a, b) -> a + " " + b).get();
        System.out.println("Concated String: " + str1);
    }

    private static void max_min_Numbers(List<Integer> numberList1) {
        // find the maximum number
        Integer r2 = numberList1.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("maximum number : " + r2);

        // find the Minimum number
        Integer r3 = numberList1.stream().reduce((a, b) -> a < b ? a : b).get();
        System.out.println("maximum number : " + r3);
    }
}
