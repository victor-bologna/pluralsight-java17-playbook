package com.pluralsight.strings;

public class IterateOverCharactersDemo {

    public static void main(String[] args) {
        String str = "some String";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println("c = " + c);
            // do things with char
        }

        for (char c : str.toCharArray()) {
            System.out.println("c = " + c);
            // do things with char
        }

        System.out.println(charToUpperCase("uppercase", 'p'));
        System.out.println(charToUpperCase("uppercase", 'c'));
    }

    private static String charToUpperCase(String str, char toUpperCase) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray()) {
            char charToAppend = c == toUpperCase ? Character.toUpperCase(c) : c;
            stringBuilder.append(charToAppend);
        }
        return stringBuilder.toString();
    }
}
