package FinalExamMiniExercises;

public class AvgOfOddNumbersInArray {

  public static void main(String[] args) {

    int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    getTheAvgOfNumbers(array1);

  }

  public static long getTheAvgOfNumbers (int [] inputArray) {

    int numbersFound = 0;
    int sum = 0;

    for (int i = 0; i < inputArray.length; i++) {
      if (inputArray[i] % 2 != 0) {
        numbersFound = numbersFound +1;
        sum = sum + inputArray[i];
      }
    }

    long result = sum / numbersFound;

    System.out.println(sum + " / " + numbersFound + " = " + result);
    return result;
  }

}
