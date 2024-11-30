package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input age: ");
        int age = scanner.nextInt();
        int currentYear = Year.now().getValue();
        int birthYear = currentYear - age;
        if (age >= 0) {
            System.out.println("Year: " + birthYear);
        } else {
            System.out.println("Incorrect age entered");
        }
        scanner.close();
    }
}
