package shapes;

public class Rectangle {
    protected double length;
    protected double width;


    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // do not need parameters, because it will take the length and width variables
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * length + 2 * width;
    }
}
