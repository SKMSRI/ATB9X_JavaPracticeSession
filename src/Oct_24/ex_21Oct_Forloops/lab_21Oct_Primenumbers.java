package Oct_24.ex_21Oct_Forloops;

import java.util.Scanner;

//Java program to print all Prime numbers between 1 to n using for loop.
public class lab_21Oct_Primenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" please Enter Number");
        int num = sc.nextInt();
        int count = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count == 4) {
                System.out.println(" Number is prime number");

            } else {
                System.out.println(" Not a prime number");
            }
        }

    }
}

