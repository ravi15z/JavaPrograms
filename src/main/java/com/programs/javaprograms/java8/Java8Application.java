package com.programs.javaprograms.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Application {

    public static void main(String[] args) {

        getEvenSum();
        streamPrograms();

    }

    private static void getEvenSum() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long evenSum = intList.stream().filter(e -> e % 2 == 0).collect(Collectors.summarizingInt(a -> a)).getSum();
        System.out.println("Even no sum: " + evenSum);

        long count = intList.stream().filter(c -> c % 2 != 0).count();
        System.out.println("Odd no count: " + count);
    }

    private static void streamPrograms() {
        String highestLength = StreamApi.highestLength();
        System.out.println("Highest length word is:" + highestLength);
    }
}
