package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input num: ");
        int number = scanner.nextInt();
        int num1 = number - 1;
        int num2 = number;
        int num3 = number + 1;
        int num4 = (int) Math.pow(num1 + num2 + num3, 2);
        System.out.println("Nums: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);
        scanner.close();
    }
}
