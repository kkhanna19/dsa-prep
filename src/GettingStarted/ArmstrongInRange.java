package GettingStarted;

import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int digit = 0;
            int remainder = 0;
            int temp = i;
            int result = 0;

            int count = i;
            while (count != 0){
                digit++;
                count /= 10;
            }

            temp = i;
            while (temp != 0){
                remainder = temp%10;
                result += Math.pow(remainder, digit);
                temp /= 10;
            }

            if(result==i){
                System.out.println(i);
            }

        }

    }
}
