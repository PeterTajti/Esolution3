package MatrixExercises;

public class MatrixRotate180degree {

  public static void main(String[] args) {

    int[][] inputMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    int[][] finalMatrix = rotateMatrixBy180(inputMatrix);

    for (int[] x : finalMatrix) {
      for (int y : x) {
        System.out.print(y + " ");  //itt nem pirntln csak print!

      }
      System.out.println();
    }

  }

  public static int[][] rotateMatrixBy180(int[][] inputMatrix) {

    int L = 3;

    int[][] newMatrix = new int[L][L];

    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix.length; j++) {
        newMatrix[i][j] = inputMatrix[L-1-i][L-1-j];
      }
    }

    return newMatrix;
  }

}
