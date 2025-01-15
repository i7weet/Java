package lr6;

public class Example10 {

    public static void main(String[] args) {
        int[] result = FindMaxAndMin(10, 2, 30, 5, 15);
        System.out.println("Max: " + result[0] + ", Min: " + result[1]);
    }

    public static int[] FindMaxAndMin(int... values) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int value : values) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        return new int[] { max, min };
    }
}

