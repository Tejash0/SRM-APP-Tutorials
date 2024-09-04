public class Six {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 3, 1, 9, 4, 7, 6 };
        System.out.println("Original Array:");
        printArray(arr);
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("Array sorted using Bubble Sort:");
        printArray(arr);

        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println("Array sorted using Selection Sort:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}