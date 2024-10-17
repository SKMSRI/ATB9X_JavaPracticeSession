package Oct_24;
//Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
public class lab_16Oct_02 {

    public static void main(String[] args) {
        // int age = Integer.parseInt(args[0]);
        //System.out.println(age>25 ? "Allowed for Goa" :"Not allowed");
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int max = x > y ? x : y ;
        System.out.println(max);
    }
}
