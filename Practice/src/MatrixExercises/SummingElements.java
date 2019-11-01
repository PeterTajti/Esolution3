package MatrixExercises;

public class SummingElements {
  public static void main(String[] args) {

    int[][] matrix1 = {
            {1,2,3},
            {2,4,8},
            {3,6,9}
    };

    summTheMatrixElements(matrix1);

  }

  public static int summTheMatrixElements (int[][]inputMatrix) {
    int result =0;

    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix[i].length; j++) {
        result = result + inputMatrix[i][j];
      }
    }
    System.out.println(result);
    return result;

  }


}
