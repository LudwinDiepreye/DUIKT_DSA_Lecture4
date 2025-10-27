package org.example.lecture4.ArrayListProblems;

import java.util.ArrayList;
import java.util.Collections;

/// Write a program to find the second-largest element in an ArrayList of Integers.
public class Problem7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Second Largest Element: " +list.get(1));

    }
}
