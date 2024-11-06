package NOV_24.ex_06Nov_constructors;
//Parametrized construcotr
  // Define the Dog class
    public class Dog {
        // Private instance variables
        private String name;
        private String color;

        // Parameterized constructor
        public Dog(String name, String color) {
            // Initialize name with the provided parameter
            this.name = name;
            this.color = color;
        }

        // Main method to test the Dog class
        public static void main(String[] args) {
            // Create a new Dog object using the parameterized constructor
            Dog myDog = new Dog("Bailey", "Black");
            // Print the values of the instance variables
            System.out.println("Dog's Name: " + myDog.name);
            System.out.println("Dog's Color: " + myDog.color);
        }
    }


