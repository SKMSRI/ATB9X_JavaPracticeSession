package Oct_24.ex_29Oct_Arrays;

import java.util.Scanner;

public class lab_29Oct_usrinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array that you want to create!");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter te number " + (i + 1));
            numbers[i] = sc.nextInt();
        }


        System.out.println(" --- ");
        // Print the numbers entered by the user
        System.out.println("The numbers are:");
//        for (int i = 0; i < numbers.length; i++) {
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }


    }
}
