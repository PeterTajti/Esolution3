package FinalExamMiniExercises;

public class BiggestNumbeInArray {

  public static void main(String[] args) {
    int [] myArray = {1,2,3,4,5,6,7,9,10,15,20,50,25};

    getBiggestNumberInArray(myArray);
  }

  public static int getBiggestNumberInArray (int [] inputArray) {
    int result = 0;

    for (int i = 0; i < inputArray.length; i++) {
      if (inputArray[i] > result) {
        result = inputArray[i];
      }
    }

    System.out.println(result);
    return result;
  }

}
