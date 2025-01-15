package lr3;

public class Example7 {
    public static void main(String[] args) {
        int size = 10;
        char[] array = new char[size];
        char letter = 'a';
        for (int i = 0; i < size; i++) {
            array[i] = letter;
            letter += 2;
        }
        System.out.print("Array in direct order: ");
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.print("\nArray in reverse order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
