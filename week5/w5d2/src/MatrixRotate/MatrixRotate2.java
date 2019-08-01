//{
//// j = 0  1  2
//      {1, 2, 3}, // i = 0
//      {4, 5, 6}, // i = 1
//      {7, 8, 9}  // i = 2
//}
//​
//​
//{
//// j = 0  1  2
//      {7, 4, 1}, // i = 0
//      {8, 5, 2}, // i = 1
//      {9, 6, 3}  // i = 2
//}
//​
//l = matrix.length = 3
//i j --> j l - 1 - i
//0 0     0 2
//0 1     1 2
//0 2     2 2
//​
//1 0     0 1
//1 1     1 1
//1 2     2 1
//​
//2 0     0 0
//2 1     1 0
//2 2     2 0
//​
// Innen majd a függvény ami ilyesmivel kezdődik

//newMatrix[j][l - 1 - i] = matrix[i][j];

package MatrixRotate;

import java.util.ArrayList;

public class MatrixRotate2 {

  public static void main(String[] args) {

    int[][] inputMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};

    int [][] finalMatrix = rotateMatrix(inputMatrix);

    // print out matrix

    for (int[] x : finalMatrix) {
      for (int y : x) {
        System.out.print(y + " ");
      }
      System.out.println();
    }

  }

  public static int [][] rotateMatrix(int[][] matrix) {

    int L = 3; // ez a mátrix mérete/hossza/lenght

    int [][] newMatrix = new int [L][L];


    for (int i = 0; i < matrix.length ; i++) {
      for (int j = 0; j < matrix.length; j++) {
        newMatrix [i][j] = matrix [L-1-j][i];
      }
    }
    return newMatrix;
  }


}


