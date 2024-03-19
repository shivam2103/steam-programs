package com.test.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Create a program that takes a list of strings and finds the longest string, ignoring null or empty strings, using Java 8 Streams.
 */
public class FindMaximumLengthString {

    public static void main(String[] args) {
        List<String> li = Arrays.asList("SHivam", "AMit", "Grop", "FSFSada", null, "");
        System.out.println(li
                        .stream()
                        .filter(i -> Objects.nonNull(i) && !i.isBlank())
                        .max(Comparator.comparing(i-> i.length()))
                .orElse("")
        );
    }
}
