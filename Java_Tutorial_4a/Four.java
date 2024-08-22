import java.util.*;

public class Four {
    public static void main(String[] args) {
        int[] numbers = fillArray(10, 0, 1000);
        int largest = findLargest(numbers);
        System.out.println("The largest number is: " + largest);
    }

    public static int[] fillArray(int size, int min, int max) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(max - min + 1) + min;
        }
        return numbers;
    }

    public static int findLargest(int[] numbers) {
        int largest = numbers[0];
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }
}