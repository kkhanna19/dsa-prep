package Hashing.HashSets;

import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> set = new HashSet<>();

        //union
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("union: " + set.size());
        System.out.print("union values: ");
        for (Integer val : set) {
            System.out.print(val + " ");
        }
        System.out.println();


        //intersection
        set.clear();
        //add
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        //check if exist
        int count = 0;
        System.out.print("Intersection values: ");
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                System.out.print(arr2[i] + " "); // print directly
                set.remove(arr2[i]);   // so that we don't count that twice
            }
        }
        System.out.println();
        System.out.println("Intersection: " + count);

    }
}
