package com.pluralsight.numbers;

public class ComparingDecimalNumbers {

    public static void main(String[] args) {
        System.out.println(0.3 == 0.3); // True
        System.out.println(0.1 + 0.2 == 0.3); // False
        System.out.println(0.1 + 0.2); // 0.300000000000004
        System.out.println(Math.abs(0.1 + 0.2) > 0.000000001);
        System.out.println(0.2);
    }
}
