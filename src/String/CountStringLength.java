package String;

import java.util.Scanner;

public class CountStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        int count = 0;
        for (char i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println("Length of String is : "+ count);
    }
}
