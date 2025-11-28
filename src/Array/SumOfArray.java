package Array;

import java.util.Scanner;

public class SumOfArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Sum of elements is: " + SumOfElements(arr));
        }
    public static int SumOfElements(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;
        }


}
