package lr3;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("The number of Fibonacci numbers must be greater than 0.");
            return;
        }
        int a = 1, b = 1;
        System.out.print("Fibonacci sequence: ");
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
