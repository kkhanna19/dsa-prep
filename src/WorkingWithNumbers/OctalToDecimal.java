package WorkingWithNumbers;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double decimal=0 ;
        int power = 0;

        while (n != 0){
            int remainder = n %10;
            decimal = decimal + remainder*(Math.pow(8,power));
            power++;
            n = n / 10;
        }
        System.out.println(decimal);
    }
}
