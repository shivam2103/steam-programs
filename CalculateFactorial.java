package com.test.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Implement a program that calculates the factorial of a given number using Java 8 Streams.
 */
public class CalculateFactorial {

    public static void main(String[] args) {
        int x = 5;
        System.out.println(IntStream.rangeClosed(1, x).reduce(1, (z, y) -> z * y));
        System.out.println(Stream.iterate(1, i -> i+1).limit(x).reduce(1, (y,z) -> y*z));
    }
}
