package com.pluralsight.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class MultipleFormatsDemo {

    public static void main(String[] args) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                .appendOptional(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println(LocalDate.parse("2022-07-22", dateTimeFormatterBuilder.toFormatter()));
        System.out.println(LocalDate.parse("22-07-2023", dateTimeFormatterBuilder.toFormatter()));
        System.out.println(LocalDate.parse("07-22-2023", dateTimeFormatterBuilder.toFormatter())); // Fail due not being on formatter builder.
    }
}
