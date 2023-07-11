package com.pluralsight.strings;

public class FindAndReplaceDemo {

    public static void main(String[] args) {
        findMatches();
        replace();
    }

    private static void findMatches() {
        String str = "Java 17 recipes!";

        System.out.println(str.matches("Java 17 recipes!")); // Exact match -> True
        System.out.println(str.matches("Java 17")); // Not the exat match -> False

        System.out.println(str.matches("[Jj]ava.*")); // True
        System.out.println(str.matches("Java [0-9]+ Recipes!")); // True
    }

    private static void replace() {
        String str = "11 Recipes for Java11";
        System.out.println(str.replace("11", "17")); // replaces all, but takes a char sequence
        System.out.println(str.replaceAll("11", "17")); // same as above, but regex
        System.out.println(str.replaceFirst("11", "17")); // just the first match
    }
}
