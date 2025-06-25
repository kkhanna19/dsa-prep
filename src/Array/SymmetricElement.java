package Array;

import java.util.Scanner;

public class SymmetricElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
               arr[i][j] =sc.nextInt();
            }
        }

        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j]);
            }
        }
       pairs(arr);
    }

    public static void pairs(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int x1 = arr[i][0];
            int y1 = arr[i][1];
            for (int j = i + 1; j < arr.length; j++) {
                int x2 = arr[j][0];
                int y2 = arr[j][1];
            if (x1 == y2 && x2 == y1){
                System.out.println("(" + x1 + ", " + y1 + ")");
                System.out.println("(" + x2 + ", " + y2 + ")");
            }
        }
    }
    }
}
