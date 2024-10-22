package Oct_24.ex_17Oct_ifelsestmnt;

import java.util.Scanner;

public class lab_17Oct_practice_postiveNegative {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any value");
        int S1 = Sc.nextInt();
        if (S1 >= 0){
            System.out.println("Value is Positive");
        }
        else if (S1 <= 0){
            System.out.println("Value is negative");
        }
    }
}
