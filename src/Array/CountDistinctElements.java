package Array;

import java.util.Scanner;

//Counting the elements(non-repeating)

public class CountDistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countElements(arr));
    }

    public static int countElements(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean  nonRepeat = true;
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    nonRepeat = false;
                    break;
                }
            }
            if (nonRepeat){
                count++;
            }
        }
        return count;
    }
}
