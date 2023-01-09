package ArrayWatchandDoubles;
import java.util.Scanner;
public class ArrayWatchHw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the minute hand: ");
        int x = scanner.nextInt();
        int[] y = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
        if (x < 1 || x > 12) {
            System.out.println("Invalid input.");
        } else {
            int minutes = y[x];
            System.out.println(minutes);
        }
    }
}