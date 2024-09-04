public class Seven implements Resizable {
    private int width;
    private int height;

    public Seven(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Seven seven = new Seven(245, 87);
        System.out.println("Initial width: " + seven.getWidth());
        System.out.println("Initial height: " + seven.getHeight());

        seven.resizeWidth(78);
        seven.resizeHeight(77);

        System.out.println("Resized width: " + seven.getWidth());
        System.out.println("Resized height: " + seven.getHeight());
    }
}