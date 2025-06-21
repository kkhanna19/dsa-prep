package GettingStarted;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int reverse = 0;
        int remainder = 0;
        int temp = n;

        while(n != 0){
           remainder = n % 10;
           reverse = reverse * 10 + remainder;
           n = n/10;
        }
        if (temp == reverse){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
