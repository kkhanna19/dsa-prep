package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumWith2pointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        System.out.println(TwoSum(arr, target));
    }
    public static boolean TwoSum(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left<right){
            int sum = arr[left] + arr[right];
                if (sum == target){
                   return  true;
                }
                if (sum<target){
                    left++;
                } else {
                    right--;
                }
        }
        return false;
    }
}
