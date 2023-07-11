package com.pluralsight.strings;

import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinStringsDemo {

    public static void main(String[] args) {
        String delimiter = ";";
        String[] strings = {"11", "12", null, "13", "14", "15", "16", "17"};

        System.out.println(joinOldWay(delimiter, strings));
        System.out.println(joinSimplest(delimiter, strings));
        System.out.println(joinWithJoiner(delimiter, strings));
        System.out.println(joinWithStream(delimiter, strings));
    }

    private static String joinOldWay(String delimiter, String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();

        int i;
        for (i = 0; i < strings.length - 1; i++) {
            stringBuilder.append(strings[i]).append(delimiter);
        }
        stringBuilder.append(strings[i]);
        return stringBuilder.toString();
    }

    private static String joinSimplest(String delimiter, String[] strings) {
        return String.join(delimiter, strings);
    }

    private static String joinWithJoiner(String delimiter, String[] strings) {
        StringJoiner stringJoiner = new StringJoiner(delimiter);
        for (String str : strings) {
            stringJoiner.add(str);
        }
        return stringJoiner.toString();
    }

    private static String joinWithStream(String delimiter, String[] strings) {
        return Stream.of(strings)
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining(delimiter));
    }
}
