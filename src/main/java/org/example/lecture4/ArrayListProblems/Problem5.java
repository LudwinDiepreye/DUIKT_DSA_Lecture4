package org.example.lecture4.ArrayListProblems;

import java.util.ArrayList;

/// Write a program to find the intersection of two ArrayLists.
public class Problem5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(1);

        list.retainAll(list2); // This means keep all the elements in list one that are also in list2 (we can also create a new ArrayList to house the intersectin as well)
        System.out.println("Intersection between the lists are: " + list);
    }
}
