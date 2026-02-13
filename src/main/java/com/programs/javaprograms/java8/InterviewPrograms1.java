package com.programs.javaprograms.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewPrograms1 {
    public static void main(String[] args) {

        // 2️⃣ Find First Non-Repeating Number
        int[] arr = { 2, 3, 4, 5, 2, 3, 6, 4, 7 };
        System.out.println("Array numbers : " + Arrays.toString(arr));
        int nrn = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(n -> n.getValue() == 1).findFirst().get().getKey();
        System.out.println("First Non-Repeating Number: " + nrn);

        String str = "swiss";
        Map<Character, Integer> var1 = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            var1.put(ch, var1.getOrDefault(ch, 0) + 1);
        }
        var1.entrySet().stream()
                .forEach(kv -> System.out.print(kv.getKey().toString() + kv.getValue().toString()));
    }
}
