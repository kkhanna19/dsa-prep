package GettingStarted;

import java.util.Scanner;

public class StrongNumber {
//🔹 A Strong number is a number in which the sum of the factorials of its digits is equal to the number itself.
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <=n ; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int temp = n;
        while ( n != 0){
            int digit = n % 10;
            sum = sum + factorial(digit);
            n = n/10;
        }
        if(sum == temp ){
            System.out.println("Strong");
        }
        else {
            System.out.println("Not Strong");
        }
    }
}
