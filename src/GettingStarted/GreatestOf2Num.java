package GettingStarted;

import java.util.Scanner;

public class GreatestOf2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Both are equal");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greatest");
        } else {
            System.out.println(num2 + "is greatest");
        }
    }
}
