package ArrayWatchandDoubles;
public class ArrayDoubleNums {
    public static void main(String[] args) {
        double[] array1 = {6.5, -5.6, -9.6, -6.9, 2.22};
        double[] array2 = new double[array1.length];
        int x = 0;
        if (array1[0] > 0) {
            array2[x] = array1[0];
            x++;
        }
        if (array1[1] > 0) {
            array2[x] = array1[1];
            x++;
        }
        if (array1[2] > 0) {
            array2[x] = array1[2];
            x++;
        }
        if (array1[3] > 0) {
            array2[x] = array1[3];
            x++;
        }
        if (array1[4] > 0) {
            array2[x] = array1[4];
            x++;
        }
        System.out.print("[" + array2[0] + ",");
        System.out.print(array2[1] + ",");
        System.out.print(array2[2] + ",");
        System.out.print(array2[3] + ",");
        System.out.print(array2[4] + "]");
    }
}