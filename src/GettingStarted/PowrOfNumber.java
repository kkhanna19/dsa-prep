package GettingStarted;

import java.util.Scanner;

public class PowrOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();

//        double result = Math.pow(num,power);
//        System.out.println(result);
        int result = 1;
        for (int i = 1; i <= power ; i++) {
            result = result * num;
        }
        System.out.println(result);
    }
}
