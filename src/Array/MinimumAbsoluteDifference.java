package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        minimumDifference(arr);
    }

    public static void minimumDifference(int[] arr){
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += Math.abs(arr[i] - arr[j]);
                System.out.println(sum);
            }
                result = Math.min(result,sum);
        }
        System.out.println("mininmum diffrence is: " + result);
    }
}
