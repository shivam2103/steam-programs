package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Write a program that groups a list of objects by a specific property and counts the occurrences of each group using Java 8 Streams
 */
public class GroupingbyPropertyCounting {

    public static void main(String[] args) {
        List<Test> li = Arrays.asList(
                new Test(10,"AMit"),
                new Test(10,"Shivam"),
                new Test(11,"Kumar"),
                new Test(11,"Mira")
        );
        Map<Object, Long> map = li.stream().collect(Collectors.groupingBy(i -> i.getAge(), Collectors.counting()));
        System.out.println(map);
    }
}

class Test {

    private int age;

    private String name;

    Test(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}