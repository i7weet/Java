package lr2;

import java.util.Scanner;

public class Timus1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                sum += i;
            }
        }
        else {
            for (int i = 1; i >= N; i--) {
                sum += i;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
