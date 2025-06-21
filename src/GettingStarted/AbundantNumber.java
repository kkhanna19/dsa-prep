package GettingStarted;

import java.util.Scanner;

public class AbundantNumber {
//    The sum of its proper divisors (excluding the number itself) is greater than the number.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextByte();

    int sum = 0;
    for (int i = 1; i < n; i++) {
        if(n%i == 0){
            sum += i;
        }
    }
    if(sum > n){
        System.out.println("Abundant Number");
    } else {
        System.out.println("Not Abundant");
    }
}
}
