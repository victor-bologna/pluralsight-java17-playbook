package com.pluralsight.numbers;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

public class LocaleAndCompactFormatDoubles {

    public static void main(String[] args) {
        double myDouble = 1345.9375d;
        System.out.println("Current locale: " + NumberFormat.getInstance().format(myDouble));
        System.out.println("German Locale: " + NumberFormat.getInstance(Locale.GERMAN).format(myDouble));
        System.out.println("Italian Locale percent: " + NumberFormat.getPercentInstance(Locale.ITALIAN).format(myDouble));
        System.out.println("French Locale percent: " + NumberFormat.getIntegerInstance(Locale.FRENCH).format(myDouble));
        System.out.println(NumberFormat.getCompactNumberInstance(Locale.FRENCH, Style.LONG).format(myDouble));
        System.out.println(NumberFormat.getCompactNumberInstance(Locale.KOREAN, Style.SHORT).format(myDouble));
    }
}
