import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sizes of matrix:");
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        int max = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter value at position (" + i + ", " + j + ")");
                matrix[i][j] = sc.nextInt();
                if (i == j && j == 0) max = matrix[i][j];
                if (matrix[i][j] > max) max = matrix[i][j];
            }
        }

        System.out.println("2D-Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Max = " + max);
    }
}