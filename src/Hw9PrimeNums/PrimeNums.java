package Hw9PrimeNums;

public class PrimeNums {
    public static void main(String[] args) {
        int[] array = {2, 3, 11, 22, 64, 121, 45, 55, 999, 222};
        boolean foundPrime = false; //entadrenq
        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= array[i] / 2; j++) {
                if (array[i] % j == 0) {
                    isPrime = false;//mi hat el entadrenq
                    break;
                }
            }
            if (isPrime && array[i] > 1) {
                System.out.print(array[i] + " ");
                foundPrime = true;
            }
        }
        if (!foundPrime) {
            System.out.println("There is no primitive numbers the array.");
        }
    }
}
//ունեք սովորական, իրա համար ժիզնեննի ամբողջ դրական թվերից բաղկացած array։
//Հիմա այն ինչն է այն ինչը, պետքա գտնեք ու տեղում տպեք array-ի բոլոր պարզ թվերը։
//Եթե ընդհանրապես չի գտնվել պարզ թիվ, վերջում դրա մասին ասող տեքստ տպեք։