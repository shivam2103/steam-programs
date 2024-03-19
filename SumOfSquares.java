package com.test.streams;

import java.util.List;

/**
 * Implement a program that takes a list of integers and finds the sum of the squares of all the elements using Java 8 Streams
 */
public class SumOfSquares {

    public static void main(String[] args) {
        List<Integer> li = List.of(1,2,3,1);
        System.out.println(li.stream().mapToInt(i -> i*i).sum());
    }
}
