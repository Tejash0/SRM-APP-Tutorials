// Sortable.java
public interface Sortable {
    void sort(int[] array);
}

// BubbleSort.java
public class BubbleSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

// SelectionSort.java
public class SelectionSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap array[i] and array[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 1, 9 };

        System.out.println("Original array:");
        printArray(array);

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        System.out.println("Sorted array using Bubble Sort:");
        printArray(array);

        array = new int[] { 5, 2, 8, 1, 9 };
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        System.out.println("Sorted array using Selection Sort:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}