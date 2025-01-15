package lr4;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String inputText = scanner.nextLine();
        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите пользовательский алфавит:");
        String customAlphabet = scanner.nextLine();
        String encryptedText = EncryptWithCustomAlphabet.getEncryptString(inputText, key, customAlphabet);
        System.out.println("Текст после преобразования: " + encryptedText);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String response = scanner.nextLine().trim().toLowerCase();

        while (!response.equals("y") && !response.equals("n")) {
            System.out.println("Введите корректный ответ (y/n):");
            response = scanner.nextLine().trim().toLowerCase();
        }

        if (response.equals("y")) {
            String decryptedText = EncryptWithCustomAlphabet.getEncryptString(encryptedText, -key, customAlphabet);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else {
            System.out.println("До свидания!");
        }

        scanner.close();
    }
}

class EncryptWithCustomAlphabet {
    public static String getEncryptString(String text, int shift, String alphabet) {
        StringBuilder result = new StringBuilder();
        int alphabetLength = alphabet.length();

        for (char c : text.toCharArray()) {
            int index = alphabet.indexOf(c);
            if (index != -1) {
                int newIndex = (index + shift) % alphabetLength;
                if (newIndex < 0) {
                    newIndex += alphabetLength;
                }
                result.append(alphabet.charAt(newIndex));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
