public class Five {
    // Method to add two integers
    public int calculate(int a, int b) {
        return a + b;
    }

    // Method to multiply two doubles
    public double calculate(double a, double b) {
        return a * b;
    }

    // Method to perform arithmetic operations on two integers based on the operator
    public int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    throw new IllegalArgumentException("Division by zero is not allowed");
                }
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        Five calculator = new Five();

        System.out.println("Addition of two integers: " + calculator.calculate(5, 3));
        System.out.println("Multiplication of two doubles: " + calculator.calculate(2.5, 4.2));
        System.out.println("Subtraction of two integers: " + calculator.calculate(7, 2, '-'));
    }
}