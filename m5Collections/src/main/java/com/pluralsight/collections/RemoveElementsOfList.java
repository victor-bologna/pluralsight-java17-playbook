package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsOfList {

    public static void main(String[] args) {
        List<Integer> integerLst = List.of(20, 30, 40 , 50);
//        integerLst.remove(1); -> UnsupportedOperationException

        ArrayList<Integer> integerArrayList = new ArrayList<>(List.of(20, 30, 40, 50, 60));
//        integerArrayList.removeAll(integerLst);
        integerArrayList.removeIf(integer -> integer < 40);


    }
}
