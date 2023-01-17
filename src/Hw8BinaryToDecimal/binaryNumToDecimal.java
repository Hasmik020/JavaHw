package Hw8BinaryToDecimal;
// պատկերացրեք ունեք 0-ներից ու 1-երից բաղկացած զանգված, ասենք սենց - {1,1,0,1, 1, 1, 1, 0, 1, 0, 1, 1, 1}
//Պետքա սա վերածեք 10-ական համակրգի թվի։ Այսինքն array-ի ամեն մի թիվը դիտարկեք որպես 10-ական թվի թվանշան։
public class binaryNumToDecimal {
    public static void main(String[] args) {
        int[] binary = {1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1};
        int decimalNum = 0;
        int base = 1;
        for (int index : binary) {
            System.out.print(index);
        }
        for ( int i = binary.length - 1; i >= 0; i--) {
            decimalNum = binary[i] * base + decimalNum;
            base = 2 * base;
        }
        System.out.println(" - decimal number of the given array is : " + decimalNum);
    }
}