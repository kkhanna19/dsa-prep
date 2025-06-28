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
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 != ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
