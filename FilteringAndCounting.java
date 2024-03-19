package com.test.streams;

import java.util.List;

/**
 * Write a program that takes a list of integers and returns the count of even numbers in the list using Java 8 Streams.
 */
public class FilteringAndCounting {

    public static void main(String[] args) {
        List<Integer> li = List.of(1,2,3,5,9,10,14,11);
        System.out.println(li.stream().filter(i -> i%2 ==0).count());
    }
}
