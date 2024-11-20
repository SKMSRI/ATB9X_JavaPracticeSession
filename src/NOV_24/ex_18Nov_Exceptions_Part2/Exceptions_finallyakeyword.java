package NOV_24.ex_18Nov_Exceptions_Part2;
/*
public class Exceptions_finallykeyword {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            sc.close();
            System.out.println("closing sc");

        }

    }
