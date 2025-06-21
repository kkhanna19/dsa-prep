package WorkingWithNumbers;

import java.util.Scanner;

public class OccurenceOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int n = sc.nextInt();

        int count = 0;
        while (number != 0) {
            int remainder = (int)number % 10;
            if (remainder == n) {
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);
    }
}
