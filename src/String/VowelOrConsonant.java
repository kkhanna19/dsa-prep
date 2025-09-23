package String;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();


        int countV = 0;
        int countC = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                countV++;
//                System.out.println("character is vowel");

            } else {
                countC++;
//                System.out.println("Character is consonant");

            }
        }
        System.out.println(countV);
        System.out.println(countC);
    }
}
