package Oct_24.ex_16Oct_Userinputs;
//Take a user input - Name, Age and Salary and print them in the end.
import java.util.Scanner;

public class lab_16Oct_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
         String Name = sc.next();
        System.out.println("Enter your age");
        int age =sc.nextInt();
        System.out.println("Enter your Salary");
        int Sal = sc.nextInt();

        System.out.println("Your Name " + Name);
        System.out.println("Your Age " + age);
        System.out.println("Your Age " + Sal);
    }
}
