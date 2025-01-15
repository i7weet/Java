package lr5;

public class Example6 {
    private int _max;
    private int _min;

    public Example6() {
        this._max = Integer.MIN_VALUE;
        this._min = Integer.MAX_VALUE;
    }

    public Example6(int value) {
        this._max = value;
        this._min = value;
    }

    public Example6(int value1, int value2) {
        this._max = Math.max(value1, value2);
        this._min = Math.min(value1, value2);
    }

    public static void main(String[] args) {
        Example6 obj1 = new Example6();
        obj1.SetValues(10);
        obj1.SetValues(50, 5);
        obj1.PrintValues();

        Example6 obj2 = new Example6(30);
        obj2.SetValues(15);
        obj2.PrintValues();

        Example6 obj3 = new Example6(60, 20);
        obj3.SetValues(40, 70);
        obj3.PrintValues();
    }

    public void SetValues(int value) {
        if (value > _max) {
            _max = value;
        }
        if (value < _min) {
            _min = value;
        }
    }

    public void SetValues(int value1, int value2) {
        this._max = Math.max(_max, Math.max(value1, value2));
        this._min = Math.min(_min, Math.min(value1, value2));
    }

    public void PrintValues() {
        System.out.println("Max: " + _max + ", Min: " + _min);
    }
}

