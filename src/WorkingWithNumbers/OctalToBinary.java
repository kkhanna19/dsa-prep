package WorkingWithNumbers;

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int decimal = 0;
        int power = 0;
        while( n != 0){
            int rem = n%10;
            decimal = decimal + rem*((int)Math.pow(8, power));
            power++;
            n = n/10;
        }

        System.out.println(decimal);
        int binary = 0;
        power = 0;
        while (decimal != 0){
            int rem = decimal%2;
            binary = binary + rem*((int)Math.pow(10, power));
            power++;
            decimal = decimal/2;
        }
        System.out.println(binary);
    }

}
