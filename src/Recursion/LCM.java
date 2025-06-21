package Recursion;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a,b));
    }

    public static int lcm(int a, int b){
        int hcf = hcf(a,b,1,1);

        int lcm = a*b/hcf;
        return lcm;

    }

    public static int hcf(int a, int b, int i, int maxHcf){
       if(i>Math.min(a,b)){
           return maxHcf;
       }
       if(a%i==0 && b%i==0){
           maxHcf = i;
       }
       return hcf(a,b,i+1,maxHcf);
    }
}
