package Hashing;

//KEYS are in insertion order

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapBasic {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        //Insert -> O(1)
        lhm.put("India", 10);
        lhm.put("China", 100);
        lhm.put("USA", 200);
        System.out.println(lhm);

        //no order
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 10);
        hm.put("China", 100);
        hm.put("USA", 200);
        System.out.println(hm);
    }
}
