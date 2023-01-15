package Hw7Arrays;
public class GreaterThanPreviousNumber {
    public static void main(String[] args) {
        int[] arr = {2002, 20, 22, 2, 2222, 222};
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                counter++;
            }
        }
        System.out.println("The amount of numbers that are GREATER than the previous one is - " + counter);
    }
}
//Ունեք միաչափ զանգված, մեջը խառը ամբողջ թվեր...
// Ձեր խնդիրնա պարզել, թե քանի թիվ կա էդ զանգվածի մեջ, որը նախորդից մեծա։
// Վերջում տպում եք քանակը։