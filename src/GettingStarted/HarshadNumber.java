package GettingStarted;

import java.util.Scanner;

public class HarshadNumber {
//    It is the number which is divisible by sum of its digit.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();

        int sum = 0;
        int remainder = 0;
        while (n != 0){
            remainder = n % 10;
            sum = sum + remainder;
            n = n/10;
        }
        System.out.println(sum);
        if(n % sum == 0){
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad");
        }
    }
}
