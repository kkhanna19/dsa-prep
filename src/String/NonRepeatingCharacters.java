package String;

import java.util.Scanner;

public class NonRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(nonRepeat(s));
    }
    public static String nonRepeat(String s){
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)){
                    unique = false;
                    break;
                }
            }
           if (unique){
               return String.valueOf(s.charAt(i));
           }
        }
        return "-1";
    }
}
