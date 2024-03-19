package com.test.streams;

import java.util.List;

/**
 * Write a program that takes a list of strings and checks if all the strings have length greater than 3 using Java 8 Streams
 */
public class Predicates {
    public static void main(String[] args) {
        List<String> li = List.of("abc","ac","shivam");
        System.out.println(li.stream().allMatch(i -> i.length() > 3));
    }
}
