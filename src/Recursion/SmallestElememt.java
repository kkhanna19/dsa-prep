package Recursion;

import java.util.Scanner;

public class SmallestElememt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(smallest(arr, 0,0));
    }

    public static int smallest(int[] arr, int i, int min){
        if(i== arr.length){
            return min;
        }
        if (arr[i]<min){
            min = arr[i];
        }
        return smallest(arr, i+1, min);
    }
}
