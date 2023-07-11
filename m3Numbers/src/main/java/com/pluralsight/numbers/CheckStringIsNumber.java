package com.pluralsight.numbers;

public class CheckStringIsNumber {

    public static void main(String[] args) {
        System.out.println(isNumbericLoop("5"));
        System.out.println(isNumbericLoop("5a"));

        System.out.println(isNumericTryCatch("5"));
    }

    private static boolean isNumericTryCatch(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
        return false;
    }

    private static boolean isNumbericLoop(String number) {
        return number.chars().allMatch(Character::isDigit);
    }
}
