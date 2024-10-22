package Oct_24.ex_17Oct_ifelsestmnt;
//Write a program that classifies a triangle based on its side lengths.
//Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.
// side1, side2, side2 → eq, iso, scalene

import java.util.Scanner;

public class lab_17Oct_triangleclassifier {
    public static void main(String[] args) {

         Scanner sc= new Scanner(System.in);
            System.out.println("enter the three sides of triangle");
            int s1= sc.nextInt();
//    System.out.println("enter the 2nd side of triangle");
            int s2= sc.nextInt();
//    System.out.println("enter the 3rd side of triangle");
            int s3=sc.nextInt();
            if(s1<=0 || s2<=0 ||s3<=0)
            {
                System.out.println("Invalid data, please enter the positive sides");
            }
//    equilateral (all sides are equal)
            else if(s1==s2 && s1==s3){
                System.out.println("This is an equilateral triangle");
            } else if (s1==s2 || s1==s3 ||(s2==s3)) {
                System.out.println("This is an isosceles Triangle");
            }
            else{
                System.out.println("scalene Triangle");
            }
            sc.close();
        }
    }
