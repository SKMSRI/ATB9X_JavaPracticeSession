package Oct_24;

import java.util.Scanner;

public class lab_17_oct_practice_greatestnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = in.nextInt();
        System.out.println("Enter the num2");
        int num2 = in.nextInt();
        System.out.println("Enter the num3");
        int num3 = in.nextInt();
        if (num1 > num2)
            if (num1 > num3)
                System.out.println("The greatest: " + num1);

        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The greatest: " + num2);

        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The greatest: " + num3);
    }
}



