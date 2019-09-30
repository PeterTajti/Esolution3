package Matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MostCommonNumber {
  public static void main(String[] args) {
    int[][] matrix = {
            {1, 2, 3},
            {1, 5, 1},
            {3, 2, 1},
    };

    findMostCommon(matrix);
  }

  public static int findMostCommon(int[][] matrix) {
    int mostCommonNumber = 0;
    int maxValue = 0;
    Map<Integer, Integer> numbersAndOccurances = new HashMap<>();
    ArrayList<Integer> numbersInArray = new ArrayList<>();


    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {

        numbersInArray.add(matrix[i][j]);

      }
    }

    for (Integer key : numbersInArray) {

      Integer value = numbersAndOccurances.get(key);
      numbersAndOccurances.put(key, (value == null) ? 1 : value + 1);
    }

    for (Map.Entry<Integer, Integer> theMostCommonNumber : numbersAndOccurances.entrySet()) {

      if (theMostCommonNumber.getValue() > maxValue) {
        maxValue = theMostCommonNumber.getValue();
        mostCommonNumber = theMostCommonNumber.getKey();

      }
    }

    System.out.println(mostCommonNumber);
    return mostCommonNumber;

  }


}
