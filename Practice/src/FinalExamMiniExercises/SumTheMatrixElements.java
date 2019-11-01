package FinalExamMiniExercises;

public class SumTheMatrixElements {
  public static void main(String[] args) {

    int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 10}
    };

    summElements(matrix1);

  }

  public static int summElements(int[][] inputMatrix) {
    int result = 0;

    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix[i].length; j++) {
        result = result + inputMatrix[i][j];
      }

    }

    System.out.println("The sum of the elemts of the matrix is: " + result);
    return result;
  }

}
