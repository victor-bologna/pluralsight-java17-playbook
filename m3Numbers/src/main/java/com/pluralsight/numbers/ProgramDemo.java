package com.pluralsight.numbers;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.List;
import java.util.Locale;

public class ProgramDemo {

    public static void main(String[] args) {
        Locale locale = Locale.CANADA_FRENCH;
        NumberFormat.Style style = Style.LONG;
        List<String> numbersList = List.of("37000000", "2000000", "1100000");
        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(locale, style);
        System.out.println(numbersList.stream()
                .map(Integer::parseInt)
                .map(numberFormat::format)
                .toList());
    }
}
