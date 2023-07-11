package com.pluralsight.dates;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertOldDateDemo {

    public static void main(String[] args) {
        Date in = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(in.toInstant(), ZoneId.of("America/Sao_Paulo"));
        System.out.println("in = " + in);
        System.out.println("Default = " + localDateTime);
        System.out.println("Sao Paulo = " + localDateTime1);
        System.out.println("out = " + Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()));
    }
}
