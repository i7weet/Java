package lr3;

import java.util.Scanner;

public class Timus1409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество банок, простреленных Гарри и Ларри через пробел: ");
        int G = scanner.nextInt();
        int L = scanner.nextInt();
        int N = G + L - 1;
        int unshot_G = N - G;
        int unshot_L = N - L;
        System.out.println(unshot_G + " " + unshot_L);

        scanner.close();
    }
}