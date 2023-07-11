package com.pluralsight.strings;

public class BuildStringsInALoop {

    public static void main(String[] args) {
        System.out.println(new StringBuilder("abc").reverse()); // Non thread safe
        System.out.println(new StringBuffer("abc").reverse()); // thread safe
    }
}
