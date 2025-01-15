package lr5;

public class Example2 {
    private char _char1;
    private char _char2;

    public Example2(char char1, char char2) {
        this._char1 = char1;
        this._char2 = char2;
    }

    public static void main(String[] args) {
        Example2 obj = new Example2('A', 'D');
        obj.PrintCharsInRange();
    }

    public void PrintCharsInRange() {
        char start = (char) Math.min(_char1, _char2);
        char end = (char) Math.max(_char1, _char2);
        for (char c = start; c <= end; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

