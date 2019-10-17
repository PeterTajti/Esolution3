package MatrixExercises;

public class SymmetricMatrix {

  public static void main(String[] args) {

    int[][] matrix1 = {
            {1, 2, 3},
            {2, 0, 5},
            {3, 5, 9}
    };

    int[][] matrix2 = {
            {1, 2, 3},
            {2, 4, 6},
            {5, 5, 5}
    };

    System.out.println(isSymmetricMatrix(matrix1));
    System.out.println(isSymmetricMatrix(matrix2));

  }

  public static boolean isSymmetricMatrix(int[][] inputMatrix) {

    boolean result = true;

    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix[i].length; j++) {
        if (inputMatrix[i][j] != inputMatrix[j][i]) {
          result = false;
        }
      }
    }
    return result;
  }


}
