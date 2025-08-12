package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isBalanced(str));
    }

    static boolean isBalanced(String str) {
       Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //opening
            if(ch == '(' || ch == '[' || ch == '{'){
                s.push(ch);
            }

            //closing
            else{
                if(s.isEmpty()){
                    return false;
                }
                else {
                    if ((s.peek() == '(' && ch == ')') ||
                            (s.peek() == '[' && ch == ']') ||
                            (s.peek() == '{' && ch == '}')) {
                        s.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
}
