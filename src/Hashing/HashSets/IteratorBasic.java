package Hashing.HashSets;

import java.util.*;

public class IteratorBasic {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();

        city.add("jaipur");
        city.add("mumbai");
        city.add("noida");
        city.add("bengaluru");

        Iterator it = city.iterator();
        while (it.hasNext()){
            System.out.println(it.next());    //it automatically updates it ++
        }

        System.out.println();
        //Advanced loops
        for (String c : city){
            System.out.println(c);
        }
    }
}
