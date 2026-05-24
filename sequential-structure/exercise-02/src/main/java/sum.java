import java.util.Scanner;

public class sum {
    void main() {

        Scanner sc = new Scanner(System.in);

        int a, b, result;

        a = sc.nextInt();
        b = sc.nextInt();

        result = a + b;

        System.out.println("SUM = " + result);

        sc.close();
    }
}
