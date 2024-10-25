package Oct_24.ex_22Oct_Whileloops;

import java.util.Scanner;

public class lab_22Oct_factorialnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        long fact = 1;
        int n = in.nextInt();
        int i = 1;
        while (i < n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
