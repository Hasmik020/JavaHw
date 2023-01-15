package Hw7Arrays;

public class TheLongestArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 22},
                {27, 28, 29},
                {0, 22, 222, 2222},
                {2, 22, 222, 2222, 22222, 222222},
        };
        int[] longestArray = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > longestArray.length) {
                longestArray = arr[i];
            }
        }
        System.out.print("The Longest Array is - ");
        for (int j = 0; j < longestArray.length; j++) {
            System.out.print(longestArray[j] + " ");
        }
    }
}
//Հայտարարել երկչափ զանգված, ինիթ անել տարբեր երկարությամբ զանգվածներով։
// Ծրագիրը պետքա հայտնաբերի ու տպի մեջների ամենաերկար զանգվածը