// LANG: Java
// AUTHOR: Ctrl-apk
// Variables are taken in clear way to understand in better understanding level.
import java.util.*;

public class BoundarySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int boundarySum = 0;

        for (int j = 0; j < n; j++) {
            boundarySum = boundarySum + matrix[0][j];          // First row
            boundarySum = boundarySum + matrix[n - 1][j];      // Last row
        }

        for (int i = 1; i < n - 1; i++) {
            boundarySum += matrix[i][0];          // First column
            boundarySum += matrix[i][n - 1];      // Last column
        }

        System.out.println("Boundary Sum: " + boundarySum);
        
        scanner.close();
    }
}
