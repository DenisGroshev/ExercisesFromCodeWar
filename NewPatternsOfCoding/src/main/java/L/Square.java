package L;

public class Square implements Shape{
    int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getSquare() {
        return width*width;
    }
}
