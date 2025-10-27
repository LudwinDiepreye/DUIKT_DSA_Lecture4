package org.example.lecture4.ArrayListProblems;

import java.util.ArrayList;

/// Write a program to merge two ArrayLists into a single ArrayList.
public class Problem10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("F");
        list2.add("G");
        list2.add("H");
        list2.add("I");
        list2.add("J");

        System.out.println("First List: " + list);
        System.out.println("Second List: " + list2);

        list.addAll(list2); // Here we add the second List to the first list
        System.out.println("After adding: " + list);
    }
}
