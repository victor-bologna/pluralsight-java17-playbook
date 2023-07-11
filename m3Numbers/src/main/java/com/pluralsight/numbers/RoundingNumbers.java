package com.pluralsight.numbers;

public class RoundingNumbers {

    public static void main(String[] args) {
        //Don't do this
        System.out.println((int) 4.6);

        System.out.println(Math.ceil(4.1)); // 5 -> positive
        System.out.println(Math.floor(4.9)); // 4 -> negative

        System.out.println(Math.ceil(-4.1)); // -4
        System.out.println(Math.floor(-4.9)); // -5

        System.out.println(Math.round(4.5)); // 5 -> positive
        System.out.println(Math.round(4.4)); // 4 < 0.4 -> negative

        System.out.println(Math.round(-1.1)); // -1
        System.out.println(Math.round(-2.5)); // -2
    }
}
