package com.test.streams;

import java.util.List;

/**
 * Write a program that takes a list of integers and returns the count of odd numbers in the list using Java 8 Streams.
 */
public class FilteringAndCounting1 {

    public static void main(String[] args) {
        List<Integer> li = List.of(1,2,5,6,7,8,9,11,12,14);
        System.out.println(li.stream().filter(i -> i%2 !=0).count());
    }
}
