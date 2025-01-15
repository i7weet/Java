package lr6;

public class Example4 {

    public static void main(String[] args) {
        System.out.println("6!! = " + Example4.DoubleFactorial(6));
        System.out.println("5!! = " + Example4.DoubleFactorial(5));
    }

    public static long DoubleFactorial(int n) {
        long result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }
}

