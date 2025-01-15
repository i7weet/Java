package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of numbers to sum: ");
        int count = scanner.nextInt();
        int sum = 0;
        int number = 1;
        int found = 0;
        System.out.print("Numbers being summed: ");
        while (found < count) {
            if (number % 5 == 2 || number % 3 == 1) {
                System.out.print(number + " ");
                sum += number;
                found++;
            }
            number++;
        }
        System.out.println("\nSum of numbers: " + sum);
    }
}
