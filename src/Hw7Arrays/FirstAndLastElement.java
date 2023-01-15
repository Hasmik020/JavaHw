package Hw7Arrays;
public class FirstAndLastElement {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 11, 111},
                {2, 22, 222},
                {3, 33, 333},
                {4, 44, 444}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0) {
                    System.out.print("First element is-" + arr[i][j]);
                }
                if (j == arr[i].length - 1) {
                    System.out.println("---Last element is-" + arr[i][j]);
                }
            }
        }
    }
}
// Հայտարարել երկչափ զանգված, ինիթ անել ու տպել տվյալ երկչափ զանգվածի ամեն անդամ զանգվածի առաջին ու վերջին տարրերը։