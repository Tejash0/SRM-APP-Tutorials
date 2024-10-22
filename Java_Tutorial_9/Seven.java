import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Seven {

    public static void main(String[] args) {
        // List to square elements
        List<Integer> numbersToSquare = Arrays.asList(1, 2, 3, 4);

        // Anonymous function to square each element in the list
        List<Integer> squaredNumbers = numbersToSquare.stream()
                .map(num -> num * num) // Using a lambda expression to square each element
                .collect(Collectors.toList());

        // Print squared numbers
        System.out.println("Squared numbers: " + squaredNumbers);

        // List to filter even numbers
        List<Integer> numbersToFilter = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Anonymous function to filter even numbers
        List<Integer> evenNumbers = numbersToFilter.stream()
                .filter(num -> num % 2 == 0) // Using a lambda expression to filter even numbers
                .collect(Collectors.toList());

        // Print even numbers
        System.out.println("Even numbers: " + evenNumbers);
    }
}
