package String;

import java.util.Scanner;

public class AsciiCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        int i = ch;
        System.out.println("ASCII value of "+ch+" is "+i);
        }
    }

