package WorkingWithNumbers;

import java.util.Scanner;

public class XdivisorsInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        int count = 0;
        for (int i = n; i <=m ; i++) {
            int divisorCount = 0;
            for (int j = 1; j <=i ; j++) {
                if(i%j==0){
                    divisorCount++;
            }
            } if (divisorCount == x){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Number of integers which has exactly x divisors: " + count);
    }
}
