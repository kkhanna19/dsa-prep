package WorkingWithNumbers;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int decimal = 0;

        int power = 0;
        while ( n != 0){
            int remainder = n % 10;
            decimal = decimal + remainder*((int)Math.pow(2, power));
            power++;
            n = n / 10;
        }
//        System.out.println(decimal);

        double octal = 0;
        power = 0;
        while (decimal != 0){
            double remainder =  decimal % 8;
            octal = octal + remainder*(Math.pow(10, power));
            power++;
            decimal = decimal/8;
        }
        System.out.println(octal);
    }
}
