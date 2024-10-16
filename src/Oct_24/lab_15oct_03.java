package Oct_24;
//Finding the Largest of Three Numbers a,b,c using the Ternary Operator.
public class lab_15oct_03 {

    public static void main(String[] args) {
        int a=10;
        int b =35;
        int c= 55;

        // Using ternary operator to find the largest number
        int largest = (a >= b && a >= c) ? a : (b >= c ? b : c);

        System.out.println("The largest number is: " + largest);

    }
}
