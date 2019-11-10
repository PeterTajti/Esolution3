package FinalExamMiniExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NewArrayWithMinimumOfTwoOccurence {
  public static void main(String[] args) {

    int[] myArray = {1, 2, 3, 4, 4, 5, 5, 5};

    giveBackTwiceOccurences(myArray);
  }

  public static int[] giveBackTwiceOccurences(int[] inputArray) {

    HashMap<Integer, Integer> numberMap = new HashMap<>();

    for (int i = 0; i < inputArray.length; i++) {
      if (!numberMap.containsKey(inputArray[i])) {
        numberMap.put(inputArray[i], 1);
      } else {
        numberMap.put(inputArray[i], numberMap.get(inputArray[i]) + 1);
      }
    }

    List<Integer> tmpNumbers = new ArrayList<>();

    for (int x : numberMap.keySet()) {
      if (numberMap.get(x) >= 2) {
        tmpNumbers.add(x);
      }
    }


    int[] finalArray = new int[tmpNumbers.size()];

    for (int i = 0; i < tmpNumbers.size(); i++) {
      finalArray[i] = tmpNumbers.get(i);
    }

    System.out.println(numberMap);
    System.out.println(Arrays.toString(finalArray));
    return finalArray;
  }

}
