package Oct_24.ex_25Oct_Strings;

public class lab_25Oct_reverseString {
    public static void main(String[] args) {
        String name = "ABCD";
        StringBuffer SB = new StringBuffer(name);
        SB.reverse();
        System.out.println(SB);
    }
}
