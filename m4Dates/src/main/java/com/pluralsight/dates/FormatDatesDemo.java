package com.pluralsight.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatDatesDemo {

    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        System.out.println(DateTimeFormatter.ISO_DATE.format(today));
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(today));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(today));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(today));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("en", "US")).format(today));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("pt", "BR")).format(today));
        System.out.println(DateTimeFormatter.ofPattern("MM;dd;yyyy").format(today));
    }
}
