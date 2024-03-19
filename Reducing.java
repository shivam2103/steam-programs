package com.test.streams;

import java.util.List;

/**
 * Write a program that calculates the product of all the elements in a list of integers using Java 8 Streams
 */
public class Reducing {
    public static void main(String[] args) {
        List<Integer> li = List.of(1,2,3,2,2);
        System.out.println(li.stream().reduce(
                1, (a,b) -> a * b)
        );
    }
}
