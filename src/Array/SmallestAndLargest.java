package Array;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: " );
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the elements: " );
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    smallestAndlargestElement(arr);
}
public static void smallestAndlargestElement(int[] arr){
     int largest = Integer.MIN_VALUE;
     int smallest = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
        if(arr[i] > largest){
            largest = arr[i];
        }
        if (arr[i] < smallest){
            smallest = arr[i];
        }
    }
    System.out.println("largest element is: " + largest);
    System.out.println("smallest element is: " + smallest);
}
}
