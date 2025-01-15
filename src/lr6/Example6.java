package lr6;

public class Example6 {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] subArray = Example6.CreateSubArray(array, 3);
        for (int value : subArray) {
            System.out.print(value + " ");
        }
    }

    public static int[] CreateSubArray(int[] array, int count) {
        if (count > array.length) {
            return array.clone();
        }
        int[] result = new int[count];
        System.arraycopy(array, 0, result, 0, count);
        return result;
    }
}
