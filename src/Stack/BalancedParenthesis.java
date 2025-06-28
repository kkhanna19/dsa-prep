package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(balanced(s));
    }

    public static boolean balanced(String s){
        Stack<Character> parenthesis = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{'){
                parenthesis.push(ch);
            }
            else {
                if(parenthesis.isEmpty()){
                    return false;
                }
                if (parenthesis.peek()=='(' && ch== ')' || parenthesis.peek()=='[' && ch==']' || parenthesis.peek() == '{' && ch=='}'){
                    parenthesis.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(parenthesis.isEmpty()){
            return true;
        }
        return false;
    }
}
