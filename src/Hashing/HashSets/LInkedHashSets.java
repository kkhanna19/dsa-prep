package Hashing.HashSets;
import java.util.*;

public class LInkedHashSets {
    public static void main(String[] args) {
        //no order
        HashSet<String> city = new HashSet<>();

        city.add("jaipur");
        city.add("mumbai");
        city.add("noida");
        city.add("bengaluru");
        System.out.println(city);

        //LHS performance < HashSets
        //maintains insertion order
        LinkedHashSet <String> lhs = new LinkedHashSet<>();
        lhs.add("jaipur");
        lhs.add("mumbai");
        lhs.add("noida");
        lhs.add("bengaluru");
        System.out.println(lhs);
        lhs.remove("mumbai");
        System.out.println(lhs);
    }
}
