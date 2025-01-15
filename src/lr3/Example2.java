package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название дня недели:");
        String day = scanner.nextLine().trim();

        System.out.println("\nВерсия с использованием вложенных условных операторов:");
        if (day.equalsIgnoreCase("Понедельник")) {
            System.out.println("Понедельник - это 1-й день недели.");
        } else if (day.equalsIgnoreCase("Вторник")) {
            System.out.println("Вторник - это 2-й день недели.");
        } else if (day.equalsIgnoreCase("Среда")) {
            System.out.println("Среда - это 3-й день недели.");
        } else if (day.equalsIgnoreCase("Четверг")) {
            System.out.println("Четверг - это 4-й день недели.");
        } else if (day.equalsIgnoreCase("Пятница")) {
            System.out.println("Пятница - это 5-й день недели.");
        } else if (day.equalsIgnoreCase("Суббота")) {
            System.out.println("Суббота - это 6-й день недели.");
        } else if (day.equalsIgnoreCase("Воскресенье")) {
            System.out.println("Воскресенье - это 7-й день недели.");
        } else {
            System.out.println("Такого дня недели нет.");
        }

        System.out.println("\nВерсия с использованием оператора выбора switch:");
        switch (day.toLowerCase()) {
            case "понедельник":
                System.out.println("Понедельник - это 1-й день недели.");
                break;
            case "вторник":
                System.out.println("Вторник - это 2-й день недели.");
                break;
            case "среда":
                System.out.println("Среда - это 3-й день недели.");
                break;
            case "четверг":
                System.out.println("Четверг - это 4-й день недели.");
                break;
            case "пятница":
                System.out.println("Пятница - это 5-й день недели.");
                break;
            case "суббота":
                System.out.println("Суббота - это 6-й день недели.");
                break;
            case "воскресенье":
                System.out.println("Воскресенье - это 7-й день недели.");
                break;
            default:
                System.out.println("Такого дня недели нет.");
        }

        scanner.close();
    }
}
