package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input age: ");
        int age = scanner.nextInt();
        System.out.println("Name: " + name + ", age: " + age);
        scanner.close();
    }
}
