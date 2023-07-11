package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(20, 30, 40, 40, 50, 50);
        HashSet<Integer> integerHashSet = new HashSet<>(integerList);
        System.out.println("integerHashSet = " + integerHashSet);

        List<Person> people = new ArrayList<>(List.of(new Person("Jon"), new Person("Jon")));
        Set<Person> personSet = new HashSet<>(people);
        System.out.println("personSet = " + personSet);
        System.out.println("people = " + people);

        List<String> stringArrayList = new ArrayList<>(List.of("Jon", "Jon", "Marie"));
        HashSet<String> stringHashSet = new HashSet<>(stringArrayList);
        System.out.println("stringHashSet = " + stringHashSet);
    }
}

record Person(String name){}