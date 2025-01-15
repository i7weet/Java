package lr6;

public class Example9 {

    public static void main(String[] args) {
        char[] array = { 'A', 'B', 'C', 'D', 'E' };
        ReverseCharArray(array);
        for (char c : array) {
            System.out.print(c + " ");
        }
    }

    public static void ReverseCharArray(char[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}

