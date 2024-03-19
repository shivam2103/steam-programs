package com.test.streams;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Given a list of strings, filter out the strings containing letter 'a', then convert them to uppercase, and finally collect them into a list using Java 8 Streams
 */
public class CombiningOperations {
    public static void main(String[] args) {
        List<String> li = List.of("ac", "shivam", "kid", "son");
        System.out.println(li.stream().filter(i -> i.contains("a")).map(i -> i.toUpperCase(Locale.ROOT)).collect(Collectors.toList()));
    }
}
