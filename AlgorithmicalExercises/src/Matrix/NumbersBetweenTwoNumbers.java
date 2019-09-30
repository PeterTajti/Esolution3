package Matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersBetweenTwoNumbers {
  public static void main(String[] args) {
    int[][] matrix = {
            {9, 1, 2},
            {6, 5, 4, 8},
            {10, 7, 3},
    };

    int max = 9;
    int min = 3;

    getNumbers(matrix, max, min);
  }

  public static List getNumbers(int[][] matrix, int max, int min) {
    List<Integer> numbersBetweenNumbers = new ArrayList<>();


    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {

        if (matrix[i][j] >= min && matrix[i][j] <= max) {
          numbersBetweenNumbers.add(matrix[i][j]);
        }

      }

    }

    Collections.sort(numbersBetweenNumbers);
    System.out.println(numbersBetweenNumbers);
    return numbersBetweenNumbers;
  }

}
