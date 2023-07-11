package com.pluralsight.dates;

import java.time.ZoneId;

public class GetAllZoneIds {

    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
