import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        int[] numbers = getInputArray();
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);
    }

    public static int[] getInputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}