package WorkingWithNumbers;

import java.util.Scanner;

public class SumOfPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i =2; i <= n ; i++) {
            if (isPrime(i) && isPrime(n-i)){
                System.out.println(n + " = " + i + " + " + (n-i));
                return;
            }
        }
        System.out.println("not a sum");

    }

    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for (int i = 2; i < num ; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
