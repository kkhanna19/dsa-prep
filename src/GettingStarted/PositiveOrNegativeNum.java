package GettingStarted;

import java.util.Scanner;

public class PositiveOrNegativeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0){
            System.out.println("positive");
        } else if (n<0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("zero");
        }
    }
}
