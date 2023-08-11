package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
        sourceList.forEach(System.out::println);
    }

    /*public static void main(String[] args) {
        var obj = new ListSorter();
        obj.sort(new ArrayList<>(List.of("-5", "-12", "0", "20", "9", "-20", "37")));
    }*/
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aValue = Integer.parseInt(a);
        int bValue = Integer.parseInt(b);

        int difference = getFunctionValue(aValue) - getFunctionValue(bValue);
        if (difference == 0) {
            return aValue - bValue;
        }
        return difference;
    }

    private int getFunctionValue(int x) {
        return 5 * x * x + 3;
    }
}
