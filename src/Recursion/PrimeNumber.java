package Recursion;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        System.out.println(isPrime(n,i));
    }

    public static boolean isPrime(int n, int i){
        if(n<2){
            return false;
        }
        if (i*i > n){
            return true;
        }
        if(n%i == 0){
            return false;
        }
        return isPrime(n,i+1);

    }
}
