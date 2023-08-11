package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        var resultList = new LinkedList<Integer>();
        for (int number : sourceList) {
            if (number % 2 == 0) {
                resultList.add(number);
            } else {
                resultList.add(0, number);
            }
        }
        return resultList;
    }
}
