package WorkingWithNumbers;

import java.util.Scanner;

public class FindOutTheQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("First Quadrant");
        }
        if (x < 0 && y > 0) {
            System.out.println("Second Quadrant");
        }
        if ( x<0 && y<0) {
            System.out.println("Third Quadrant");
        }
        if ( x>0 && y<0) {
            System.out.println("Forth Quadrant");
        }
        if ( x==0 && y==0) {
            System.out.println("At Origin");
        }
        if ( x!=0 && y==0) {
            System.out.println("X Axis");
        }
        if ( x>0 && y>0) {
            System.out.println("Y Axis");
        }
    }
}
