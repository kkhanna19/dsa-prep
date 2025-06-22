package Array;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Smallest element is: " + SecondSmallestElement(arr));
    }

    public static int SecondSmallestElement(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int Ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                Ssmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] > smallest && arr[i] < Ssmallest){
                Ssmallest = arr[i];
            }
        }
        return Ssmallest;
    }
}
