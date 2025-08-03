package com.programs.javaprograms.arrayPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayPrograms {

    public void getArrayPrograms() {
        System.out.println("======== Array Programs =========");
        System.out.println("\n-------------------------");
        getDuplicateList();
        System.out.println("\n-------------------------");
        getSecondLargetElement();
        System.out.println("\n-------------------------");
        getPairedSumElement();
        System.out.println("\n-------------------------");
    }

    private void getPairedSumElement() {
        System.out.println("find all pairs of elements in an integer array"
                + "whose sum is equal to a given number");
        int inputNumber = 15;
        int[] intArray = { 2, 3, 5, 4, 9, 6, 14, 11, 12, 1, 13 };
        System.out.println("Array element: " + Arrays.toString(intArray));
        System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");
        Arrays.sort(intArray);
        int i = 0;
        int j = intArray.length - 1;
        int sum = 0;
        while (i < j) {
            sum = intArray[i] + intArray[j];
            if (inputNumber == (sum)) {
                System.out.println("Matched Paired is : " + intArray[i] + " : " + intArray[j]);
                i++;
                j--;
            } else if (sum < inputNumber) {
                // If sum is too small, move i right.
                i++;
            } else {
                // If sum is too big, move j left.
                j--;
            }
        }
    }

    private void getSecondLargetElement() {
        System.out.println("\n find second largest element in an array of integers");
        int[] intArray = { 1, 2, 3, 4, 5, 10, 9, 8, 7, 6 };
        System.out.println("Array Element for 2nd large: " + Arrays.toString(intArray));
        Integer second = Arrays.stream(intArray).boxed().sorted((a, b) -> b.compareTo(a))
                .skip(1).findFirst().get();
        System.out.println("Second largest Element form Array: " + second);

        Integer largest = 0;
        Integer secondLargest = 0;
        for (int num : intArray) {
            if (largest == 0 || largest < num) {
                secondLargest = largest;
                largest = num;
            } else if ((secondLargest == null || num > secondLargest) && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Without using java 8: " + secondLargest);

    }

    private void getDuplicateList() {
        System.out.println("find duplicate elements in an array");
        int arr[] = { 11, 22, 33, 44, 11, 55, 66, 11, 33 };
        System.out.println("elements in an array");
        Set<Integer> uniqueNo = new HashSet<>();
        Set<Integer> uniqueNo1 = new HashSet<>();
        List<Integer> duplicateList = Arrays.stream(arr).boxed().filter(a -> !uniqueNo.add(a))
                .collect(Collectors.toList());
        System.out.println("Dupicate no using toList(): " + duplicateList);

        Set<Integer> duplicateSetList = Arrays.stream(arr).boxed().filter(a -> !uniqueNo1.add(a))
                .collect(Collectors.toSet());
        System.out.println("Dupicate no using toSet(): " + duplicateSetList);
    }
}
