package Matrix;

public class AddingAroundCoordinate {
  public static void main(String[] args) {
    int[][] myMatrix = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1},
    };

    int[] coordinate = {1, 1};

    addingNumbers(myMatrix,coordinate);
  }

  public static int addingNumbers(int[][] myMatrix, int[] coordinate) {

    int sum = 0;

    if (coordinate != null) {
      for (int i = 0; i < myMatrix.length; i++) {
        for (int j = 0; j < myMatrix[i].length; j++) {
          if (coordinate[0] + 1 == i && coordinate[1] == j ||
                  coordinate[0] == i && coordinate[1] + 1 == j ||
                  coordinate[0] + 1 == i && coordinate[1] + 1 == j ||
                  coordinate[0] == i && coordinate[1] - 1 == j ||
                  coordinate[0] - 1 == i && coordinate[1] + 1 == j ||
                  coordinate[0] - 1 == i && coordinate[1] - 1 == j ||
                  coordinate[0] - 1 == i && coordinate[1] == j ||
                  coordinate[0] + 1 == i && coordinate[1] - 1 == j) {
            sum += myMatrix[i][j];
          }
        }
      }


    }
    System.out.println(sum);
    return sum;
  }
}
