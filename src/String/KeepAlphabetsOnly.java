package String;

import java.util.Scanner;

public class KeepAlphabetsOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = s.replaceAll("[^A-Za-z]", "");
        System.out.println(str);
    }
}
