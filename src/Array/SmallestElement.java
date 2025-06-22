package Array;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Smallest elememt is: " + smallestElement(arr));
    }

    public static int smallestElement(int[] arr) {
       int smallest = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

}