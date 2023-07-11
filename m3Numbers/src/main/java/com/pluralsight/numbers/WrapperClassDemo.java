package com.pluralsight.numbers;

public class WrapperClassDemo {

    public static void main(String[] args) {
        int five = 5;
        Integer wrappedClass = five;

        System.out.println(five == wrappedClass);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.toBinaryString(5));
    }
}