package Oct_24.ex_18Oct_switchstmnt;

import java.util.Scanner;

//Write a program that takes an integer input (1-12) and prints the name of the
// corresponding month using a switch statement.
//Input  - 12
//Out - Dec.

public class lab_18Oct_taks3_switch_month {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value between 1-12");
        int num = in.nextInt();
        in.close();
        switch (num) {
            default:
                System.out.println("No month define oout of the range");
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

        }
    }
}



