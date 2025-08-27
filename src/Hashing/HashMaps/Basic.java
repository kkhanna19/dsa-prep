package Hashing.HashMaps;

import java.util.HashMap;

//HashMap -> Unordered

public class Basic {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert -> O(1)
        hm.put("India", 10);
        hm.put("China", 100);
        hm.put("USA", 200);
        System.out.println(hm);

        //Get ->  O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        //ContainsKey -> O(1)
        System.out.println(hm.containsKey("USA"));
        System.out.println(hm.containsKey("London"));

        //remove -> o(1) remove key and value both
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        System.out.println(hm.remove("London"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        hm.clear();  //--> clear all
        System.out.println(hm.isEmpty());
    }
}
