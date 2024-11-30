package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the current day of the week: ");
        String dayOfWeek = scanner.nextLine();
        System.out.print("Enter the name of the current month: ");
        String month = scanner.nextLine();
        System.out.print("Enter the day number in the month: ");
        int dayOfMonth = scanner.nextInt();
        System.out.println("Now: " + dayOfWeek + ", " + dayOfMonth + " " + month);
        scanner.close();
    }
}
