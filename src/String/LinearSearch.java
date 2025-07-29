package String;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter key: ");
        String key = sc.nextLine();

        System.out.print("enter elements: ");
        String s = sc.nextLine();

        int index = 0;
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == key.charAt(0)) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
    }
