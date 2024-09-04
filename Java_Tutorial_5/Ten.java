import java.util.Scanner;

public class Ten {
    public static int countUnique(int[] arr) {
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }
        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] arr;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scn.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int uniqueCount = countUnique(arr);
        System.out.println("Number of unique values: " + uniqueCount);
        scn.close();
    }
}