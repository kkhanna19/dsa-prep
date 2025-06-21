package Recursion;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println(largest(arr));
        System.out.println(largest(arr,0,0));
    }

//    public static int largest(int[] arr) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }

    public static int largest(int[] arr, int i, int max){
        if(i == arr.length){
            return max;
        }
        if(arr[i]>max){
            max = arr[i];
        }
        return largest(arr, i+1, max);
    }
}
