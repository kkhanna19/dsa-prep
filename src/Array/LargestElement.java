package Array;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: " );
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: " );
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("largest elememt is: " + largestElement(arr));
    }

    public static int largestElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
