package WorkingWithNumbers;

import java.util.Scanner;

public class DecodeTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(count(s));

    }
    public static int count(String s){
        int n = s.length();
        if(n==0 || s.charAt(0)=='0'){
            return 0;
        }
        int dp[] = new int[n+1];
        dp[0] = 1;  //invalid position
        dp[1] = 1;  //no zero element

        for (int i = 2; i <=n ; i++) {
            // single digit
            if (s.charAt(i-1) != '0'){
                dp[i] = dp[i] + dp[i-1];
            }
            // two digit
            int twoDigits= Integer.parseInt(s.substring(i-2,i));
            if (twoDigits>=10 && twoDigits<=26){
                dp[i] = dp[i] + dp[i-2];
            }
        }
        return dp[n];
    }
}