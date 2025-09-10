import java.util.*;

public class _2D_Array {
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
        
        // Check if matrices can be added
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("\nError: Matrices cannot be added. They must have the same dimensions.");
            System.out.println("Matrix 1 is " + rows1 + "x" + cols1 + 
                             ", Matrix 2 is " + rows2 + "x" + cols2);
            return ;
        }
        
        // Add matrices
        int[][] result = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Display results
        System.out.println("\nMatrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nMatrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nResult of Matrix Addition:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}