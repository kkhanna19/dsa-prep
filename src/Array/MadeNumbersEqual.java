package Array;

import java.util.Scanner;

public class MadeNumbersEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if(madeNumEqual(arr)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }

    public static boolean madeNumEqual(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] % 2 == 0 ){
                arr[i] /= 2;
            }
            while (arr[i] % 3 == 0 ){
                arr[i] /= 3;
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                return false;
            }
            }
        return true;
        }

    }
