package lr1;

import java.util.Scanner;

public class Timus1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] parts = input.split(" ");
        int n = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);
        int result = n * a * b * 2;
        System.out.println(result);
    }
}
