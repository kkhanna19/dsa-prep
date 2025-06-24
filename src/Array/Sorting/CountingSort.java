package Array.Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(arr[i] , largest);
        }
        int[] count = new int[largest+1];
        for (int j = 0; j < arr.length; j++) {
            count[arr[j]]++;
        }
        int l = 0;
        for (int k = 0; k < count.length; k++) {
            while (count[k] > 0 ){
                arr[l] = k;
                l++;
                count[k]--;
            }
        }
    }
}
