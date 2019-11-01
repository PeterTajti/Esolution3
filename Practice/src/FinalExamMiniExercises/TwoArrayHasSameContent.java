package FinalExamMiniExercises;

import java.util.Arrays;

public class TwoArrayHasSameContent {
  public static void main(String[] args) {

    int [] array1 = {1, 2, 3};
    int [] array2 = {1, 2, 3};
    int [] array3 = {1, 2, 4};

    hasSameContent(array1, array2);
    hasSameContent(array1, array3);
  }

  public static boolean hasSameContent (int [] inputArray1, int [] inputArray2) {
    boolean result = false;

    if (Arrays.equals(inputArray1, inputArray2)) {
      result = true;
    }

    System.out.println(Arrays.toString(inputArray1) + " and " + Arrays.toString(inputArray2) + " has same content? --->" + result);
    return result;
  }

}
