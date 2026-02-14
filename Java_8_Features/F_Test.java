package Java8Features;

// Functional Interface
@FunctionalInterface
interface Add1 {
    int sum(int a, int b);   // Only one abstract method inside functional interface
}

public class F_Test {

    public static void main(String[] args) {

                                        // Lambda Expression Implementation
        Add obj = (a, b) -> a + b;

                                        // Calling the method
        int result = obj.sum(10, 20);

        System.out.println("Sum = " + result);
    }
}
