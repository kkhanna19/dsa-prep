package Array;

import java.util.Scanner;

public class LongestPlaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next(); // read n strings
        }

        System.out.println(longest(arr));
    }

    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;

        while (start<end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String longest(String[] arr){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            String palin = arr[i];
            if (isPalindrome(palin)) {
                if (palin.length() > str.length()) {
                    str = palin;
                }
            }
        }
        return str;
    }
}
