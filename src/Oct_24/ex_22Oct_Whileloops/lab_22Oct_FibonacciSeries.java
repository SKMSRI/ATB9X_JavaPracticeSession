package Oct_24.ex_22Oct_Whileloops;

public class lab_22Oct_FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int term = 7;
        int count = 1;
        while (count <= term) {
            System.out.println(a + " ");
            int sum =a+b;
            a=b;
            b=sum;
            count++;

        }
    }
}

//output: 0,1
//1, 2=3
//2, 3=5
//3, 5=8