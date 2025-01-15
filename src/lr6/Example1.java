package lr6;

public class Example1 {
    private char _charField;
    private String _textField;

    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.SetField('A');
        obj.DisplayFields();

        obj.SetField("Hello");
        obj.DisplayFields();

        obj.SetField(new char[] { 'X' });
        obj.DisplayFields();

        obj.SetField(new char[] { 'T', 'e', 's', 't' });
        obj.DisplayFields();
    }

    public void SetField(char value) {
        this._charField = value;
    }

    public void SetField(String value) {
        this._textField = value;
    }

    public void SetField(char[] values) {
        if (values.length == 1) {
            this._charField = values[0];
        } else {
            this._textField = new String(values);
        }
    }

    public void DisplayFields() {
        System.out.println("Char Field: " + _charField);
        System.out.println("Text Field: " + _textField);
    }

}

