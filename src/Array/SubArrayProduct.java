package Array;

import java.util.Scanner;

public class SubArrayProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        subArray(arr);
    }

    public static void subArray(int[] arr){
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int product = arr[i];
            result = Math.max(result,product);
            for (int j = i+1; j < arr.length; j++) {
                product = product * arr[j];
                System.out.println("product: " + product);
                result = Math.max(result,product);
            }
        }
        System.out.println(result);
    }
}
