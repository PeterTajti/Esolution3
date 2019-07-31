package MatrixRotate;

import java.util.Arrays;

public class MatrixRotate {

  public static void main(String[] args) {

    int[][] inputMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};

    rotateMatrix(inputMatrix);

    for (int[] x : inputMatrix) {
      for (int y : x) {
        System.out.print(y + " ");
      }
      System.out.println();
    }
  }

  static int N = 3;

  public static void rotateMatrix(int[][] matrix) {

   // Traverse each cycle
    for (int i = 0; i < N / 2; i++) {
      for (int j = i; j < N - i - 1; j++) {
        // Swap elements of each cycle
        // in clockwise direction
        int temp = matrix[i][j];
        matrix[i][j] = matrix[N - 1 - j][i];
        matrix[N - 1 - j][i] = matrix[N - 1 - i][N - 1 - j];
        matrix[N - 1 - i][N - 1 - j] = matrix[j][N - 1 - i];
        matrix[j][N - 1 - i] = temp;
      }
    }
  }
}


