import java.util.Scanner;

public class GameDuration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int startTime;
        int finalTime;
        int duration;

        System.out.println("Enter the game start time: ");
        startTime = sc.nextInt();
        System.out.println("Enter the game end time: ");
        finalTime = sc.nextInt();

        if (startTime < finalTime) {
            duration = finalTime - startTime;
        }
        else {
            duration = 24 - startTime + finalTime;
        }

        System.out.println("THE GAME LASTED " + duration + " HOUR(S)");
    }
}
