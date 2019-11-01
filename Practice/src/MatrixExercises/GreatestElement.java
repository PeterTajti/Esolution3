package MatrixExercises;

public class GreatestElement {
  public static void main(String[] args) {
    int[][] matrix = {
            {1, 2, 3},
            {1, 5, 1},
            {3, 2, 1},
    };
    findTheGreatest(matrix);

  }

  public static int findTheGreatest(int[][] matrix) {
    int greatestNumber = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] > greatestNumber) {

          greatestNumber = matrix[i][j];
        }
      }
    }
    System.out.println(greatestNumber);
    return greatestNumber;
  }
}
