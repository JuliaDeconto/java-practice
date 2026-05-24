import java.util.Scanner;

public class difference {
    void main() {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, dif;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        dif = (a * b - c * d);

        System.out.println("Difference = " + dif);

        sc.close();
    }
}
