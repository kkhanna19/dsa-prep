package String;

import java.util.Scanner;

public class MaximumNestingParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(maxDepth(s));
    }
        public static int maxDepth(String s) {
            int count = 0;
            int maxCount = 0;
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);

                if(ch =='('){
                    count++;
                    maxCount = Math.max(maxCount, count);
                }
                else if(ch == ')'){
                    count--;
                }
            }
            return maxCount;
        }

}
