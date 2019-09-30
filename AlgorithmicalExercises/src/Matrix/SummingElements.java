package Matrix;

public class SummingElements {
  public static void main(String[] args) {
    int[][] matrix = {
            {1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1},
    };

    summingElements(matrix);
  }

  public static int summingElements(int[][] matrix) {
    int summedNumbers = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {

        summedNumbers+=matrix[i][j];

      }
    }

    System.out.println(summedNumbers);
    return summedNumbers;
  }
}
