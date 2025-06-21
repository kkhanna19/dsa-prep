package GettingStarted;

import java.util.Scanner;

public class Fibonacci {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int previous = 0;
//        int current = 1;
//
//        for (int i = 0; i <=n ; i++) {
//            int next = previous + current;
//            System.out.print(previous+ " ");
//            previous = current;
//            current = next;
//        }
//
//    }

    // Recursive method to get nth Fibonacci number
    static int fib(int n) {
        if (n <= 1)
            return n;  // base case: fib(0) = 0, fib(1) = 1
        return fib(n - 1) + fib(n - 2);  // recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}