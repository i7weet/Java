package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input first num:");
        int num1 = scanner.nextInt();
        System.out.println("input second num:");
        int num2 = scanner.nextInt();
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        System.out.println("\nfor:");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nwhile:");
        int i = start;
        while (i <= end) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n\ndo-while:");
        i = start;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= end);

        scanner.close();
    }
}