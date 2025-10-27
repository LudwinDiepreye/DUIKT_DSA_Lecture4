package org.example.lecture4.HashSetProblems;

import java.util.HashSet;

/// Create a HashSet and add some elements to it. Then, print the elements of the HashSet.
public class Problem1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Alice");
        hashSet.add("Connor");
        hashSet.add("Cumba");

        System.out.println(hashSet);
    }
}
