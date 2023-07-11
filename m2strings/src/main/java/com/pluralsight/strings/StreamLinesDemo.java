package com.pluralsight.strings;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamLinesDemo {

    public static void main(String[] args) {
        String str = "To whom it may concern \n"
                + "I wish you a good day \n"
                + "Sincerely \n"
                + "Me";
        Stream<String> lines = str.lines();
        //lines.forEach(System.out::println);

        AtomicInteger atomicInteger = new AtomicInteger(1);
        lines.forEach(line -> System.out.println(atomicInteger.getAndIncrement() + " " + line));
    }
}
