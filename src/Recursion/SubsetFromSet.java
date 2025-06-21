package Recursion;

import java.util.Scanner;

public class SubsetFromSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       subset(arr, "", 0);
    }

    public static void subset(int[] arr, String result, int i){
        if(arr.length == i) {
            System.out.println(result);
            return;
        }
        subset(arr, result + arr[i] + " ", i+1);  //include
        subset(arr, result , i+1);  //exclude
    }
}
