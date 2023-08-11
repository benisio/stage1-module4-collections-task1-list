package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        var resultList = new ArrayList<String>();
        for (int i = 0; i < sourceList.size(); i++) {
            if ((i + 1) % 3 == 0) {
                resultList.add(sourceList.get(i));
                resultList.add(sourceList.get(i));
            }
        }

        return resultList;
    }

    /*public static void main(String[] args) {
        var obj = new ArrayListCreator();
        System.out.println(obj.createArrayList(List.of("The", "ArrayList", "class", "has", "many", "useful", "methods")));
    }*/
}
