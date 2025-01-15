package lr4;

public class Example7{
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] array = new int[rows][cols];
        int value = 1;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int  right = cols - 1;

        while (value <= rows * cols) {
            for (int i = left; i <= right && value <= rows * cols; i++) {
                array[top][i] = value++;
            }
            top++;
            for (int i = top; i <= bottom && value <= rows * cols; i++) {
                array[i][right] = value++;
            }
            right--;
            for (int i = right; i >= left && value <= rows * cols; i--) {
                array[bottom][i] = value++;
            }
            bottom--;
            for (int i = bottom; i >= top && value <= rows * cols; i--) {
                array[i][left] = value++;
            }
            left++;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }
}

