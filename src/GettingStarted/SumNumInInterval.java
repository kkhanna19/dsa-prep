package GettingStarted;

import java.util.Scanner;

public class SumNumInInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println("sum is " + sum);
    }
}
