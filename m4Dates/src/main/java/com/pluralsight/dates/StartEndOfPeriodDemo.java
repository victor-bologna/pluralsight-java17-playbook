package com.pluralsight.dates;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class StartEndOfPeriodDemo {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate endOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(String.format("Hurry! The sale ends at the end of the month, %s day(s) remaining!",
                endOfMonth.getDayOfMonth() - today.getDayOfMonth()));
    }
}
