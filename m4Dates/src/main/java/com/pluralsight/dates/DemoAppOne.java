package com.pluralsight.dates;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DemoAppOne {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate endOfYear = today.with(TemporalAdjusters.lastDayOfYear());

        System.out.println("Time left this year: " + today.until(endOfYear, ChronoUnit.DAYS) + " day(s), " + today.until(endOfYear, ChronoUnit.WEEKS)
                + " whole week(s), " + today.until(endOfYear, ChronoUnit.MONTHS) + " whole month(s) until the end of the year.");
    }
}
