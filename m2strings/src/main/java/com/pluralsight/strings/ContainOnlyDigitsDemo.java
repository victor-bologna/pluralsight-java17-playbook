package com.pluralsight.strings;

public class ContainOnlyDigitsDemo {

    private static final String ONLY_DIGITS = "123456789";
    private static final String NOT_ONLY_DIGITS = "123456789A";

    public static void main(String[] args) {
        System.out.println("Character.isDigit() solution: ");

        System.out.println("containsOnlyDigitsLoop(ONLY_DIGITS) = " + containsOnlyDigitsLoop(ONLY_DIGITS));
        System.out.println("containsOnlyDigitsLoop(NOT_ONLY_DIGITS) = " + containsOnlyDigitsLoop(NOT_ONLY_DIGITS));

        System.out.println();
        System.out.println("Java 8, functional-style solution: ");

        System.out.println("containsOnlyDigitsFunctional(ONLY_DIGITS) = " + containsOnlyDigitsFunctional(ONLY_DIGITS));
        System.out.println("containsOnlyDigitsFunctional(NOT_ONLY_DIGITS) = " + containsOnlyDigitsFunctional(NOT_ONLY_DIGITS));

        System.out.println();
        System.out.println("Regex solution: ");

        System.out.println("containsOnlyDigitsRegex(ONLY_DIGITS) = " + containsOnlyDigitsRegex(ONLY_DIGITS));
        System.out.println("containsOnlyDigitsRegex(NOT_ONLY_DIGITS) = " + containsOnlyDigitsRegex(NOT_ONLY_DIGITS));
    }

    private static boolean containsOnlyDigitsLoop(String str) {
        for (char c : str.toCharArray()) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsOnlyDigitsFunctional(String str) {
        return str.chars().allMatch(Character::isDigit);
    }

    private static boolean containsOnlyDigitsRegex(String str) {
        return str.matches("[0-9]+");
    }
}
