package String;

import java.util.Scanner;

public class ReplaceWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original String: ");
        String s1 = sc.nextLine();
        System.out.print("replace this: ");
        String s2 = sc.nextLine();

        String str = "";
        String[] wordArray = s1.split(" ");
        for (int i = 0; i < wordArray.length; i++) {
            if (!wordArray[i].equals(s2)){
                str += wordArray[i] + " ";
            }
        }
        System.out.println("modified string: " + str.trim());
    }
}
