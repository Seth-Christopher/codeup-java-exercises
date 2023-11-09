package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;
    protected int width;

    // constructor that accepts two numbers for the length and width
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // getters methods for the length and width
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // abstract setters methods for length and width
    public abstract void setLength(int length);

    public abstract void setWidth(int width);

}
