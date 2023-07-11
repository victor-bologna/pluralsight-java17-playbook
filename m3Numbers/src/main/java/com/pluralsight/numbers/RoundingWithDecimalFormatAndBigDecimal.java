package com.pluralsight.numbers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class RoundingWithDecimalFormatAndBigDecimal {

    public static void main(String[] args) {
        NumberFormat numberFormat = new DecimalFormat("0");
        System.out.println(numberFormat.format(1.4)); // 1
        System.out.println(numberFormat.format(1.6)); // 2

        System.out.println(numberFormat.format(1.5)); // 2
        System.out.println(numberFormat.format(2.5)); // 2
        System.out.println(numberFormat.format(3.5)); // 4

        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println(numberFormat.format(3.5)); // 4

        System.out.println(BigDecimal.valueOf(1.5).setScale(2, RoundingMode.HALF_UP));
    }
}
