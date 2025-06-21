package WorkingWithNumbers;

import java.util.Scanner;

public class AddTwoFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int d1 = sc.nextInt();
        int n2 = sc.nextInt();
        int d2 = sc.nextInt();

        int lcm = lcm(d1,d2);
        int num1 = n1*(lcm/d1);   // for cross multiply
        int num2 = n2*(lcm/d2);    // for cross multiply
        int result = num1 + num2;   // add the numerators

        int hcf = hcf(result, lcm);  // to simplify the result
        int finalNum = result / hcf;
        int finalDen = lcm / hcf;
        System.out.println(finalNum + "/" + finalDen);

    }
    public static int lcm (int a, int b){
        int hcf = hcf(a,b);
        int lcm = (a*b)/hcf;
        return  lcm;
    }
    public static int hcf (int a, int b){
        int hcf =0;
        for (int i = 1; i <= a && i <= b ; i++) {
            if (a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        return hcf;
    }
}
