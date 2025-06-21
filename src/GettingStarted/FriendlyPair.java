package GettingStarted;

import java.util.Scanner;

public class FriendlyPair {
//    The ratio of the sum of their proper divisors to the number itself is equal for both.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextByte();
    int b = sc.nextInt();

    int sum1 = Sum(a);
    int sum2 = Sum(b);

    double ratio1 = (double) sum1/a;
    double ratio2 = (double) sum2/b;

    if(ratio1 == ratio2){
        System.out.println("Friendly Pair");
    } else {
        System.out.println("Not Friendly");
    }

}

public static int Sum(int num){
    int sum = 0;
    for (int i = 1; i < num; i++) {
        if (num % i ==0){
            sum += i;
        }
    }
    return sum;
}
}
