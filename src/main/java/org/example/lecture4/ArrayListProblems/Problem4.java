package org.example.lecture4.ArrayListProblems;

import java.util.LinkedList;

/// Create a LinkedList and perform various operations like add, remove, and iterate over it.
public class Problem4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original List: " + list);

        list.remove("A");
        System.out.println("New List: " + list);

        System.out.println("Iterating through the list: ");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
