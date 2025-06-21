package WorkingWithNumbers;

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a hexadecimal number: ");
                String hex = sc.nextLine();

                int decimal = Integer.parseInt(hex, 16);
                System.out.println("Decimal value: " + decimal);
    }
}
