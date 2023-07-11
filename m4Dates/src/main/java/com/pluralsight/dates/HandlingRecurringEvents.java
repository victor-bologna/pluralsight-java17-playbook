package com.pluralsight.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class HandlingRecurringEvents {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate start = today.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate stop = today.with(TemporalAdjusters.lastDayOfMonth());
        LocalDate stopYear = today.with(TemporalAdjusters.lastDayOfYear());

        LocalDate friday = start.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        LocalDate monday = start.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));

        List<LocalDate> fridaysOfMonth = new ArrayList<>();
        List<LocalDate> mondaysOfMonth = new ArrayList<>();

        while (friday.isBefore(stop) || friday.isEqual(stop)) {
            fridaysOfMonth.add(friday);
            friday = friday.plusWeeks(1); // next Friday
        }

        while (monday.isBefore(stopYear) || monday.isEqual(stopYear)) {
            mondaysOfMonth.add(monday);
            monday = monday.plusWeeks(1); // next Friday
        }

        System.out.println("fridaysOfMonth = " + fridaysOfMonth);
        System.out.println("mondaysOfMonth = " + mondaysOfMonth);
    }
}
