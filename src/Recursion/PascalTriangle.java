package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(pascal(n));
       pasTriangle(n);
    }

   public static ArrayList<Integer> pascal(int n){
        ArrayList<Integer> pascalList = new ArrayList<>();
        pascalList.add(1);

        if(n == 0){
            return pascalList;
        }
        ArrayList<Integer> previous = pascal(n-1);
        for (int i = 1; i < previous.size() ; i++) {
           int value =  previous.get(i-1) + previous.get(i);
           pascalList.add(value);
        }
        pascalList.add(1);
        return pascalList;
    }

    public static void pasTriangle(int n){
        for (int i = 0; i < n; i++) {
            int first = 1;
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(first + "  ");
                first = first*(i-k)/(k+1);
            }
            System.out.println();
        }

    }
}
