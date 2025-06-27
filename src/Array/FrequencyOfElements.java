package Array;

import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        occurrence(arr);
    }

    public static void occurrence(int[] arr){
        int n = arr.length;
        boolean[] used = new boolean[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (used[i]){
                continue;
            }
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j] ){
                    count++;
                    used[j] = true;
                }
            }
            System.out.println( arr[i] + " occurs " + count + " times ");
        }

    }
}
