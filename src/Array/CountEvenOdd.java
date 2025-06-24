package Array;

import java.util.Arrays;
import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        evenAndodd(arr);
    }

    public static void evenAndodd(int[] arr){
        int countEven =0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                countEven++;
            }
            else {
                countOdd++;
            }
        }
        System.out.println("even num: " + countEven);
        System.out.println("odd num: " + countOdd);
    }
}
