package Array;

import java.util.HashMap;
import java.util.Scanner;

public class SubarrayXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.println(subarrayXor(arr, k));
    }

        public static long subarrayXor(int arr[], int k) {
            // code here
            int n = arr.length;
            int xor = 0;
            HashMap<Integer, Integer> map= new HashMap<>();

            map.put(xor, 1);

            int count = 0;
            for(int i=0; i<n; i++){
                xor = xor^arr[i];
                int x = xor^k;
                if(map.containsKey(x)){
                    count += map.get(x);
                }

                map.put(xor, map.getOrDefault(xor, 0) + 1);

            }
            return count;
        }
}
