package String;

import java.util.Scanner;

public class CapitalizeFirstNLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String str = "";
        for (int i = 0; i < s.length(); i++) {
               char ch1 = Character.toUpperCase(s.charAt(0));
               char ch2 = Character.toUpperCase(s.charAt(s.length() - 1));
            String middle = s.substring(1,s.length()-1);
            str = ch1 + middle + ch2;
        }
        System.out.println(str);
    }
}
