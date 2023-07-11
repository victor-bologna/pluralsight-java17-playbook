package com.pluralsight.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MapSort {

    public static void main(String[] args) {

        Map<Integer, String> map1 = Map.of(20, "Java", 30, "C#", 10, "JavaScript", 40, "Python");

        System.out.println("new TreeMap<>() = " + new TreeMap<>(map1));

        Map<LanguageRecord, String> languageRecordStringMap = Map.of(new LanguageRecord("Java"), "Java", new LanguageRecord("C#"), "C#",
                new LanguageRecord("JavaScript"), "JavaScript");

        System.out.println(LanguageRecord.sortByValueStream(languageRecordStringMap, Comparator.naturalOrder()));
        System.out.println(LanguageRecord.sortByValueStream(languageRecordStringMap, Comparator.reverseOrder()));
    }
}
