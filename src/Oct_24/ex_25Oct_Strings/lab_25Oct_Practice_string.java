package Oct_24.ex_25Oct_Strings;

public class lab_25Oct_Practice_string {
    public static void main(String[] args) {

        // String literal
        String s1="First String";
        System.out.println(s1);

        // Using new Keyword
        String s2= new String("Second String");
        System.out.println(s2);

        //lower to upper
        String name="Saurabh";
        name = name.toUpperCase();
        System.out.println(name);

        //Concatination
        String name1 ="SAURABH";
        String name2 ="SRIVASTAVA";
        //System.out.println(name1+ name2);
        System.out.println(name1.concat(name2));

        //Reverse String
        String name3 = "ABCD";
        StringBuffer SB = new StringBuffer(name3);
        SB.reverse();
        System.out.println(SB);
    }
}

