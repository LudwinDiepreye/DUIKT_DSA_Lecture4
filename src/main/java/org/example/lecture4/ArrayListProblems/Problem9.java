package org.example.lecture4.ArrayListProblems;

import java.util.ArrayList;
import java.util.Collections;

/// Write a program to find the kth smallest element in an ArrayList.
public class Problem9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(3);

        Collections.sort(list);

        int k = 2;
        System.out.println(k + "th smallest element: " +list.get(k-1));
    }
}
