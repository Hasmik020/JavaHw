package Hw6Loops;
public class ThirdArrayGeneration {
    public static void main(String[] args) {
        int[] array1 = {3, 9, 2, 5, 9};
        int[] array2 = {1, 4, 6, 4, 7};
        int[] array3 = new int[array1.length];
        for (int i = 0, l = 0, m = 0; i < array1.length; i++, l++) {
            if (array1[i] % 2 != 0 && array2[l] % 2 != 0) {
                array3[m] = array1[i];
            } else if (array1[i] % 2 == 0 && array2[l] % 2 == 0) {
                array3[m] = array2[l];
            } else
                array3[m] = 0;
            System.out.print(array3[m] + " ");
        }
    }
}