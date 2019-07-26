package SymmetricMatrix;

public class Symmetric2 {

  public static void main(String[] args) {

    int [][] matrix = {
            {1,0,1},
            {0,2,2},
            {1,2,5}};

    if (isItNxNMatrix(matrix)) {
      System.out.println(isSymmetric(matrix));
    }



  }

  public static boolean isSymmetric (int [][] matrix) {
    boolean isItSymmetric = true;

    for (int i = 0; i < matrix.length; i++) {
      if (matrix.length != matrix[i].length) {
        System.out.println("This is not n x n matrix.");
        isItSymmetric = false;
      }
    }


    for (int i = 0; i < matrix.length ; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i][j] != matrix[j][i]) {
          isItSymmetric = false;
          //break
        }
      }
    }

    return isItSymmetric;
  }


  public static boolean isItNxNMatrix (int[][]matrix){
    boolean isItGood = true;

    for (int i = 0; i < matrix.length; i++) {
      if (matrix.length != matrix[i].length){
        System.out.println("This isnt n x n matrix.");
        isItGood = false;
      }
    }
    return isItGood;
  }

}

