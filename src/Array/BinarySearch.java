package Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key: ");
        int key = sc.nextInt();

        System.out.println(binarySearch(arr,key));
    }

    public static int binarySearch(int[] arr, int key){
        int start = 0;
        int n = arr.length;
        int end = n-1;

        while (start <= end){
            int mid = (start+end)/2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
