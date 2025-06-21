package GettingStarted;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (Math.ceil((double)Math.sqrt(n)) == Math.floor((double)Math.sqrt(n))){
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");
        }
    }
}

