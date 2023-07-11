package com.pluralsight.dates;

import java.time.LocalDate;

public class CompareDatesDemo {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 12, 30);
        LocalDate now = LocalDate.now();

        System.out.println(date.isAfter(now));
        System.out.println(date.isBefore(now));
    }
}
