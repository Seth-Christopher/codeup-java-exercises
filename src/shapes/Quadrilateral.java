package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public abstract void setLength(double length);

    public abstract void setWidth(double width);

    // constructor that accepts two numbers for the length and width
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // getters methods for the length and width
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // abstract setters methods for length and width

}
