package org.example.lecture4.ArrayListProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;




/// Program that sorts an ArrayList of Strings alphabetically
public class Problem1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Kolya");
        list.add("Petya");
        list.add("Alice");
        list.add("Lena");
        list.add("Cappuccino");

        /// Before sort
        System.out.println("Unsorted List: " + list);

        ///  After sort
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        ///  OR USE THE OTHER METHOD
        list.sort(Comparator.naturalOrder());
        System.out.println("Also Sorted List: " + list);
    }
}
