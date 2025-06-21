package WorkingWithNumbers;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double octal = 0;
        int power = 0;
        while( n != 0){
            int deci = n % 8;
            octal = octal + deci*(Math.pow(10, power));
            power++;
            n = n/8;
        }
        System.out.println(octal);
    }
}
