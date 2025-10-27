package org.example.lecture4.ArrayListProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/// Write a program to find the frequency of each element in an ArrayList.
public class Problem8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(4);

        Map<Integer, Integer > frequencyMap = new HashMap<>();
        for(Integer num : list){
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
        }

        System.out.println("Frequencies of elements: " +frequencyMap);
    }
}
