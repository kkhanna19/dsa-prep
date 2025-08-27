package Hashing.HashSets;

import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String[] args) {   //O(n)
        int[] num = {4, 3, 2,5,6,7,3,4,2,1};
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
           hs.add(num[i]);
        }
        System.out.println("size: " + hs.size());


        System.out.print("Distinct elements are: ");
        for (Integer val : hs) {
            System.out.print(val + " ");
        }
    }
}
