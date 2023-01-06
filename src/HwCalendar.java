import java.util.Scanner;
public class HwCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        int numDaysInMonth;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                numDaysInMonth = 31;
                break;
            case 4, 6, 9, 11:
                numDaysInMonth = 30;
                break;
            case 2:
                numDaysInMonth = 28;
                break;
            default:
                // If the month number is not in normal range (1-12), print an error message and terminate
                System.out.println("Error: Invalid month number");
                return;
        }
        System.out.println("Month number: " + month);
        System.out.println("Number of days: " + numDaysInMonth);
    }
}