package Array;

import java.util.Arrays;
import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(equilibriumIndex(arr));
    }

    public static int equilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
        if (leftSum == totalSum) {
            return i;
        }
        leftSum += arr[i];
    }
        return -1;
    }
}
