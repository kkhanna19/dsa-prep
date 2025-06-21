package WorkingWithNumbers;

import java.util.Scanner;

public class CountDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        int days = 0;
        switch(month){
            case 1 : case 3 : case 5 : case 7 : case 8: case 10: case 12: days = 31;
            break;
            case 4: case 6: case 9: case 11 : days = 30;
            break;
            case 2: if(year % 400 ==0 || (year%4 == 0 && year % 100 !=0)){
                days = 29;
            } else {
                days= 28;

            }
            break;
            default:
                System.out.println("Not Valid");
                break;
        }
        System.out.println(days);

    }
}
