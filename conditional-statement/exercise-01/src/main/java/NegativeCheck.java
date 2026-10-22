import java.util.Scanner;

public class NegativeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("enter an integer: ");
        number = sc.nextInt();

        if (number < 0) {
            System.out.println("NEGATIVE");
        }
        else {
            System.out.println("NON-NEGATIVE");
        }

        sc.close();
    }
}
