
import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        try {

            Triangle t = new Triangle(a, b, c);
            System.out.println("Area of the triangle = " + t.getArea());
            System.out.println("Perimeter of the triangle : " + t.getPerimeter());
        } catch (IllegalTriangleException ex) {
            System.out.println();
        }
    }

}
