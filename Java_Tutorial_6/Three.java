public class Three {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two floats
    public float add(float a, float b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Three three = new Three();
        System.out.println("Addition of 2 and 3: " + three.add(2, 3));
        System.out.println("Addition of 2.5 and 3.7: " + three.add(2.5f, 3.7f));
        System.out.println("Addition of 2, 3, and 4: " + three.add(2, 3, 4));
    }
}