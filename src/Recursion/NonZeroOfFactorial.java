package Recursion;

import java.util.Scanner;

public class NonZeroOfFactorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = fact(n);
        while (factorial%10 == 0){
            factorial=factorial/10;
        }
        System.out.println(factorial%10);
    }

    public static int fact (int n) {
        if(n==0 || n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
}
