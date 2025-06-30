package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(compare(s1,s2) + " Strings are anagram" );
    }

    public static boolean compare(String a, String b){
        if(a.length() != b.length()){
            return  false;
        }
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < a.length(); i++) {
            if (ch1[i] == ch2[i]){
                return  true;
            }

        }
        return false;
    }
}
