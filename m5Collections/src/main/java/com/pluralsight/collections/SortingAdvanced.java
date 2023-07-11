package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortingAdvanced {

    public static void main(String[] args) {
        List<Person2> people = new ArrayList<>(Arrays.asList(
                new Person2("Jake", 28),
                new Person2("Don", 30),
                new Person2("Andy", 40),
                new Person2("John", 36),
                new Person2("John", 35)
        ));

        people.sort(Comparator.comparing(Person2::name));
        System.out.println("people = " + people);

        people.sort(Comparator.comparing(Person2::age));
        System.out.println("people = " + people);

        people.sort(Comparator.comparing(Person2::name).reversed());
        System.out.println("people = " + people);

        people.sort(Comparator.comparing(Person2::age).thenComparing(Person2::name));
        System.out.println("people = " + people);

        List<Person2> anotherPeople = new ArrayList<>(Arrays.asList(null,
                new Person2("Jake", 28),
                new Person2("Don", 30),
                new Person2("Andy", 40),
                new Person2("John", 36),
                new Person2("John", 35),
                null
        ));

//        anotherPeople.sort(Comparator.comparing(Person2::name)); -> NullPointerException
//        System.out.println("anotherPeople = " + anotherPeople);

        System.out.println(anotherPeople.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Person2::name))
                .toList());

        Person2[] peopleArray = {
                null,
                new Person2("Jake", 28),
                new Person2("Don", 30),
                new Person2("Andy", 40),
                new Person2("John", 36),
                new Person2("John", 35),
                null
        };

        Arrays.sort(peopleArray, Comparator.nullsLast(Comparator.comparing(Person2::name).thenComparing(Person2::age)));
        System.out.println("peopleArray = " + Arrays.stream(peopleArray).toList());
    }
}

record Person2 (String name, int age) {
    @Override
    public String toString() {
        return name + " = " + age;
    }
}