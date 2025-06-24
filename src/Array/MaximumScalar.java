package Array;

import java.util.Arrays;

import java.util.Scanner;

//Sort the first and second array in ascending order,

public class MaximumScalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter the elements of arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of arr2: " );
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        maximumScalar(arr1,arr2);
//        scalar(arr1,arr2);
        }

   public static void maximumScalar(int[] arr1, int[] arr2){
       bubbleSort(arr1);
       bubbleSort(arr2);
       int sum = 0;
       for (int i = 0; i < arr1.length; i++) {
           sum = sum + (arr1[i] * arr2[i]);
       }
       System.out.println(sum);
   }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

//    public static void scalar(int[] arr1, int[] arr2) {
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        int sum = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            sum = sum + arr1[i]*arr2[i];
////            System.out.println(sum);
//        }
//        System.out.println(sum);
//    }
}

