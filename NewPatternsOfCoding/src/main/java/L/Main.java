package L;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=getRect();
        rectangle.setHeight(10);
        rectangle.setWidth(5);

        System.out.println(rectangle.getSquare());
    }

    static Rectangle getRect() {
        return new Rectangle();
    }
}
