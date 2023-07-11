package com.pluralsight.numbers;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

public class ProgramDemoTwo {

    public static void main(String[] args) {
        // Task: add %20 and round to 2 decimals
        // Final output: 24.18, 44.66, 69.83
        List<String> prices = List.of("20.15", "37.22", "58.19");
        NumberFormat numberFormat = new DecimalFormat("#.00");
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println(prices.stream()
                .map(Double::parseDouble)
                .map(number -> numberFormat.format(number = number * 1.2))
                .toList());
    }
}
