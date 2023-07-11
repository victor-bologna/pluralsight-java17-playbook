package com.pluralsight.strings;

import java.util.function.IntPredicate;

public class ContainsOnlySpecificCharDemo {

    public static final String ONLY_DIGITS = "123";
    public static final String NOT_ONLY_DIGITS = "123A";
    public static final String ONLY_LETTERS = "ABC";
    public static final String NOT_ONLY_LETTERS = "ABC1";

    public static void main(String[] args) {
        IntPredicate isDigitPredicate = Character::isDigit;
        IntPredicate isLetterPredicate = Character::isLetter;
        IntPredicate isLetterOrDigitPredicate = Character::isLetterOrDigit;

        System.out.println("containsOnlyCharacter(ONLY_DIGITS, new IntPredicate()) = " + containsOnlyCharacter(ONLY_DIGITS, isDigitPredicate));
        System.out.println("containsOnlyCharacter(NOT_ONLY_DIGITS, isLetterOrDigitPredicate) = " + containsOnlyCharacter(NOT_ONLY_DIGITS,
                isLetterOrDigitPredicate));
        System.out.println("containsOnlyCharacter(ONLY_LETTERS, isLetterPredicate) = " + containsOnlyCharacter(ONLY_LETTERS, isLetterPredicate));
        System.out.println("containsOnlyCharacter(NOT_ONLY_LETTERS, isLetterOrDigitPredicate) = " + containsOnlyCharacter(NOT_ONLY_LETTERS,
                isLetterOrDigitPredicate));

        System.out.println("containsOnlyCharacter(ONLY_LETTERS, \"[a-z]\") = " + containsOnlyCharacter(ONLY_LETTERS, "[a-z]"));
    }

    private static boolean containsOnlyCharacter(String str, IntPredicate predicate) {
        return str.chars().allMatch(predicate);
    }

    private static boolean containsOnlyCharacter(String str, String regex) {
        return str.matches(regex);
    }
}
