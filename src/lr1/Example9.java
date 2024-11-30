package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month name: ");
        String month = scanner.nextLine();
        System.out.print("Enter the number of days in this month: ");
        int days = scanner.nextInt();
        System.out.println("Month " + month + " contains " + days + " days.");
        scanner.close();
    }
}
