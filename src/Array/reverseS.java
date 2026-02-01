package Array;

import java.util.Scanner;

public class reverseS {
    public static void main(String[] args){
        String s = "HI MY NAME IS KAJAL";
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
