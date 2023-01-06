import java.util.Scanner;
public class HwTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side length of The Triangle, a= ");
        int a = scanner.nextInt();
        System.out.print("Enter the second side length of The Triangle, b= ");
        int b = scanner.nextInt();
        System.out.print("Enter the third side length of The Triangle, c= ");
        int c = scanner.nextInt();
        //Check if it's possible to form a triangle with the given side lengths
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("It's possible to form a triangle with the given side lengths.");
        } else {
            System.out.println("It's not possible to form a triangle with the given side lengths.");
        }
    }
}