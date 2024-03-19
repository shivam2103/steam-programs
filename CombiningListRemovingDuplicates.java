package com.test.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a program that merges two lists of integers into a single list, removing duplicates, using Java 8 Streams
 */
public class CombiningListRemovingDuplicates {
    public static void main(String[] args) {
        List<List<Integer>> li = List.of(
                List.of(1, 2, 3), List.of(3, 4, 5)
        );
        System.out.println(li.stream().flatMap(i -> i.stream()).distinct().collect(Collectors.toList()));
    }
}
