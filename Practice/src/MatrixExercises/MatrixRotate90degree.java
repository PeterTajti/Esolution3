package MatrixExercises;

public class MatrixRotate90degree {

  public static void main(String[] args) {

    int[][] inputMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    int[][] finalMatrix = rotateMatrixBy90(inputMatrix);

    for (int[] x : finalMatrix) {
      for (int y : x) {
        System.out.print(y + " ");  //itt nem pirntln csak print!

      }
      System.out.println();
    }

  }

  public static int[][] rotateMatrixBy90(int[][] inputMatrix) {

    //L is the size of the matrix
    int L = 3;

    int[][] newMatrix = new int[L][L];

    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix.length; j++) {
        newMatrix[i][j] = inputMatrix[L - 1 - j][i];
      }
    }

    return newMatrix;

  }

}
