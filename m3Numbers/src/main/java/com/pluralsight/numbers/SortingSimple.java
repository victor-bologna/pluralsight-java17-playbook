package com.pluralsight.numbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class SortingSimple {

    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>(List.of(20, 50, 10));
        integerArrayList.sort(Integer::compareTo);
        System.out.println("integerArrayList = " + integerArrayList);

        List<String> stringList = new ArrayList<>(List.of("andre", "maria", "Andre"));
        stringList.sort(String::compareTo); // Capitalized goes first.
        System.out.println("stringList = " + stringList);

        stringList.sort(Comparator.naturalOrder());
        System.out.println("stringList = " + stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("stringList = " + stringList);

        stringList.sort(String::compareToIgnoreCase);
        System.out.println("stringList = " + stringList);

        Map<Integer, String> java = Map.of(1, "Java", 2, "C#", 3, "Java");
        java.values().stream().distinct().toList();
    }
}
