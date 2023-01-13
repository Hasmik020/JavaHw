package Hw6Loops;
import java.util.Scanner;
public class SearchingLetterInArray {
    public static void main(String[] args) {
        char[] array1 = {'h', 'a', 's', 'm', 'i', 'k', 'z', 'a', 'd', 'a', 'y', 'a', 'n'};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the letter to search for: ");
        char letter1 = scanner.next().charAt(0);
        int i = 0;
        while (i < array1.length - 1) {
            if (array1[i] == letter1) {
                System.out.println("The letter was found at index:" + i);
                break;
            }
            i++;
        }
        if (array1[i]!=letter1) {
            System.out.println("The letter was not found");
        }
    }
}