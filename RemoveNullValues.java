package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Implement a program that removes all null values from a list of strings using Java 8 Streams.
 */
public class RemoveNullValues {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("asa",null,"as", null);
        System.out.println(li.parallelStream().filter(Objects::nonNull).collect(Collectors.toList()));
    }
}
