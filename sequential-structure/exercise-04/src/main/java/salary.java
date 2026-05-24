import java.util.Locale;
import java.util.Scanner;

public class salary {
    void main() {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int number, hours;
        double hourValue, salary;

        number = sc.nextInt();
        hours = sc.nextInt();
        hourValue = sc.nextDouble();

        salary = hourValue * hours;

        System.out.println("Number = " + number);
        System.out.printf("Salary = U$ %.2f%n", salary);

        sc.close();
    }
}
