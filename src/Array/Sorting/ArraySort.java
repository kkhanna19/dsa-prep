package Array.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySort {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
//            int[] arr = new int[n];
              Integer[] arr = new Integer[n];   //For Descending
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
//            Arrays.sort(arr);
              Arrays.sort(arr, Collections.reverseOrder()) ;//For Descending
              System.out.println(Arrays.toString(arr));
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
        }
}
