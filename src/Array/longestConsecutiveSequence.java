package Array;

import java.util.Arrays;
import java.util.Scanner;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestConsecutive(arr));
    }

        public static int longestConsecutive(int[] nums) {
            int n = nums.length;
            if (n == 0) return 0;

            Arrays.sort(nums);

            int longest = 1;
            int count = 1;

            for(int i = 1; i<n; i++){
                if(nums[i] == nums[i-1]+1){
                    count++;
                }
                else if(nums[i] == nums[i-1]){
                    continue;
                }
                else {
                    count = 1;
                }
                longest = Math.max(longest, count);
            }
            return longest;
        }
    }

