package TestExam1;

public class MatrixFunction {

  public static boolean isSymmetric(int[][] myMatrix) {

    for (int i = 0; i < myMatrix.length; i++) {
      for (int k = 0; k < myMatrix[i].length; k++) {
        if (myMatrix.length != myMatrix[i].length || myMatrix[i][k] != myMatrix[k][i]){

          return false;

        }


      }

    }

    System.out.println("true");
    return true;
  }
}
