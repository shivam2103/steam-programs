package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Write a program that converts all the strings in a list to lowercase using Java 8 Streams.
 */
public class ConvertToLowercase {

    public static void main(String[] args) {
        List<String> li = Arrays.asList("ABC","SHIVAM","AMIT","KUMAR");
        System.out.println(li.stream().map(i-> i.toLowerCase(Locale.ROOT)).collect(Collectors.toList()));
    }
}
