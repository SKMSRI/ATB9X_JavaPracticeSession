package NOV_24.ex_07_Nov_Inheritance;

public class Class_C extends Class_A {

    public static void main(String[] args) {

        Class_A a = new Class_A();
        a.print_A();
        Class_C c = new Class_C();
        c.cat();
    }

    void cat() {
        System.out.println("C");
    }

}
