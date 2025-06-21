package Recursion;

import java.util.Scanner;

public class FNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(term(1,n,1));

    }

//    public static int term(int n){
//        if(n == 0){
//            return 0;
//        }
//        int sum = 0;
//        int num = 1;
//        for (int i = 1; i <=n; i++) {
//            long product = 1;
//            for (int j = 1; j <=i ; j++) {
//               product = product*num;
//               num++;
//            }
//            sum += product;
//        }
//        return sum;
//    }

        public static long term(int start, int n, int num) {
            if (start > n) {
                return 0;
            }
            long product = 1;
            for (int i = 1; i <= start; i++) {
               product = product*num;
               num++;
            }

            return product+term(start+1,n,num);
        }
}
