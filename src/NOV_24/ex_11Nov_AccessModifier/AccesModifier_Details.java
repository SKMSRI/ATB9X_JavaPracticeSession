package NOV_24.ex_11Nov_AccessModifier;

public class AccesModifier_Details {
    public static void main(String[] args) {
        System.out.println("Private, Protected and Public, Default");
        //Access modifiers are keywords that define the visibility or accessibility of classes, methods, and variables.
//The public modifier allows members to be accessible from any other class in any package. This is the least restrictive access level.
//The private modifier restricts access to the class itself.Members declared as private are not accessible from any other class,even subclasses.
//The protected modifier allows access to members within the same package and also to subclasses in different packages.
// Rules
// 1. all variables -instance in class ->private in nature.
// 2. If you want to access them ->getter, setter.
// 3. methods - public in nature.
// 4. If you don 't want to share the methods -> protected.
//
// super keyword in Java is a reference variable that allows
// a sub class (child class to reference the parent class).


//1. Use of super with Variables
//2. Use of super with Methods
//3. Use of super with Constructors
    }
}
