public class Main {
    public static void main(String[] args) {
        //.....The first part of Hw....
// The program should print -false
        int x = 10;
        int y = 3;
        System.out.println((double) (x / y) == 1.0 * x / y);
//The program should print -true
        x = 12;
        y = 6;
        System.out.println((double) (x / y) == 1.0 * x / y);
//.....The second part of Hw.....
//The program that calculates the average of numbers
        int a = 9;
        int b = 10;
        int c = 18;
        int d = 11;
        int e = 15;
        int f = 14;
        double Z = ((double) (a + b + c) / 3);
        double Y = ((double) (d + e + f) / 3);
        System.out.println(Z);
        System.out.println(Y);
        System.out.println((int) (Z + Y));
//.........The third part of Hw....
// The Decimal part of number
        double number = 54.125;
        int intPart = (int) number;
        double decimalPart = number - intPart;
        System.out.println(decimalPart);
//or
        double num = 3.565;
        System.out.println( num % 1 );
    }
}
