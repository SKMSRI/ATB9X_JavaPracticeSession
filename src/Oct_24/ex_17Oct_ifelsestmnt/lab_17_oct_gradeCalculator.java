package Oct_24.ex_17Oct_ifelsestmnt;

import java.util.Scanner;

// Write a program that calculates and displays the letter grade
// for a given numerical score (e.g., A, B, C, D, or F)
// based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
public class lab_17_oct_gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Score");
        int Score = sc.nextInt();
        if (Score >= 90 && Score <= 100) {
            System.out.println(" Your Grade is -" + 'A');
        } else if (Score >= 80 && Score <= 89) ;
        {
            System.out.println("Your Grade is -" + 'B');
        }
       // else if (Score >= 70 && Score <= 79){
            //System.out.println("Your Grade is -"+ 'C');
        }
   }

   // }






