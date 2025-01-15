package lr5;

public class Example5 {
    private int _value;

    public Example5() {
        this._value = 0;
    }

    public Example5(int value) {
        if (value > 100) {
            this._value = 100;
        } else {
            this._value = value;
        }
    }

    public static void main(String[] args) {
        Example5 obj1 = new Example5();
        System.out.println("Initial value: " + obj1.GetValue());

        obj1.SetValue(150);
        System.out.println("Value after setting 150: " + obj1.GetValue());

        obj1.SetValue();
        System.out.println("Value after setting to default: " + obj1.GetValue());

        Example5 obj2 = new Example5(75);
        System.out.println("Value initialized with 75: " + obj2.GetValue());
    }

    public void SetValue() {
        this._value = 0;
    }

    public void SetValue(int _value) {
        if (_value > 100) {
            this._value = 100;
        } else {
            this._value = _value;
        }
    }

    public int GetValue() {
        return this._value;
    }
}

