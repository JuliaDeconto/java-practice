import java.util.Scanner;

public class numberCheck {
    void main() {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("enter an integer: ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }

        sc.close();
    }
}
