package lr5;

public class Example1 {
    private char _character;

    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.SetCharacter('A');
        obj.PrintCharacterAndCode();
        System.out.println("Code: " + obj.GetCharCode());
    }

    public void SetCharacter(char c) {
        this._character = c;
    }

    public int GetCharCode() {
        return (int) _character;
    }

    public void PrintCharacterAndCode() {
        System.out.println("Character: " + _character + ", Code: " + (int) _character);
    }
}
