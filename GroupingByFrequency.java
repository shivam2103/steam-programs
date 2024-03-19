package com.test.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Implement a program that takes a list of integers and groups them by their frequency (how many times they appear) using Java 8 Streams
 */
public class GroupingByFrequency {

    public static void main(String[] args) {
        List<Integer> li = List.of(1,1,2,3,5,6,3,7,7);
        System.out.println(li.stream().collect(Collectors.groupingBy(i-> i, Collectors.counting())));
    }
}
