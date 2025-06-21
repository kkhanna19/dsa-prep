package WorkingWithNumbers;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double binary = 0;
        int power = 0;
        while( n != 0){
            int deci = n % 2;
            binary = binary + deci*(Math.pow(10, power));
            power++;
            n = n/2;
        }
        System.out.println(binary);
    }
}
