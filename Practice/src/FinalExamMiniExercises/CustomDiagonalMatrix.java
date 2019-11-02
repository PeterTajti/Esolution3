package FinalExamMiniExercises;

public class CustomDiagonalMatrix {
  public static void main(String[] args) {

    int myNumber = 5;

    buildMatrix(myNumber);

  }

  public static int[][] buildMatrix(int inputNumber) {

    int[][] newmatrix = new int[inputNumber][inputNumber];

    for (int i = 0; i < inputNumber; i++) {
      for (int j = 0; j < inputNumber; j++) {
        newmatrix[i][j] = 0;
        if (i == j) {
          newmatrix[i][j] = 1;
        }
      }
    }

    for (int[] x : newmatrix) {
      for (int y : x) {
        System.out.print(y + " ");
      }
      System.out.println();
    }

    return newmatrix;
  }

}
