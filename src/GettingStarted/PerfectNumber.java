package GettingStarted;

import java.util.Scanner;

public class PerfectNumber {

//    A Number that can be represented as the sum of it's factors except the number itself is known as the Perfect Number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

          int sum = factor(n);
          if(sum == n){
              System.out.println("perfect number");
          }
        }

        public static int factor(int n){
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if(n%i==0){
                    sum += i;
                    System.out.println(i + " ");
                }
            }
            return  sum;
    }
}
