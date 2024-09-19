import bubblesort.BubbleSort;
import selectionsort.SelectionSort;

public class SortTest {
    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Array before sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Array after sorting: ");
        BubbleSort.sort(array);
        System.out.println(java.util.Arrays.toString(array));

        SelectionSort.sort(array);
        System.out.println(java.util.Arrays.toString(array));
    }
}