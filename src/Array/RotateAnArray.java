package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter D: ");
        int d = sc.nextInt();

        leftRotate(arr,d);
        System.out.println();
        rightRotate(arr,d);
    }

    public static void leftRotate(int[] arr, int d){
        ArrayList<Integer> left = new ArrayList<>();
        for (int i = d; i < arr.length; i++) {
            left.add(arr[i]);
        }
        for (int i = 0; i < d; i++) {
            left.add(arr[i]);
        }
        System.out.print("left rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(left.get(i) + " " );
        }
    }

    public static void rightRotate(int[] arr, int d){
        int n = arr.length;
        ArrayList<Integer> right = new ArrayList<>();
        for (int i = n-d; i < arr.length; i++) {
            right.add(arr[i]);
        }
        for (int i = 0; i < n-d; i++) {
            right.add(arr[i]);
        }
        System.out.print("right rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(right.get(i) + " ");
        }
    }
}
