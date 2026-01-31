package Array.Sorting;

import java.util.Scanner;

public class DutchNationalFlag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int swap = nums[low];
                nums[low] = nums[mid];
                nums[mid] = swap;
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;



            } else {
                int swap = nums[high];
                nums[high] = nums[mid];
                nums[mid] = swap;
                high--;
            }
        }

    }
}
