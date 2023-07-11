package com.pluralsight.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DemoAppTwo {

    public static void main(String[] args) {
        LocalTime time = LocalTime.of(11, 0);
        List<String> zones = List.of("America/New_York", "Europe/London", "Asia/Kolkata");

        printTimes(time, zones);
    }

    private static void printTimes(LocalTime time, List<String> zones) {
        ZonedDateTime zonedDateTime = time.atDate(LocalDate.now()).atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime.getZone() + " " + zonedDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        for (String zoneId : zones) {
            ZonedDateTime otherZone = zonedDateTime.withZoneSameInstant(ZoneId.of(zoneId));
            System.out.println(zoneId + " " + otherZone.format(DateTimeFormatter.ISO_LOCAL_TIME));
        }
    }
}
