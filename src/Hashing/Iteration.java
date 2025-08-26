package Hashing;
import java.util.*;

import java.util.HashMap;

public class Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 10);
        hm.put("China", 100);
        hm.put("USA", 200);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k: keys){
            System.out.println("key = " + k + ", value = " + hm.get(k));
        }

        //entrySet() --> all entries
        Set<Map.Entry<String, Integer>> key = hm.entrySet();
        System.out.println(key);

        for (Map.Entry<String, Integer> k : key){
            System.out.println("pairs : " + k);
        }
    }
}
