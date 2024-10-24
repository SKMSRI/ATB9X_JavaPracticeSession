package Oct_24.ex_18Oct_switchstmnt;

import java.util.Scanner;

public class lab_18Oct_vote_swtchstmnt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age =0;
        System.out.println("Enter your age");
        int A = in.nextInt();
        int res = age >= 18?1:0;
        switch (age) {
            case 1:
                System.out.println("you are eligable for vote");
                break;
            case 2:
                System.out.println("Not eligable for vote");
                break;
            default:
                System.out.println("No age Out of range");
        }
    }
}
