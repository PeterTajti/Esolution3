package FinalExamMiniExercises;

import java.util.Arrays;

public class SumOfMatrixRows {
  public static void main(String[] args) {

    int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    sumMatrixRows(matrix1);
  }

  public static int[] sumMatrixRows(int[][] inputMatrix) {
    int[] sumOfRows = new int[inputMatrix.length];


    for (int i = 0; i < inputMatrix.length; i++) {
      int sum = 0;
      for (int j = 0; j < inputMatrix[i].length; j++) {
        sum = sum + inputMatrix[i][j];
        sumOfRows[i] = sum;
      }

    }

//    for (int x:sumOfRows
//         ) {
//      System.out.print(x + " ");
//    }

    System.out.println(Arrays.toString(sumOfRows));
    return sumOfRows;
  }

}
