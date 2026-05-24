import java.util.Locale;
import java.util.Scanner;

public class area {
    void main() {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a, b, pi = 3.14159;

        b = sc.nextDouble();

        a = pi * b * b;

        System.out.printf("A= %.4f%n", a);

        sc.close();
    }
}
