package lr6;

public class Example5 {

    public static void main(String[] args) {
        System.out.println("Sum of squares up to 5: " + Example5.SumOfSquares(5));
        System.out.println("Sum of squares up to 10: " + Example5.SumOfSquares(10));
    }

    public static int SumOfSquares(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }
}
