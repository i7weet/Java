package lr4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Timus1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        if (N == 0) {
            System.out.println(10);
            return;
        }
        if (N == 1) {
            System.out.println(1);
            return;
        }
        List<Integer> digits = new ArrayList<>();
        for (int i = 9; i >= 2; i--) {
            while (N % i == 0) {
                digits.add(i);
                N /= i;
            }
        }
        if (N != 1) {
            System.out.println(-1);
            return;
        }
        Collections.sort(digits);
        StringBuilder result = new StringBuilder();
        for (int digit : digits) {
            result.append(digit);
        }
        System.out.println(result);
    }
}
