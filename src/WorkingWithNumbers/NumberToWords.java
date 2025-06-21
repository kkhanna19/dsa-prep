package WorkingWithNumbers;

import java.util.Scanner;


public class NumberToWords {

         static String[] oneToNineteen = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

         static String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if( n == 0){
            System.out.println("zero");
        }else {
            System.out.println(convert(n));
        }
    }

    public static String convert(int num){

        StringBuilder result = new StringBuilder();
        if (num >= 1000) {
            result.append(oneToNineteen[num / 1000]).append(" Thousand ");
            num %= 1000;
        }

        if (num >= 100) {
            result.append(oneToNineteen[num / 100]).append(" Hundred ");
            num %= 100;
        }

        if (num >= 20) {
            result.append(tens[num / 10]).append(" ");
            num %= 10;
        }

        if (num > 0) {
            result.append(oneToNineteen[num]).append(" ");
        }

        return result.toString().trim();
    }

}
