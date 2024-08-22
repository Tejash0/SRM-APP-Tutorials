import java.util.Random;

public class Two {
    private double[] cart;
    private int size;

    public Two(int capacity) {
        cart = new double[capacity];
        size = 0;
    }

    public void addProduct() {
        if (size < cart.length) {
            Random rand = new Random();
            double price = rand.nextDouble() * 100;
            cart[size] = price;
            size++;
            System.out.println("Added product with price: " + price);
        } else {
            System.out.println("Cart is full");
        }
    }

    public void removeProduct() {
        if (size > 0) {
            Random rand = new Random();
            int index = rand.nextInt(size);
            cart[index] = 0;
            System.out.println("Removed product");
        } else {
            System.out.println("Cart is empty");
        }
    }

    public void calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += cart[i];
        }
        System.out.println("Total price: " + total);
    }

    public void findMostExpensive() {
        if (size > 0) {
            double max = cart[0];
            for (int i = 1; i < size; i++) {
                if (cart[i] > max) {
                    max = cart[i];
                }
            }
            System.out.println("Most expensive item: " + max);
        } else {
            System.out.println("Cart is empty");
        }
    }

    public void findLeastExpensive() {
        if (size > 0) {
            double min = cart[0];
            for (int i = 1; i < size; i++) {
                if (cart[i] < min) {
                    min = cart[i];
                }
            }
            System.out.println("Least expensive item: " + min);
        } else {
            System.out.println("Cart is empty");
        }
    }

    public static void main(String[] args) {
        Two cart = new Two(10);
        cart.addProduct();
        cart.addProduct();
        cart.addProduct();
        cart.addProduct();
        cart.removeProduct();
        cart.calculateTotalPrice();
        cart.findMostExpensive();
        cart.findLeastExpensive();
    }
}