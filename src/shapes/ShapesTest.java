package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 4);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        Measurable measureSomething = new Square(2);
        System.out.println("New Area: " + measureSomething.getArea());
        System.out.println("New perimeter: " + measureSomething.getPerimeter());

        measureSomething = box1;
        System.out.println("box1 area: " + measureSomething.getArea());
        System.out.println("box1 perimeter: " + measureSomething.getPerimeter());


//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//

    }
}
