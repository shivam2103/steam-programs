package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Create a program that partitions a list of strings into two groups based on whether they contain a specific substring using Java 8 Streams
 */
public class PartitioningByPredicate {

    public static void main(String[] args) {
        List<String> s1 = Arrays.asList("Amit","Kumar","Sanu", "Radhe", "Adhira");
        Map<Boolean, List<String>> map = s1.stream().collect(Collectors.partitioningBy(i -> i.contains("Amit")));
        System.out.println(map.get(true));
        System.out.println(map.get(false));
    }
}
