package MatrixExercises;

public class MatrixMirrored {

  public static void main(String[] args) {

    int [][] inputMatrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    int [][] finalMatrix = matrixMirroring(inputMatrix);

    for (int[] x : finalMatrix) {
      for (int y : x) {
        System.out.print(y + " ");  //itt nem pirntln csak print!

      }
      System.out.println();
    }

  }

  public static int [][] matrixMirroring (int [][] inputMatrix) {

    int [][]resultMatrix = new int [inputMatrix.length][inputMatrix.length];

    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix.length; j++) {
        resultMatrix[i][j] = inputMatrix[j][i];
      }
    }

    return resultMatrix;
  }


}
