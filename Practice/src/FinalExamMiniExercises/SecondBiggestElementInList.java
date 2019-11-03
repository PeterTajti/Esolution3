package FinalExamMiniExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondBiggestElementInList {
  public static void main(String[] args) {

    List<Integer> myNumbers = Arrays.asList(500, 1, 2, 3, 4, 5, 10, 25, 100, 200, 500);

    give2ndBiggestNumber(myNumbers);

  }

  public static int give2ndBiggestNumber(List<Integer> inputList) {
    int highest = 0;
    int secoundHighest = 0;

    for (int i = 0; i < inputList.size(); i++) {
      if (inputList.get(i) > highest) {
        secoundHighest = highest;
        highest = inputList.get(i);
      }
      if (inputList.get(i) < highest && inputList.get(i) > secoundHighest) {
        secoundHighest = inputList.get(i);
      }
    }

    System.out.println("The secound highest number in the list is : " + secoundHighest);
    return secoundHighest;
  }

}
