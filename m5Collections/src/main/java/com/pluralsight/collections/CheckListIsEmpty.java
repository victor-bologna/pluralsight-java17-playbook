package com.pluralsight.collections;

import java.util.List;

public class CheckListIsEmpty {

    public static void main(String[] args) {
        int[] intArray = {};
        System.out.println(intArray.length == 0);

        List<Integer> integerList = List.of(1, 2, 3);
        System.out.println(integerList.size() == 0); // not recommended
        System.out.println(integerList.isEmpty()); // preferable
    }
}
