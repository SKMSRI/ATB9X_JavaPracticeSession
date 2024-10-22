package Oct_24.ex_17Oct_ifelsestmnt;

import java.util.Scanner;

public class lab_17Oct_practice_age {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("Enter the age");
        int age = in.nextInt();

        if(age>18){
            System.out.println("Allowed for vote");
        }
        else {
            System.out.println("Not allowed for vote");
        }

    }

}
