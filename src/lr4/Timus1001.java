package lr4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Timus1001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Long> numbers = new ArrayList<>();
        while (scanner.hasNextLong()) {
            numbers.add(scanner.nextLong());
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            double sqrt = Math.sqrt(numbers.get(i));
            System.out.printf("%.4f\n", sqrt);
        }
    }
}
