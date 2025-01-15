package lr3;

import java.util.Arrays;
import java.util.Random;

public class Example10 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // 0 - 99
        }
        System.out.println("array:");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("sort:");
        System.out.println(Arrays.toString(numbers));
    }
}
