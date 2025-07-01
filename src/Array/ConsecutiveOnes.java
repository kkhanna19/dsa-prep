package Array;

import java.util.Scanner;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(continueOnes(arr));
    }

    public static int continueOnes(int[] arr){
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count++;
                max = Math.max(count, max);
            }
            else {
                count = 0;
            }
        }
        return max;
    }
}
