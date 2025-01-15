package lr3;

import java.util.Scanner;

public class Timus1787 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (args.length > 0) {
            int k = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            int[] cars = new int[n];

            for (int i = 0; i < n; i++) {
                cars[i] = Integer.parseInt(args[i + 2]);
            }
            int jamCount = calculateJamCount(k, n, cars);
            System.out.println(jamCount);
        } else {
            System.out.println("Введите количество машин, которые могут повернуть за минуту и количество минут наблюдения:");
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int[] cars = new int[n];
            System.out.println("Введите количество машин, подъехавших к повороту за каждую минуту:");
            for (int i = 0; i < n; i++) {
                cars[i] = scanner.nextInt();
            }
            int jamCount = calculateJamCount(k, n, cars);
            System.out.println(jamCount);
        }

        scanner.close();
    }

    private static int calculateJamCount(int k, int n, int[] cars) {
        int jamCount = 0;

        for (int i = 0; i < n; i++) {
            jamCount += cars[i];
            jamCount -= k;
            if (jamCount < 0) {
                jamCount = 0;
            }
        }

        return jamCount;
    }
}