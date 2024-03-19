package com.test.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Implement a program that takes a list of lists of integers and flattens it into a single list using Java 8 Streams
 */
public class FlatteningNestedLists {

    public static void main(String[] args) {
        List<List<Integer>> li = List.of(List.of(1,2,3),List.of(20,11));
        System.out.println(li.stream().flatMap(i -> i.stream()).collect(Collectors.toList()));
    }
}
