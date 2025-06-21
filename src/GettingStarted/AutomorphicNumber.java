package GettingStarted;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int remainder = 0;
            int square = n*n;

            remainder = square % 10;

            if (remainder == n ){
                System.out.println("Automorphic Number");
            } else{
                System.out.println("Not Automorphic");
            }
    }
}
