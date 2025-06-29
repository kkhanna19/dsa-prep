package String;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String str = s.replaceAll(" ", "");
        System.out.println(str);
    }
}
