package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a program that takes a list of integers and calculates the average of only the even numbers using Java 8 Streams
 */
public class AverageEvenNumbers {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,5,6);
        System.out.println(li.parallelStream().filter(i-> i%2==0).collect(Collectors.averagingInt(i->i)));
    }
}
