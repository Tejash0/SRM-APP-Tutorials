
import ar.Addition;
import ar.Subtraction;
import ar.Multiplication;
import ar.Division;

public class Nine {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + addition.add(a, b));
        System.out.println("Subtraction: " + subtraction.subtract(a, b));
        System.out.println("Multiplication: " + multiplication.multiply(a, b));
        System.out.println("Division: " + division.divide(a, b));
    }
}
