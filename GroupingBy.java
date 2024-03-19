package com.test.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program that takes a list of Person objects (having attributes name and age) and groups them by age using Java 8 Streams.
 */
public class GroupingBy {
    public static void main(String[] args) {
        List<Person> li = List.of(new Person(1, "Adhira"),
                new Person(21, "Tanu"),
                new Person(33, "Shivam"),
                new Person(33, "Shalu"),
                new Person(32, "Radhe")
        );
        System.out.println(li.stream().collect(Collectors.groupingBy(Person::getAge)));
    }
}

class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}
