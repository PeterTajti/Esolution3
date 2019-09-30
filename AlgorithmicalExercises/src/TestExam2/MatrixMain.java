package TestExam2;

public class MatrixMain {

  public static void main(String[] args) {

    int[][] myMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
    };

    MatrixFunctions.rotateMatrix(myMatrix);
    MatrixFunctions.printMatrix(myMatrix);

  }


}
