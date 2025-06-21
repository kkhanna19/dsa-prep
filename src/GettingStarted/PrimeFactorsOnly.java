package GettingStarted;

import java.util.Scanner;

public class PrimeFactorsOnly {
// Prime factorization means expressing a number as the product of prime numbers.
//For example:
//12 = 2 × 2 × 3 → So, prime factors are: 2 2 3

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            while ( n % i == 0){
                System.out.println(i);
                n = n/i;
            }
        }
    }
}
