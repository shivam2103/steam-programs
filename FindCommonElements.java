package com.test.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Write a program that takes two lists of integers and finds the common elements between them using Java 8 Streams.
 */
public class FindCommonElements {

    public static void main(String[] args) {
        List<Integer> li1 = List.of(1,2,3,5,8);
        List<Integer> li2 = List.of(0,4,3,7,8);
        System.out.println(li1.stream().filter(i -> li2.contains(i)).collect(Collectors.toList()));

        // To reduce complexity O(n*m) covert li1 to SET and then perform same operation
        Set<Integer> set1 = new HashSet<>(li1);
        System.out.println(li2.stream().filter(i -> set1.contains(i)).collect(Collectors.toList()));
    }
}
