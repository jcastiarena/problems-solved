import java.util.Arrays;

public class RotateMatrix {

  /**
   * This code rotates a matrix 90 degrees.
   * @param matrix
   */
  public static void rotateMatrix(int[][] matrix) {
    int n = matrix.length;

    // Step 1: Transpose the matrix by swapping opposed elements with each other
    // while leaving the diagonal unchanged.
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    // Step 2: Reverse each row
    for (int i = 0; i < n; i++) {
      int start = 0, end = n - 1;
      int temp = matrix[i][start];
      matrix[i][start] = matrix[i][end];
      matrix[i][end] = temp;
      start++;
      end--;
    }
  }

    public static void printMatrix(String message, int[][] matrix) {
      System.out.println(message);
      for (int[] row : matrix) {
        System.out.println(Arrays.toString(row));
      }
      System.out.println();
    }

    public static void main(String[] args) {
      // Define the matrix
      int[][] matrix = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
      };

      // Print the initial matrix
      printMatrix("Initial Matrix:", matrix);

      // Rotate the matrix
      rotateMatrix(matrix);

      // Print the resulting matrix
      printMatrix("Rotated Matrix:", matrix);
    }
}
