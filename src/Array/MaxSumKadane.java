package Array;

import java.util.Scanner;

public class MaxSumKadane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxSubarraySum(arr));
    }
        public static int maxSubarraySum(int[] arr) {
                int sum = 0;
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                    max = Math.max(sum, max);
                    if (sum < 0) {
                        sum = 0;
                    }
                }
                return max;
            }
        }

