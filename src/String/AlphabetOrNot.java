package String;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ){
            System.out.println("is alphabet");
        } else{
            System.out.println(ch + " is not an alphabet");
        }
    }
}
