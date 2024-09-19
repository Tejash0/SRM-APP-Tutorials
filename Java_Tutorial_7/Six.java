class Calculator {
    public double calculate(double a, double b) {
        return a + b;
    }
}

class SubtractionCalculator extends Calculator {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

class MultiplicationCalculator extends Calculator {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}

class DivisionCalculator extends Calculator {
    @Override
    public double calculate(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
    }
}

// Main class to test the code
public class Six {
    public static void main(String[] args) {
        Calculator additionCalculator = new Calculator();
        System.out.println("Addition: " + additionCalculator.calculate(5.5, 3.3));

        Calculator subtractionCalculator = new SubtractionCalculator();
        System.out.println("Subtraction: " + subtractionCalculator.calculate(7.7, 2.2));

        Calculator multiplicationCalculator = new MultiplicationCalculator();
        System.out.println("Multiplication: " + multiplicationCalculator.calculate(2.5, 4.2));

        Calculator divisionCalculator = new DivisionCalculator();
        System.out.println("Division: " + divisionCalculator.calculate(10.0, 2.0));
    }
}