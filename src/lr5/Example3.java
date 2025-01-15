package lr5;

public class Example3 {
    private int _num1;
    private int _num2;

    public static void main(String[] args) {
        Example3 obj1 = new Example3();
        obj1.PrintValues();

        Example3 obj2 = new Example3(10);
        obj2.PrintValues();

        Example3 obj3 = new Example3(10, 20);
        obj3.PrintValues();
    }

    public Example3() {
        this._num1 = 0;
        this._num2 = 0;
    }

    public Example3(int num) {
        this._num1 = num;
        this._num2 = 0;
    }

    public Example3(int num1, int num2) {
        this._num1 = num1;
        this._num2 = num2;
    }

    public void PrintValues() {
        System.out.println("num1: " + _num1 + ", num2: " + _num2);
    }
}

