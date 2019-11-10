package FinalExamMiniExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneNewArrayFromTwo {
  public static void main(String[] args) {

    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 5, 6};

    makeOneArrayFromTwo(array1, array2);

  }

  public static int [] makeOneArrayFromTwo(int[] inputArray1, int[] inputArray2) {
    List<Integer> finalNumberlist = new ArrayList<>();

    for (int i = 0; i < inputArray1.length; i++) {
      finalNumberlist.add(inputArray1[i]);
    }

    for (int i = 0; i < inputArray2.length; i++) {
      finalNumberlist.add(inputArray2[i]);
    }

    System.out.println(finalNumberlist);

    int [] myIntArray = new int[finalNumberlist.size()];

    for (int i = 0; i < finalNumberlist.size(); i++) {
      myIntArray[i] = finalNumberlist.get(i);
    }

    System.out.println(Arrays.toString(myIntArray));

    return myIntArray;
  }

}
