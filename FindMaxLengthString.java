package com.test.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program that takes a list of strings and finds the length of the longest string using Java 8 Streams.
 */
public class FindMaxLengthString {
    public static void main(String[] args) {
        List<String> li = List.of("amit", "kumar", "sanu");
        System.out.println(li.stream()
                .map(i -> i.length())
                .collect(Collectors.toList())
                .stream()
                .max(Comparator.naturalOrder())
                .get()
        );
        System.out.println(
                li.stream()
                .collect(Collectors.groupingBy(i -> i.length()))
                        .entrySet()
                        .stream()
                        .map(i -> i.getKey())
                        .max(Comparator.naturalOrder()).get()
        );
        System.out.println(li.stream().mapToInt(i-> i.length()).max().orElse(0));
    }
}
