package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateListAndAddElement {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("a", "b")); // Modifiable list (add, remove and resize)
        List<String> stringList1 = Arrays.asList("a", "b", null); // Change only elements, cannot resize, allows nulls.
        List<String> stringList2 = List.of("a", "b"); // Unmodified list, nothing can be changed. (Pref)

        stringList.add("C");
        stringList1.set(1, "c");

        //Changing unmodified list with stream.
        List<String> modifiedList = stringList2.stream().map(string -> "a").toList();
    }
}
