package Array;

import java.util.Scanner;

public class PrintSubArrayAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        subArrayAndSum(arr);
    }

    public  static void subArrayAndSum(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int end = 0;
        int start= 0;

        for (int i = 0; i < nums.length; i++) {
            // If starting a new subarray
            if (currSum == 0) {
                start = i;
            }

            currSum += nums[i];

            if (currSum > maxSum) {
                maxSum = currSum;
                end = i;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

}

