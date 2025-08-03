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
