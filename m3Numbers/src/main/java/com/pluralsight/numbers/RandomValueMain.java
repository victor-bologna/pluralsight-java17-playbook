package com.pluralsight.numbers;

import java.util.Random;

public class RandomValueMain {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(7, 11));
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
    }
}
