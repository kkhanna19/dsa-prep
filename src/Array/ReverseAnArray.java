package Array;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int size = arr.length;
        for (int i = size-1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
//        reverse(arr);
//        System.out.println("Reverse of an array");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }

//    public static void reverse(int[] arr) {
//
//        int Start = 0;
//        int end = arr.length - 1;
//        while (Start <= end) {
//            int swap = arr[Start];
//            arr[Start] = arr[end];
//            arr[end] = swap;
//            Start++;
//            end--;
//        }
//    }
}
