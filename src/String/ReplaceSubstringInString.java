package String;

import java.util.Scanner;

public class ReplaceSubstringInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original String: ");
        String s1 = sc.nextLine();
        System.out.print("replace this: ");
        String s2 = sc.nextLine();
        System.out.print("replace to: ");
        String s3 = sc.nextLine();

        String str = s1.replaceAll(s2, s3);
        System.out.print("Modified String: " + str);
    }
}
