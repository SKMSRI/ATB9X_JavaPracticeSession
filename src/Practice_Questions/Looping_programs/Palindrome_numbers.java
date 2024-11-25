package Practice_Questions.Looping_programs;
/*A palindrome is a string or number, which, will read in both forward and backward ways
is the same.
Example: abba, radar,121, 434
*/
import java.util.Scanner;

public class Palindrome_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0, r;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("Not a palindrome");
    }

}

