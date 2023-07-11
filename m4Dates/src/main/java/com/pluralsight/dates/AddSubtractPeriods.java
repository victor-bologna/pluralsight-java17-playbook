package com.pluralsight.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AddSubtractPeriods {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.printf("Your appointment will take place in %s days.", date.plusMonths(1).getDayOfYear() - date.getDayOfYear());
        System.out.println(date.plus(1, ChronoUnit.DECADES));
        System.out.println(date.plus(1, ChronoUnit.MINUTES)); // Is LocalDate and not LocalTime or LocalDateTime.
    }
}
