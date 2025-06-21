package Recursion;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        if (s.length() <= 1) {
            return s;
        }
        StringBuilder duplicates = new StringBuilder();
        int i = 0;
        boolean changed = false;

        while (i < s.length()) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                char result = s.charAt(i);
                changed = true;
                while (i < s.length() && result == s.charAt(i)) {
                    i++;
                }
            } else {
                duplicates.append(s.charAt(i));
                i++;
            }
        }
        if (changed) {
            return removeDuplicates(duplicates.toString());
        }
        return duplicates.toString();
    }
}
