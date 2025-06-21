package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromicPartitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        combination(s,0,new ArrayList<>());
    }

    public static boolean palindrome( String s){
        int start = 0;
        int end = s.length()-1;
        while (start < end){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void combination(String s, int start, ArrayList<String> result){
        if(start == s.length()){
            System.out.println(result);
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String ch = s.substring(start,i+1);
            if(palindrome(ch)){
                result.add(ch);
                combination(s, i+1, result);
                result.remove(result.size()-1);
            }
        }
    }
}
