package com.pluralsight.strings;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationDemo {

    public static void main(String[] args) {
        Locale en_us = new Locale("en", "US");
        Locale fr_FR = new Locale("fr", "FR");
        Locale es_ES = new Locale("es", "ES");

        printMessage(en_us);
        printMessage(fr_FR);
        printMessage(es_ES);
    }

    private static void printMessage(Locale locale) {
        System.out.println(ResourceBundle.getBundle("shop", locale).getString("greeting"));
    }
}
