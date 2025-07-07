package String;

import java.util.Scanner;

public class OuterParentheses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();

        System.out.println("Output after removing outer parentheses:");
        System.out.println(removeOuterParentheses(s));
    }
    public static  String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' ){
                if(left > 0){
                    sb.append(ch);
                }
                left++;
            }
            else{
                left--;
                if(left > 0)
                    sb.append(ch);

            }
        }
        return sb.toString();
    }

}

