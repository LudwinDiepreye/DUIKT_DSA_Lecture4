package org.example.lecture4.ArrayListProblems;

import java.util.HashSet;

/// Write a program to check if a HashSet is a subset of another HashSet.
public class Problem13 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println(set);
        System.out.println(set2);

        if(set2.containsAll(set)){
            System.out.println("Set1 is A Subset of Set 2");
        }else{
            System.out.println("Set2 is NOT a Subset of Set 1");
        }
    }
}
