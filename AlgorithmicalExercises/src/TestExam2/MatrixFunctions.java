package TestExam2;

public class MatrixFunctions {

  public static int[][] rotateMatrix(int[][] myMatrix) {

    int length = myMatrix.length;

    for (int i = 0; i < myMatrix.length / 2; i++) {
      for (int j = 0; j < myMatrix.length - i - 1; j++) {
        int temp = myMatrix[i][j];
        myMatrix[i][j] = myMatrix[length - 1 - j][i];
        myMatrix[length - 1 - j][i] = myMatrix[length - 1 - i][length - 1 - j];
        myMatrix[length - 1 - i][length - 1 - j] = myMatrix[j][length - 1 - i];
        myMatrix[j][length - 1 - i] = temp;
      }


    }

    return myMatrix;
  }

  public static void printMatrix(int[][] myMatrix) {

    int length = myMatrix.length;

    for (int i = 0; i < length; i++)
    {
      for (int j = 0; j < length; j++)
        System.out.print( myMatrix[i][j] + " ");
      System.out.println();
    }

  }

}
