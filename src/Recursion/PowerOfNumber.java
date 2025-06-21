package Recursion;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(powerOfNumber(number,power));
    }

    public static int powerOfNumber(int n, int p){
        if(p == 0){
            return 1;
        }
        int calculate = n*(powerOfNumber(n,p-1));
        return calculate;
    }
}
