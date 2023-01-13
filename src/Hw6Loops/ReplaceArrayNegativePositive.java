package Hw6Loops;
import java.util.Arrays;
public class ReplaceArrayNegativePositive {
    public static void main(String[] args) {
        int[] array1 = {-2, 20, -22, 222, -2222, -22222};
        int x = 0; //x is the replacement count
        int y = 0; //y is the non-negative replacement count
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                array1[i] = ((array1[i] < 0) ? -array1[i] : array1[i]);
                x++;
            } else {
                y++;
            }
            System.out.print(array1[i] + " ");// for printing the resulting array
        }
        System.out.println();
        System.out.println("Number of Replacements: " + x); //for print the number of changes
        System.out.println("Number of Non-Negative Members: " + y);//for printing the number of non-negative's of the array1
    }
}