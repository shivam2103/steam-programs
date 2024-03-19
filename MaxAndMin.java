package com.test.streams;

import java.util.Comparator;
import java.util.List;

/**
 * Given a list of integers, find the maximum and minimum numbers using Java 8 Streams.
 */
public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> li = List.of(1,2,3,100,0,-1);
        System.out.println(li.stream().min(Comparator.naturalOrder()).get());
        System.out.println(li.stream().max(Comparator.naturalOrder()).get());
    }
}
