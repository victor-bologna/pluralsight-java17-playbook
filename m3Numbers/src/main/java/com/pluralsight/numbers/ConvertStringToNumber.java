package com.pluralsight.numbers;

public class ConvertStringToNumber {

    public static void main(String[] args) {
        String num = "5";

        Integer.valueOf(num); // Returns wrapper (Integer)
        Integer.parseInt(num); // Returns primitive (int)
    }
}
