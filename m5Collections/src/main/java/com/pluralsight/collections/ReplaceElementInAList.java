package com.pluralsight.collections;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceElementInAList {

    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<>(List.of(10.525, 20.567, 30.789));

        UnaryOperator<Double> doubleUnaryOperator = num -> BigDecimal.valueOf(num).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
        UnaryOperator<Double> doubleUnaryOperator2 = num -> num > 30 ? BigDecimal.valueOf(num).setScale(2, RoundingMode.HALF_EVEN).doubleValue()
                : num;
        doubles.replaceAll(doubleUnaryOperator2);
        System.out.println("doubles = " + doubles);

        ArrayList<String> stringList = new ArrayList<>(List.of("mary", "jake", "thomas"));
        stringList.replaceAll(str -> str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        System.out.println(stringList);
    }
}
