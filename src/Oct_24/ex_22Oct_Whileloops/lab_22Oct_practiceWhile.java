package Oct_24.ex_22Oct_Whileloops;

import java.util.Scanner;

public class lab_22Oct_practiceWhile {
    public static void main(String[] args) {
        {
            int no, flag = 0, a, b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any no: ");
            no = sc.nextInt();
            a = 1;
            while (a <= no) {
                flag = 0;
                b = 2;
                while (b <= a >> 1) {
                    if (a % b == 0) {
                        flag = 1;
                        break;
                    }
                    b++;
                }
                if (flag == 0) {
                    System.out.println("Prime number" + a);
                } else {
                    System.out.println("Not Prime number" + a);
                }
                a++;
            }
        }
    }


}

