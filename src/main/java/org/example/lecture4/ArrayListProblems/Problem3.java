package org.example.lecture4.ArrayListProblems;

import java.util.ArrayList;
import java.util.HashSet;

/// Program that removes all duplicate elements from an ArrayList
public class Problem3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);

        System.out.println("Original List: " + list);

        // We use a HashSet to store unique elements
        HashSet<Integer> uniqueElements = new HashSet<>(list);// we add list here in brackets because we pass on the values from list to our hashset
        ArrayList<Integer> list2 = new ArrayList<>(uniqueElements); // we take those unique elements from our hashset and add them to a new ArrayList

        System.out.println("No Duplicate List: " + list2);

    }
}
