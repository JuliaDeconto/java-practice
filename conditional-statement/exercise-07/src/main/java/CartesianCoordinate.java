import java.util.Locale;
import java.util.Scanner;

public class CartesianCoordinate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double y;
        double x;

        System.out.println("Enter the value of x: ");
        x = sc.nextDouble();
        System.out.println("Enter the value of y: ");
        y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        sc.close();
    }
}
