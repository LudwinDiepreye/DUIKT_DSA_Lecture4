package org.example.lecture4.HashSetProblems;

import java.util.HashSet;

/// Write a program to check if a particular element exists in a HashSet.
public class Problem2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);

        int k = 5; // The element we are checking for

        if(hashSet.contains(k)){
            System.out.println("YES the hashset contains the element");
        }else{
            System.out.println("NO the hashset DOES NOT contain the element");
        }
    }
}
