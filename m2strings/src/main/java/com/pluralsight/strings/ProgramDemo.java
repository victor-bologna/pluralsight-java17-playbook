package com.pluralsight.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ProgramDemo {
    static String text = """
            Tokyo, 3700000
            New York, 20_000_000
            Paris, 11.000.000
            """;

    public static void main(String[] args) {
        List<String> populations = new ArrayList<>();
        for (String line : text.split("\n")) {
            String population = line.split(",")[1];
            String sanitized = population.replaceAll("[^\\d]", "");
            populations.add(sanitized);
        }
        System.out.println(populations);

        Function<String, String> extractSecondToken = line -> line.split(",")[1];
        Function<String, String> sanitizePopulation = population -> population.replaceAll("[^\\d]", "");
        System.out.println(text.lines()
                .map(extractSecondToken)
                .map(sanitizePopulation)
                .toList());

        System.out.println(text.lines().map(extractSecondToken.andThen(sanitizePopulation)));
    }
}
