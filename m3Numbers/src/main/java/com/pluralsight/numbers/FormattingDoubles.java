package com.pluralsight.numbers;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormattingDoubles {

    public static void main(String[] args) {
        double myDouble = 1367845.9375d;
        NumberFormat numberFormatter = new DecimalFormat("#.00");
        NumberFormat numberFormatter2 = new DecimalFormat("00,000.0000000000");
        System.out.println("Plain decimal format: " + numberFormatter.format(myDouble));
        System.out.println("Another format: " + numberFormatter2.format(myDouble));
    }
}
