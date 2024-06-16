package com.leetcode;

import java.util.*;

public class TestApp {
    public static void main(String[] args) {
        int[] A2 = {3, 1, 2, 3, 2, 3};  // Unsorted
        int biggestValue2 = findBiggestValue(A2);
        System.out.println("Biggest value in A2 (unsorted): " + biggestValue2); // Output: 3

    }

    public static int findBiggestValue(int[] arr) {
        // Leverage HashMap for dynamic sizing and handling any range of values


        SortedMap<Integer, Integer> countMap = new TreeMap<>(Comparator.reverseOrder());
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the HashMap entries to find the biggest value
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();
            if (value == count) {
                return value;
            }
        }

        // If no such value is found, return 0.
        return 0;
    }


}
