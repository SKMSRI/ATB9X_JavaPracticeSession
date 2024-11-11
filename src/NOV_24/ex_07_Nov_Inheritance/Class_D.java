package NOV_24.ex_07_Nov_Inheritance;

public class Class_D extends Class_A {
    public static void main(String[] args) {

        Class_D L = new Class_D();
        L.print_A();
        L.run();
    }

    void run() {
        System.out.println("D");
    }
}
