package GettingStarted;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n < 2){
//            System.out.println(n + " not prime");
            isPrime = false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
               isPrime = false;
               break;
            }
        }
        if (isPrime) {
            System.out.println(n + " Prime Number");
        } else {
            System.out.println(n + " Not prime");
        }
    }
}
