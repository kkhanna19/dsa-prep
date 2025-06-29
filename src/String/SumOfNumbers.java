package String;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                sum += s.charAt(i)-'0';
            }
        }
        System.out.println(sum);
    }
}



//The reason we subtract '0' is to convert the character digit (e.g., '5') into its integer value (e.g., 5)
//'1' → 49 − 48 = 1
//'2' → 50 − 48 = 2
//'3' → 51 − 48 = 3