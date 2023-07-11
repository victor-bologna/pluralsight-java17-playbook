package com.pluralsight.collections;

import static java.util.stream.Collectors.toMap;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapCheckEquality {

    public static void main(String[] args) {
        Map<Integer, String> map1 = Map.of(1, "Java", 2, "C#", 3, "JavaScript");
        Map<Integer, String> map2 = Map.of(1, "Java", 2, "C#", 3, "JavaScript");
        Map<Integer, String> map3 = Map.of(1, "Java", 2, "C#", 4, "JavaScript");

        System.out.println(map1.equals(map2));
        System.out.println(map2.equals(map3));

        Map<Integer, LanguageRecord> mapLanguage1 = Map.of(1, new LanguageRecord("Java"));
        Map<Integer, LanguageRecord> mapLanguage2 = Map.of(1, new LanguageRecord("Java"));

        System.out.println(mapLanguage1.equals(mapLanguage2));
    }
}

record LanguageRecord(String name) {
    public static <K, V> Map<K, V> sortByValueStream(Map<K, V> map, Comparator<? super V> comparator) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(comparator))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));
    }
}