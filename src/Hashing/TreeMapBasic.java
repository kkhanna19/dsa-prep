package Hashing;

import java.util.*;

//sort in alphabetical order  --> o(log n)
//DSA implementation --> Red Black Trees --> BST --> Self Balancing

public class TreeMapBasic {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 10);
        tm.put("China", 100);
        tm.put("USA", 200);
        tm.put("Indonesia", 30);
        System.out.println(tm);

        //no order
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 10);
        hm.put("China", 100);
        hm.put("USA", 200);
        System.out.println(hm);
    }
}
