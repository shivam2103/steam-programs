package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program that takes a list of integers and finds all the duplicate elements using Java 8 Streams.
 */
public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 2, 5, 8, 3);
        System.out.println(li.stream().collect(
                                Collectors.groupingBy(i -> i, Collectors.counting())
                        )
                        .entrySet()
                        .stream()
                        .filter(i -> i.getValue() > 1).map(i -> i.getKey()).collect(Collectors.toList())

        );
    }
}
