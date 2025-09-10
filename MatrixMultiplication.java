import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for first matrix
        System.out.println("Enter details for Matrix 1:");
        System.out.print("Enter number of rows: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols1 = scanner.nextInt();
        
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        // Input for second matrix
        System.out.println("\nEnter details for Matrix 2:");
        System.out.print("Enter number of rows: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols2 = scanner.nextInt();
        
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        // Check if matrices can be multiplied
        if (cols1 != rows2) {
            System.out.println("\nError: Matrices cannot be multiplied.");
            System.out.println("Number of columns in Matrix 1 (" + cols1 + 
                             ") must match number of rows in Matrix 2 (" + rows2 + ")");
            return;
        }
        
        // Multiply matrices
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        // Display results
        System.out.println("\nMatrix 1:");
        printMatrix(matrix1);
        
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);
        
        System.out.println("\nResult of Matrix Multiplication:");
        printMatrix(result);
    }
    
    // Helper method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}