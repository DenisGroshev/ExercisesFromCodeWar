package L;

public class Rectangle implements Shape{
    int width;
    int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getSquare() {
       return width*height;
    }
}
