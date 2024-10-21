package Oct_24;

import javax.swing.*;
import java.util.Scanner;

public class lab_18Oct_practice_switchstment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day between 1-7");
        int day = in.nextInt();
        in.close();
        switch (day)
        {
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("Tues");
                  break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thrus");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("There is no day define in calender");

        }
    }
}
