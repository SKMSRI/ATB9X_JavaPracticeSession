package Oct_24;

import java.util.Scanner;

//Create a simple calculator that performs addition, subtraction, multiplication,
// and division, modus based on user input using switch statements.
//Inputs :   num 1, num 2, +
//Output :  num1+num2 → print information.
public class lab_18Oct_Task1_switchstatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operation");
        String operation = in.next();
        System.out.println("Enter first value");
        int num1 = in.nextInt();
        System.out.println("Enter the Second value ");
        int num2 = in.nextInt();
        int result =0;
        in.close();
        switch (operation){
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "Divide":
                result = num1 / num2;
                break;
            case "Modules":
                result = num1 % num2;
                break;
            default:
                System.out.println("Entered operator is invalid");
        }
        System.out.println("Result is: "+result);

        }
    }

