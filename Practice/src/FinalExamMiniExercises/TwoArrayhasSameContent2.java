package FinalExamMiniExercises;

import java.util.Arrays;

public class TwoArrayhasSameContent2 {
  public static void main(String[] args) {

    int[] array1 = {1, 2, 3};
    int[] array2 = {1, 2, 3};
    int[] array3 = {1, 2, 4};

    TwoArrayWithSameContent(array1, array2);

    TwoArrayWithSameContent(array1, array3);
  }

  public static boolean TwoArrayWithSameContent(int[] inputArray1, int[] inputArray2) {
    boolean result = false;

    String s1 = Arrays.toString(inputArray1);
    String s2 = Arrays.toString(inputArray2);

    if (s1.equals(s2)) {
      result = true;
    }

    System.out.println(result);
    return result;
  }

}
