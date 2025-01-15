package lr6;

public class Example7 {

    public static void main(String[] args) {
        char[] chars = { 'A', 'B', 'C' };
        int[] codes = Example7.CharToIntArray(chars);
        for (int code : codes) {
            System.out.print(code + " ");
        }
    }

    public static int[] CharToIntArray(char[] chars) {
        int[] codes = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            codes[i] = (int) chars[i];
        }
        return codes;
    }
}
