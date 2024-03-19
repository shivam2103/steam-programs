package com.test.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a program that calculates the average of a list of doubles using Java 8 Streams
 */
public class CalculateAverage {
    public static void main(String[] args) {
        List<Double> li = List.of(0.1,1.9,2.2,1.8);
        System.out.println(li.stream().collect(Collectors.averagingDouble(s -> s)));
    }
}
