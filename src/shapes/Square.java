package shapes;

public class Square extends Quadrilateral{
    public Square(int side) {
        super(side, side);
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
//   private double side;
//
//   // created a single side constructor
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        System.out.println("getArea called in square");
//        return side * side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        System.out.println("getPerimeter called in square");
//        return side * 4;
//    }
}
