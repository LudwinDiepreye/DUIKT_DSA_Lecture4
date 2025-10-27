package org.example.lecture4.ArrayListProblems;

import java.util.ArrayList;
import java.util.Collections;

/// Write a program to shuffle the elements of an ArrayList.
public class Problem6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //Before Shuffle:
        System.out.println("Unshuffled list: " + list);

        //After Shuffle
        Collections.shuffle(list);
        System.out.println("Shuffled List: " +list);
    }
}
