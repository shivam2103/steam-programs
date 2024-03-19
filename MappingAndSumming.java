package com.test.streams;

import java.util.List;

/**
 * Given a list of strings representing numbers, write a program to parse each string into an integer, then calculate the sum of all the integers using Java 8 Streams.
 */
public class MappingAndSumming {

    public static void main(String[] args) {
        List<String> li = List.of("1","2","3","4");
        System.out.println(li.stream().mapToInt(Integer::valueOf).sum());
        System.out.println(li.stream().map(Integer::valueOf).reduce(0,Integer::sum));
    }
}
