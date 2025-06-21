package Recursion;

import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        permutation(s," ");

    }

    public static void permutation(String s, String result){
        if(s.length() == 0){
            System.out.println(result);
        }
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            String p = s.substring(0,i) + s.substring(i+1);
            permutation(p,result+ch);
        }
    }
}
