package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        replaceElement(arr);
    }

    public static void replaceElement(int[] arr){
        int[] clone = arr.clone();
        Arrays.sort(clone);
        System.out.println(Arrays.toString(clone));
        int n = arr.length;
        int[] newArr = new int[n];
        boolean[] used = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i] == clone[j]  && !used[j]){
                    newArr[i] = j+1;
                    used[j] = true;
                    break;
                }
            }
        }
//        System.out.println(Arrays.toString(used));
        System.out.println(Arrays.toString(newArr));
    }
}
