package lr3;

public class Example8 {
    public static void main(String[] args) {
        char[] consonants = new char[10];
        char currentChar = 'B';
        int index = 0;
        while (index < consonants.length) {
            if (currentChar != 'A' && currentChar != 'E' && currentChar != 'I' && currentChar != 'O' && currentChar != 'U') {
                consonants[index] = currentChar;
                index++;
            }
            currentChar++;
        }
        System.out.println("array:");
        for (char c : consonants) {
            System.out.print(c + " ");
        }
    }
}
