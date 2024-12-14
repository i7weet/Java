package lr2;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        long number = scanner.nextLong();
        long thousands = (Math.abs(number) / 1000) % 10;
        System.out.println("thousands: " + thousands);
        scanner.close();
    }
}
