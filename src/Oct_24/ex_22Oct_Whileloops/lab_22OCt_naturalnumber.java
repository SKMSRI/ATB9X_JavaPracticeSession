package Oct_24.ex_22Oct_Whileloops;

import java.util.Scanner;

//Print all natural numbers from 1 to n using while loop in Java
public class lab_22OCt_naturalnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = in.nextInt();
        int i = 1;
        System.out.println("Natural number till "+n+ " are :");
        while (i<=n){
            System.out.println(i);
            i++;
        }
        in.close();
    }
}
