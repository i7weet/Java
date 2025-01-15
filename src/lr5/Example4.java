package lr5;

public class Example4 {
    private char _character;
    private int _integerValue;

    public Example4(int integerValue, char character) {
        this._integerValue = integerValue;
        this._character = character;
    }

    public Example4(double value) {
        this._character = (char) ((int) value);
        this._integerValue = (int) ((value - (int) value) * 100);
    }

    public static void main(String[] args) {
        Example4 obj1 = new Example4(65, 'A');
        obj1.PrintValues();

        Example4 obj2 = new Example4(65.1267);
        obj2.PrintValues();
    }

    public void PrintValues() {
        System.out.println("Character: " + _character + ", Integer: " + _integerValue);
    }
}

