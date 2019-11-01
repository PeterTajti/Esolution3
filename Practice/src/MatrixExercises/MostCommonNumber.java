package MatrixExercises;

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

  public static int findMostCommon(int[][] inputMatrix) {
    int mostCommonNumber = 1;

    ArrayList<Integer> numbersInArray = new ArrayList<>();
    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix[i].length; j++) {
        numbersInArray.add(inputMatrix[i][j]);
      }
    }

    HashMap<Integer, Integer> numberCounter = new HashMap<>();

    for (int i = 0; i < numbersInArray.size(); i++) {
      if (!numberCounter.containsKey(numbersInArray.get(i))) {
        numberCounter.put(numbersInArray.get(i), 1);
      } else {
        numberCounter.put(numbersInArray.get(i), numberCounter.get(numbersInArray.get(i)) + 1);
      }


    }

    for (int number : numberCounter.keySet()) {
      if (numberCounter.get(number) > numberCounter.get(mostCommonNumber)) {
        mostCommonNumber = number;
      }
    }

//    System.out.println(numbersInArray);
//    System.out.println(numberCounter);

    System.out.println("The most common number in the input matrix is " + mostCommonNumber + " With the occurency of " + numberCounter.get(mostCommonNumber));
    return mostCommonNumber;

  }

}
