package Recursion;

import java.util.Scanner;

public class ReversingANumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n,0));
    }

    public static int reverse(int n, int reverse){
        if (n == 0){
            return reverse;
        }
        int remainder = 0;
        remainder = n%10;
        reverse = reverse * 10 + remainder;
        return reverse(n/10,reverse);
    }
}
