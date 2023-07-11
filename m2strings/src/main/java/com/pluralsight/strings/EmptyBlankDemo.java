package com.pluralsight.strings;

public class EmptyBlankDemo {

    public static void main(String[] args) {
        System.out.println("isEmpty()");
        System.out.println("".isEmpty()); // True -> length == 0
        System.out.println("\"\\r\".isEmpty() = " + "\r".isEmpty()); // False
        System.out.println("\"\\u2002\".isEmpty() = " + "\u2002".isEmpty()); // False
        System.out.println("\" \".isEmpty() = " + " ".isEmpty()); // False

        System.out.println("isBlank()"); // Supports all types of whitespaces
        System.out.println("\"\".isBlank() = " + "".isBlank()); // True
        System.out.println("\"\\r\".isBlank() = " + "\r".isBlank()); // True
        System.out.println("\"\\u2002\".isBlank() = " + "\u2002".isBlank()); // True
        System.out.println("\" \".isBlank() = " + " ".isBlank()); // True
    }
}
