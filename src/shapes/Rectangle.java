package shapes;

public class Rectangle extends Quadrilateral {


    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }
//    protected double length;
//    protected double width;
//
//
//    // constructor
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    // do not need parameters, because it will take the length and width variables
//    public double getArea(){
//        return length * width;
//    }
//    public double getPerimeter(){
//        return 2 * length + 2 * width;
//    }
}
