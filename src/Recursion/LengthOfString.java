package Recursion;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(length(s));
    }

    public static int length(String s ){
        if(s.equals("")){
            return 0;
        }
        return 1+length(s.substring(1));
    }
}
