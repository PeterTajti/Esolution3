package FinalExamMiniExercises;

public class StringLenghtCounter {
  public static void main(String[] args) {

    String myWord = "Blackdragon";

    StringLenghtMeter(myWord);
  }

  public static int StringLenghtMeter(String inputString) {
    int result = 0;

    for (int i = 0; i < inputString.length(); i++) {
      result = result + 1;
    }

    System.out.println("The input string contains " + result + " character.");
    return result;
  }

}
