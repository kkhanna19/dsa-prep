package String;

import java.util.Scanner;

public class CountSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(countSubstring(s));
    }

    public static int countSubstring(String s) {

        int count = 0;
        for(int i = 0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                String sub = s.substring(i,j);
                if(sub.contains("a") && sub.contains("b") && sub.contains("c")){
                    count++;
                }
            }
        }
        return count;
    }
}
