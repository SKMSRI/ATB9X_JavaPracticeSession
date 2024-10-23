package Oct_24.ex_23Oct_Funcations;

import java.util.Scanner;

public class lab_23Oct_Task1_function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a =in.nextInt();

        System.out.println("Enter the value of b");
        int b =in.nextInt();

        System.out.println("Addition:" +add(a,b));
        System.out.println("subtract:"  +subtract(a,b));
        System.out.println("Multiply:" +multiply(a,b));
        System.out.println("Divide:" +Division(a,b));
        in.close();

    }
    //funcation of addition
    public static int add(int a, int b){
        return a+ b;
    }
        public static  int subtract(int a, int b){
        return a-b;
        }
        public static int multiply(int a, int b){
        return a*b;
        }
        public static int Division(int a, int b){
        return a/b;
        }
}
