package com.test.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a program that takes a list of strings and sorts them alphabetically using Java 8 Streams.
 */
public class Sorting {
    public static void main(String[] args) {
        List<String> li = List.of("Shivam", "Mumy", "Papa", "Radhe", "Adhira", "Tanu");
        System.out.println(li.stream().sorted().collect(Collectors.toList()));
        System.out.println(li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
}
