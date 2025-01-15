package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String inputText = scanner.nextLine();
        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine();
        String encryptedText = Encrypt.getEncryptString(inputText, key);
        System.out.println("Текст после преобразования: " + encryptedText);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String response = scanner.nextLine().trim().toLowerCase();

        while (!response.equals("y") && !response.equals("n")) {
            System.out.println("Введите корректный ответ (y/n):");
            response = scanner.nextLine().trim().toLowerCase();
        }

        if (response.equals("y")) {
            String decryptedText = Encrypt.getEncryptString(encryptedText, -key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else {
            System.out.println("До свидания!");
        }

        scanner.close();
    }
}

class Encrypt {
    public static String getEncryptString(String encryptString, int shift) {
        // преобразуем переданную в метод строку в символный массив
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];

        // создаем символный массив в который будем записывать преобразованные символы
        char[] arrayCharNew = new char[arrayChar.length];

        // в цикле перебираем все символы из которых состоит переданная нами строка, прибавляем к ним число, ключ (сдвиг)
        for (int i = 0; i < arrayChar.length; i++) {
            // прибавляем к символу с индексом i сдвиг
            arrayInt[i] = arrayChar[i] + shift;

            // преобразовываем число в символ char и записываем на нужное место в новый массив
            arrayCharNew[i] = (char) arrayInt[i];
        }

        // преобразовываем новый массив символов в строку
        encryptString = new String(arrayCharNew);

        return encryptString; // возвращаем строку в метод из которого был вызван текущий метод
    }
}
