package Oct_24.ex_17Oct_ifelsestmnt;

import java.util.Scanner;

public class lab_17_oct_Practice_tringle {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Value S1");
        int S1 = Sc.nextInt();
        System.out.println("Enter value S2");
        int S2 = Sc.nextInt();
        System.out.println("Enter value S3");
        int S3 = Sc.nextInt();

        if (S1 <= 0 || S2 <= 0 || S3 <= 0) {
            System.out.println("Invalid input : value should eb positive number");
        } else if (S1 == S2 && S2 == S3 && S1 == S3) {
            System.out.println("Triagnle is equilater");
        } else if (S1 == S2 || S2 == S3 || S3 == S1) {
            System.out.println("Trinagle is ISO");
        } else {
            System.out.println("Tringale is Scalne");
        }
        Sc.close();

    }
}

