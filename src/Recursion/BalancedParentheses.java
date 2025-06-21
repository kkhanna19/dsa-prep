package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        parenthesesCombination(n);
    }

    public static void parenthesesCombination(int n){
        ArrayList<String> list = new ArrayList<>();
        generateParentheses(list ,"",0, 0, n);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void generateParentheses(ArrayList<String> list, String current, int open, int close, int n){
        if(current.length() == 2*n){
            list.add(current);
            return;
        }

        if(open < n){
            generateParentheses(list, current+"{",open+1, close, n);
        }
        if(close < open){
            generateParentheses(list, current+"}",open, close+1, n);
        }
    }
}
