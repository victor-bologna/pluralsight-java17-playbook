package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToFromArray {

    public static void main(String[] args) {
        String[] stringsArr = { "1", "2", "3" };
        ArrayList<String> stringList = new ArrayList<>(List.of(stringsArr));

        System.out.println("List before = " + stringList);
        stringList.add("4");
        stringList.add("5");
        stringList.remove(1);
        System.out.println("List after = " + stringList);
        String[] newArray = stringList.toArray(String[]::new);
        System.out.println(Arrays.toString(newArray));

        int[] intArr = { 1, 2, 3 };
//        List<Integer> integerList = Arrays.asList(intArr); -> not allowed because autoboxing doesn't work with primitives.
        List<Integer> integerList1 = Arrays.stream(intArr).boxed().toList(); // Returns unmodified list.

        Integer[] integerArr = { 1, 2, 3 };
        List<Integer> integerList = Arrays.asList(integerArr); // Allowed
    }
}
