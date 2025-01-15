package lr4;

public class Example4 {
    public static void main(String[] args) {
        int height = 5;
        char[][] triangle = new char[height][];
        for (int i = 0; i < height; i++) {
            triangle[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '*';
            }
        }
        for (char[] row : triangle) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
