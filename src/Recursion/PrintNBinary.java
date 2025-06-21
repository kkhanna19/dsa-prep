package Recursion;

import java.util.Scanner;

public class PrintNBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binary(n, "", 0,0);
    }

    public  static void binary(int n, String current, int zero, int ones){
        if(current.length()==n){
            System.out.println(current);
            return;
        }

        binary(n,current + '1', zero, ones+1);
        if(zero<ones){
            binary(n, current + '0', zero+1, ones);
        }
    }
}



//        ┌──┴──┐
//        1"   (✖) ← can't add '0' at start
//        |
//        ┌────┴─────┐
//        "11"        "10"
//        |           |
//        ┌──────┴──────┐    └────┐
//        "111"         "110"     "101"
//        |             |         |
//        ┌───┴───┐     ┌───┴───┐   ┌─┴─┐
//        "1111" "1110" "1101" "1100" "1011"