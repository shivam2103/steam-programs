package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program that removes duplicates from a list of integers using Java 8 Streams
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,1,1,1,2,4,53,21,21,56,43,53);
        System.out.println(li.stream().distinct().collect(Collectors.toList()));
    }
}
