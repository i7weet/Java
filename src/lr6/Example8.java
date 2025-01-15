package lr6;

public class Example8 {

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        System.out.println("Average: " + Example8.CalculateAverage(array));
    }

    public static double CalculateAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }
}
