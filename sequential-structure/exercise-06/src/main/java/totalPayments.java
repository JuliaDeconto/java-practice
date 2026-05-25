import java.util.Locale;
import java.util.Scanner;

public class totalPayments {
    void main() {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int code1, code2, numberPieces1, numberPieces2;
        double price1, price2, total;

        code1 = sc.nextInt();
        numberPieces1 = sc.nextInt();
        price1 = sc.nextDouble();

        code2 = sc.nextInt();
        numberPieces2 = sc.nextInt();
        price2 = sc.nextDouble();

        total = numberPieces1 * price1 + numberPieces2 * price2;

        System.out.printf("Amount due: U$ %.2f%n", total);

        sc.close();
    }
}
