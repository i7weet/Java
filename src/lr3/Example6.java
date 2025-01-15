package lr3;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("size:");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("err.");
                return;
            }
            int[] array = new int[size];
            int number = 2;
            for (int i = 0; i < size; i++) {
                array[i] = number;
                number += 5;
            }
            System.out.println("array:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        } catch (Exception e) {
            System.out.println("err.");
        } finally {
            scanner.close();
        }
    }
}
