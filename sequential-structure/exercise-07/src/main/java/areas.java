import java.util.Locale;
import java.util.Scanner;

public class areas {
    void main() {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a, b, c, triangle, circle, trapezoid, square, rectangle;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangle = a * c / 2.0;
        circle = 3.14159 * c * c;
        trapezoid = (a + b) / 2.0 * c;
        square = b * b;
        rectangle = a * b;

        System.out.printf("Triangle: %.3f%n", triangle);
        System.out.printf("Circle: %.3f%n", circle);
        System.out.printf("Trapezoid: %.3f%n", trapezoid);
        System.out.printf("Square: %.3f%n", square);
        System.out.printf("Rectangle: %.3f%n", rectangle);

        sc.close();
    }
}
