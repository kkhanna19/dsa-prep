package String;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        count(s);
    }

    public static void count(String s){
        boolean[] used = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int c = 0;
            if (used[i]){
                continue;
            }
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    c++;
                    used[j] = true;
                }
            }
            System.out.println(s.charAt(i) + "->" + c);
        }

    }
}
