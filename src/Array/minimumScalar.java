package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Sort the first array in ascending order,
//Sort the second array in descending order.

public class minimumScalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        Integer[] arr2 = new Integer[n];

        System.out.println("Enter the elements of arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of arr2: " );
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        scalar(arr1,arr2);
    }

    public static void scalar(int[] arr1, Integer[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i]*arr2[i];
//            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
