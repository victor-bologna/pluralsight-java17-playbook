package com.pluralsight.collections;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {
        String[] arr = { "1", "2", "3" };
        arr[2] = "10";
        String[] newArray = append(arr, "12");
        // Arrays.stream(newArray).forEach(System.out::println);
        System.out.println("Arrays.toString(newArray) = " + Arrays.toString(newArray));
    }

    static <T> T[] append(T[] sourceArray, T newElement) {
        int originalLength = sourceArray.length;
        T[] newArray = Arrays.copyOf(sourceArray, originalLength + 1);
        newArray[originalLength] = newElement;
        return newArray;
    }
}
