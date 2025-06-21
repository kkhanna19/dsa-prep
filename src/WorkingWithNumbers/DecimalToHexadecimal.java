package WorkingWithNumbers;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();

        String hex = ""; // To store result

        while (decimal > 0) {
            int rem = decimal % 16;
            char hexChar;

            if (rem < 10) {
                hexChar = (char) (rem + '0'); // 0-9
            } else {
                hexChar = (char) (rem - 10 + 'A'); // 10-15 → A-F
            }

            hex = hexChar + hex; // Prepend character
            decimal = decimal / 16;
        }

        System.out.println("Hexadecimal: " + hex);
    }
}
