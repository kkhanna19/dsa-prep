package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isDuplicate(str));
    }

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;    //Duplicate found
                } else {
                    s.pop();
                }
            } else {
                //opening
                s.push(ch);
            }
        }
        return false;
    }
}
