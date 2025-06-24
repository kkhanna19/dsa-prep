package Array.Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i-1;
            while (previous >=0 && arr[previous] > current){
//                while (previous >= 0 && arr[previous] < current)  // for descending
                arr[previous + 1 ] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;
        }
    }
}
