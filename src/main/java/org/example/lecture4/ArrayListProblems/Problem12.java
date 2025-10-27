package org.example.lecture4.ArrayListProblems;

import java.util.LinkedList;

/// Write a program to check if two LinkedLists are equal.
public class Problem12 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);

        boolean isEqual = linkedList.equals(linkedList2);
        System.out.println(isEqual);
    }
}
