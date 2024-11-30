package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");
        int birthYear = scanner.nextInt();
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;
        if (age >= 0) {
            System.out.println("Age: " + age);
        } else {
            System.out.println("Invalid year of birth entered");
        }
        scanner.close();
    }
}
