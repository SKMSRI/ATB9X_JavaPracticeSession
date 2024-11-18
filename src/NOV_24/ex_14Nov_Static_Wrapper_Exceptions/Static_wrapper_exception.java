package NOV_24.ex_14Nov_Static_Wrapper_Exceptions;

public class Static_wrapper_exception {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(33);

        System.out.println(Student.school_name);
        Student.school_name = "XYZ";
        System.out.println(Student.school_name);
        System.out.println(s1.school_name);
        System.out.println(s2.school_name);


    }

}

class Student {
    static String school_name = "ABC"; // Static Variable

    static {
        System.out.println("SIB");
        System.out.println("Loaded Once, When Class is Loaded.");
        System.out.println("Read the excel file");
    }

    int age; // Non static variable // Instance Variable

    {
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want to do when Object is created");
        System.out.println("Read a MySQL db()");
    }

    public Student(int age) {
        this.age = age;
    }


}


