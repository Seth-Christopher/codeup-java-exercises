package shapes;

import java.util.Scanner;
import shapes.Circle;
public class CircleApp {



   public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
           System.out.println("Enter a radius: ");
           double userRadius = scanner.nextDouble();

           Circle usersCircle = new Circle(userRadius);


       System.out.printf("With the given radius,%nArea = %.2f%nCircumference = %.2f.",usersCircle.getArea(), usersCircle.getCircumference());


   }
}
