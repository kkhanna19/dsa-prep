package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverse(s);
    }
    public static void reverse(String s){
        String str = "";
        for (int i = s.length()-1; i >= 0; i--) {
            str += s.charAt(i);
        }


        System.out.println(str);
    }
}
