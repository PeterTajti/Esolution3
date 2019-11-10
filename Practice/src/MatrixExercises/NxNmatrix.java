package MatrixExercises;

public class NxNmatrix {

  public static void main(String[] args) {

    int[][] matrix1 = {
            {1, 2, 3},
            {1, 2, 3},
            {1, 2, 3}
    };

    int[][] matrix2 = {
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4}
    };

    isNxNmatrix(matrix1);

  }

  public static boolean isNxNmatrix(int[][] inputMatrix) {

    boolean result = true;

    for (int i = 0; i < inputMatrix.length; i++) {
      if (inputMatrix.length != inputMatrix[i].length) {
        result = false;
        break;
      }
      break;
    }

    System.out.println("this matrix is nxn? ---> " + result);
    return result;

  }


}
