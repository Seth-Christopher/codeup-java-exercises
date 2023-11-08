package shapes;

public class Square extends Rectangle {
   private double side;

   // created a single side constructor
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        System.out.println("getArea called in square");
        return side * side;
    }

    @Override
    public double getPerimeter() {
        System.out.println("getPerimeter called in square");
        return side * 4;
    }
}
