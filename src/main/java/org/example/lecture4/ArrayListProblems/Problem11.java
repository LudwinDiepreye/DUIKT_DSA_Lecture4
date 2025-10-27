package org.example.lecture4.ArrayListProblems;

import java.util.HashSet;

/// Write a program to find the intersection of multiple Sets.
public class Problem11 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(5);
        set2.add(6);

        System.out.println("Set one before intersection: " + set);
        System.out.println("Set two before intersection: " + set2);

        set.retainAll(set2); // This means keep all the elements in set 1 that are also in set 2
        System.out.println(set); // We print out the intersection
    }
}
