package Array;

import java.util.Scanner;

public class PrintRepeatingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printRepeat(arr);
    }

    public static void printRepeat(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean repeat = false;
            for (int k = 0; k < i ; k++) {
                if (arr[i] == arr[k]){
                    repeat = true;
                    break;
                }
            }
            if(repeat){
                continue;
            }
            int count = 0;
            for (int j = i+1 ; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count ++;
                }
            }
            if (count > 0){
                System.out.println(arr[i]);
            }
        }

    }
}
