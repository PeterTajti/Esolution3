package FinalExamMiniExercises;

import java.util.Arrays;

public class ShiftArrayElementsByNumber {
  public static void main(String[] args) {

    int[] myArray = {1, 2, 3, 4, 5};

    int myNumber = 2;

    shiftArray(myArray, myNumber);

  }

  public static int[] shiftArray(int[] inputArray, int inputNumber) {
    int[] finalArray = new int[inputArray.length];

    for (int i = 0; i < inputArray.length; i++) {

      if (i == inputNumber) {
        finalArray[i] = inputArray[0];
      }
      if (i < inputNumber) {
        finalArray[i] = inputArray[(inputArray.length) - inputNumber + i];
      }
      if (i > inputNumber) {
        finalArray[i] = inputArray[i - inputNumber];
      }

    }


    System.out.println(Arrays.toString(finalArray));
    return finalArray;
  }

}
