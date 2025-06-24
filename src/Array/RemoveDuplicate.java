package Array;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        removeDuplicate(arr);
    }

    public static void removeDuplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean repeat = false;
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    repeat= true;
                    break;
                }
            }
            if(!repeat){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
