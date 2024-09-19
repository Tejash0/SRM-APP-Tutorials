import bubblesort.BubbleSort;
import selectionsort.SelectionSort;

public class Ten {
    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        BubbleSort.sort(array);
        System.out.println(java.util.Arrays.toString(array));

        SelectionSort.sort(array);
        System.out.println(java.util.Arrays.toString(array));
    }
}