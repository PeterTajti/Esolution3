package MatrixExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersBetweenTwoNumbers {

  public static void main(String[] args) {

    int[][] matrix1 = {
            {2, 3, 4, 10},
            {4, 5, 9, 15},
            {3, 6, 8, 12}
    };

    searchNumbersBetweenMinAndMax(matrix1, 4, 12);

  }

  public static List searchNumbersBetweenMinAndMax(int[][] inputMatrix, int min, int max) {
    List<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix[i].length; j++) {
        if (inputMatrix[i][j] >= min && inputMatrix[i][j] <= max) {
          numbers.add(inputMatrix[i][j]);
        }
      }
    }

    Collections.sort(numbers);
    System.out.println(numbers);
    return numbers;
  }

}
