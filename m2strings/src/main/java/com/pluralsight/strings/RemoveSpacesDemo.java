package com.pluralsight.strings;

public class RemoveSpacesDemo {

    public static void main(String[] args) {
        System.out.println("Hello ".trim() + " world!".trim()); // Only supports char U+0020
        System.out.println("Hello ".strip() + " world!".strip()); // Accepts a wide variety of whitespaces.

        char space = '\u2002';
        System.out.println("\\u2002 is whitespace: " + Character.isWhitespace(space));

        System.out.println("Hello\u2002".trim() + "\u2002there".trim());
        System.out.println("Hello\u2002".strip() + "\u2002there".strip());
    }
}