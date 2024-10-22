package Oct_24.ex_18Oct_switchstmnt;

import java.util.Scanner;

public class lab_18_Oct_practice_swtchstmnt_gender {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the M/F or Other");
        String num= in.next();
        in.close();
        switch (num){
            case "M":
                System.out.println("Male");
                break;
            case "F":
                System.out.println("Female");
                break;
            default:
                System.out.println("No gender specified");
        }
    }
}
