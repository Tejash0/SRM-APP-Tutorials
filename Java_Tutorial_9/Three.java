import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Three {

    // Pure function to find the maximum value in a list of numbers
    public static int findMax(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("The list cannot be null or empty");
        }

        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Impure function to sort a list of numbers in ascending order
    public static void sortList(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            System.out.println("The list is empty or null.");
            return;
        }
        // Sorting the list (modifies the original list, hence impure)
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);
    }

    public static void main(String[] args) {
        // Create a list and populate it with user input
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            numbers.add(scanner.nextInt());
        }

        // Use the pure function to find the maximum value
        int maxValue = findMax(numbers);
        System.out.println("The maximum value in the list is: " + maxValue);

        // Use the impure function to sort the list and print it
        sortList(numbers);
        scanner.close();
    }
}
