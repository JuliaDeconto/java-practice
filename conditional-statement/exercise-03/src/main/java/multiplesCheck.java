import java.util.Scanner;

public class multiplesCheck {
    void main() {

        Scanner sc = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Enter two integers: ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();

        if (number1 % number2 == 0 || number2 % number1 == 0) {
            System.out.println("They are multiples.");
        }
        else {
            System.out.println("They are not multiples.");
        }

        sc.close();
    }
}
