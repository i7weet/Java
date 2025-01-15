package lr6;

public class Example2 {
    private static int _staticField = 0;

    public static void main(String[] args) {
        Example2.DisplayAndIncrement();
        Example2.DisplayAndIncrement();
        Example2.DisplayAndIncrement();
    }

    public static void DisplayAndIncrement() {
        System.out.println("Current Value: " + _staticField);
        _staticField++;
    }
}

