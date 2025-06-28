package String;

import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String str = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println(str);
    }
}
