import java.util.*;

class One {
    public static void main(String[] args) {
        int[] grades = new int[30];
        Random random = new Random();
        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(101);
        }

        double average = calculateAverage(grades);
        System.out.println("Average grade: " + average);

        int highest = Arrays.stream(grades).max().getAsInt();
        int lowest = Arrays.stream(grades).min().getAsInt();
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        Arrays.sort(grades);
        System.out.println("Top 5 scores:");
        for (int i = grades.length - 1; i >= grades.length - 5; i--) {
            System.out.println(grades[i]);
        }
    }

    private static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}