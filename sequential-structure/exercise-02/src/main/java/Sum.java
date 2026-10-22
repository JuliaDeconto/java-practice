import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, result;

        a = sc.nextInt();
        b = sc.nextInt();

        result = a + b;

        System.out.println("SUM = " + result);

        sc.close();
    }
}
