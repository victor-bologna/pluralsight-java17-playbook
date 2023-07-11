package com.pluralsight.strings;

public class TransformStringDemo {

    public static void main(String[] args) {
        String lotteryWin = " 100 usd ";
        String result = lotteryWin
                .replaceAll("[a-z]", "")
                .strip();
        System.out.println("formatNumber(result) = " + formatNumber(result));

        System.out.println(lotteryWin // Easier
                .replaceAll("[a-z]", "")
                .strip()
                .transform(TransformStringDemo::formatNumber));

        System.out.println(lotteryWin // Verbose
                .transform(str -> str.replaceAll("[a-z]", ""))
                .transform(s -> s.strip())
                .transform(TransformStringDemo::formatNumber));
    }

    private static String formatNumber(String number) {
        if(Integer.parseInt(number) < 100) {
            return "Nice! You've won: " + number;
        } else {
            return "Great! You've won: " + number;
        }
    }
}
