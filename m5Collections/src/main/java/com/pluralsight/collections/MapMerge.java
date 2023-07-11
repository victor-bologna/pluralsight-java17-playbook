package com.pluralsight.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMerge {

    public static void main(String[] args) {

        Map<Integer, String> map1 = Map.of(1, "Java", 2, "C#", 3, "JavaScript");
        Map<Integer, String> map2 = Map.of(3, "Go", 5, "Python", 6, "Kotlin");
        Map<String, Integer> map3 = Map.of("Java", 1, "C#", 2, "JavaScript", 3);
        Map<String, Integer> map4 = Map.of("JavaScript", 4, "Python", 5, "Kotlin", 6);

        Map<Integer, String> mergedMap = new HashMap<>();
        mergedMap.putAll(map1);
        mergedMap.putAll(map2);
        System.out.println("mergedMap = " + mergedMap); // updates value 3 for "Go"

        Map<Integer, String> mergedMap1 = Stream.of(map1, map2).flatMap(integerStringMap -> integerStringMap.entrySet().stream())
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (s, s2) -> s + " or " + s2));

        System.out.println("mergedMap1 = " + mergedMap1);

        Map<String, Integer> mergedMap2 = Stream.of(map3, map4).flatMap(stringIntegerMap -> stringIntegerMap.entrySet().stream())
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, Integer::max));

        System.out.println("mergedMap2 = " + mergedMap2);
    }

    public static <K, V> Map<K, V> mergeMaps(Map<K, V> map1, Map<K, V> map2) {
        return Stream.of(map1, map2)
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v, v2) -> v));
    }
}
