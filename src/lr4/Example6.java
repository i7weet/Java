package lr4;

import java.util.Arrays;
import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] array = new int[rows][cols];
        Random random = new Random();
        System.out.println("array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int rowToRemove = random.nextInt(rows);
        int colToRemove = random.nextInt(cols);
        System.out.println("\ndel row: " + rowToRemove + ", del col: " + colToRemove);
        int[][] newArray = new int[rows - 1][cols - 1];
        int newRow = 0;
        for (int i = 0; i < rows; i++) {
            if (i == rowToRemove) continue;
            int newCol = 0;
            for (int j = 0; j < cols; j++) {
                if (j == colToRemove) continue;
                newArray[newRow][newCol] = array[i][j];
                newCol++;
            }
            newRow++;
        }
        System.out.println("\nnew array:");
        for (int[] row : newArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}

