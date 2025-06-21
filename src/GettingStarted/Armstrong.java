package GettingStarted;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        int remainder = 0;
        int temp = n;
        int digit = 0;

        int count = n;
        while (count != 0){
            digit++;
            count = count/10;
        }

        while ( n != 0){
            remainder = n % 10;
            result += Math.pow(remainder, digit);
            n = n/10;
        }
        if(temp == result){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
        System.out.println(result);
    }
}
