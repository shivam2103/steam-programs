package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program that groups a list of objects by a specific property using Java 8 Streams.
 */
public class GroupingByProperty {

    public static void main(String[] args) {
        List<Employee> li = Arrays.asList(new Employee("Amit", 10),
                new Employee("Shivam", 10),
                new Employee("Kumar", 100),
                new Employee("Manu", 101)
        );
        System.out.println(li.parallelStream().collect(Collectors.groupingBy(
                i -> i.getSal()
        )));
    }
}

class Employee {

    private String name;
    private Integer sal;

    Employee(String name, Integer sal) {
        this.name = name;
        this.sal = sal;
    }
    public String getName() {
        return this.name;
    }
    public Integer getSal() {
        return this.sal;
    }
}