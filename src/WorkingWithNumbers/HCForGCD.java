package WorkingWithNumbers;

import java.util.Scanner;

public class HCForGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int HCF = 0;
        for (int i = 1; i <= a || i <= b; i++) {
            if(a%i==0 && b%i==0){
                System.out.println(i);
                HCF = i;
            }
        }
        System.out.println(HCF);
    }



}
