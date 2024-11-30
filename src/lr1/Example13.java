package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First num: ");
        double num1 = scanner.nextDouble();
        System.out.print("Second num: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
