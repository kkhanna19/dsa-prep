package String;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (isPalindrome(s)) {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }


    }
    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while (start<end){
            char ch1 = s.charAt(start);
            char ch2 = s.charAt(end);
            if(ch1 != ch2){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
