package String;

import java.util.*;


public class StringBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Your string logic
        System.out.print("Enter a string to reverse: ");
        String s1 = sc.nextLine();
        System.out.println("Reversed: " + reverseString(s1));

        sc.close();
    }

    static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
