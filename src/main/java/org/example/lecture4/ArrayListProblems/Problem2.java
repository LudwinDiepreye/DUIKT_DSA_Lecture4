package org.example.lecture4.ArrayListProblems;

import java.util.ArrayList;
import java.util.Collections;

/// Program that finds the maximum element in an ArrayList of Integers
public class Problem2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums  = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        int max = Collections.max(nums); // We find the max value
        System.out.println(max);
    }
}
