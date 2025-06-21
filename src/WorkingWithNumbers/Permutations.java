package WorkingWithNumbers;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int fact = 1;
        for (int i = n; i >=1 ; i--) {
            fact = fact * i;
        }
        int num = n - r;
        int fact1 = 1;
        for (int i = num; i >= 1 ; i--) {
            fact1 = fact1 * i;
        }

        int permutation = fact / fact1;
        System.out.println(permutation);
    }
}
