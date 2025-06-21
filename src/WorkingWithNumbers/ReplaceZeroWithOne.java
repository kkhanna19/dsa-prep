package WorkingWithNumbers;

import java.util.Scanner;

public class ReplaceZeroWithOne {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int result = 0;
//        int place = 1;
//        while (n != 0){
//            int remainder = n % 10;
//            if(remainder == 0) {
//                remainder = 1;
//            }
//                result = result + (remainder*place);
//                place = place * 10;
//                n = n/10;
//            }
//
//        System.out.println(result);
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();

//    n = n.replace('0', '1');
//
//    System.out.println(n);

    String str = "";
    for (int i = 0; i < n.length(); i++) {
        if(n.charAt(i)=='0'){
            str = str + '1';
        } else {
            str = str + n.charAt(i);
        }
    }
    System.out.println(str);
}
}
