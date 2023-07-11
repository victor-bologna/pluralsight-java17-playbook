package com.pluralsight.dates;

import java.time.LocalDate;
import java.time.Period;

public class DifferenceBetweenDatesDemo {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2022, 6, 2);
        LocalDate today = LocalDate.now();

        Period age = Period.between(start, today);

        System.out.println(age.getYears() + "y " + age.getMonths() + "m " + age.getDays() + "d");
    }
}