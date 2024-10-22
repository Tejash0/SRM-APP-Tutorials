import java.util.function.BiFunction;

public class Six {

    public static void main(String[] args) {
        // Anonymous function to add two numbers and immediately call it
        int sum = ((BiFunction<Integer, Integer, Integer>) (a, b) -> a + b).apply(5, 3);
        System.out.println("The sum of 5 and 3 is: " + sum);

        // Anonymous function to multiply two numbers and assign it to a variable
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        // Call the function with the values 4 and 6 and print the result
        int product = multiply.apply(4, 6);
        System.out.println("The product of 4 and 6 is: " + product);
    }
}
