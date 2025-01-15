package lr6;

public class Example3 {

    public static void main(String[] args) {
        int[] values = { 10, 20, 30, 5, 15 };
        System.out.println("Max: " + Example3.FindMax(values));
        System.out.println("Min: " + Example3.FindMin(values));
        System.out.println("Average: " + Example3.FindAverage(values));
    }

    public static int FindMax(int[] values) {
        int max = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int FindMin(int[] values) {
        int min = Integer.MAX_VALUE;
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static double FindAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}
