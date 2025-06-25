package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetArray {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("size of array 1: ");
            int n = sc.nextInt();
            System.out.println("size of array 2: ");
            int m = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

        System.out.println("Array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Array 2: ");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if (subsetArray(arr1,arr2)){
            System.out.println("yes it is a subset");
        } else {
            System.out.println("no it is not a subset");
        }
    }

    public static boolean subsetArray(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
