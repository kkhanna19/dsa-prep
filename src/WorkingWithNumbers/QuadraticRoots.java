package WorkingWithNumbers;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == 0){
            System.out.println("Invalid");
            return;
        }

        double discriminent = (b*b) - (4*a*c);

        if(discriminent>0){
            System.out.println("Two Real Roots(roots are different and same)");
            System.out.println(((-b - Math.sqrt(discriminent)) / (2 * a)) + " " + ((-b + Math.sqrt(discriminent)) / (2 * a)));
        }
        if (discriminent<0){
            System.out.println("No real roots (Roots are complex)");
            System.out.println((-b / (2 * a)) + " + i" + (Math.sqrt(-discriminent) / (2 * a)) + " " + (-b / (2 * a)) + " - i" + (Math.sqrt(-discriminent) / (2 * a)));
        }
        if(discriminent ==0){
            System.out.println("One real root(Roots are real and same)");
            System.out.println((-b / (2 * a)) + " " + (-b / (2* a)));

        }

    }
}
