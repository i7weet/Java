package lr3;

import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        Random random = new Random();
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("\nMinimum value: " + minValue);
        System.out.println("Index of minimum value: " + minIndex);
    }
}

