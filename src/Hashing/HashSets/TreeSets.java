package Hashing.HashSets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();

        city.add("jaipur");
        city.add("mumbai");
        city.add("noida");
        city.add("bengaluru");
        System.out.println(city);

        //LHS performance < HashSets
        //maintains insertion order
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("jaipur");
        lhs.add("mumbai");
        lhs.add("noida");
        lhs.add("bengaluru");
        System.out.println(lhs);


        // Tree Set --> Sorted Order --> O(LOG N)
        //null values not allowed
        TreeSet<String> ts = new TreeSet<>();
        ts.add("jaipur");
        ts.add("mumbai");
        ts.add("noida");
        ts.add("bengaluru");
        System.out.println(ts);
    }
}
