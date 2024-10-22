package Oct_24.ex_21Oct_Forloops;
//Java program to print all even numbers between 1 to 100 using for loop.
public class lab_21Oct_printevennumber {
    public static void main(String[] args) {
        for (int i =1; i<100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
