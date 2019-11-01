package FinalExamMiniExercises;

public class PalindromeFinder {
  public static void main(String[] args) {

    String string1 = "soros";
    String string2 = "georg";

    isPalindrome(string1);
    isPalindrome(string2);
  }

  public static boolean isPalindrome(String inputString) {
    boolean result = false;

    String newString = "";

    char[] inputLetters = inputString.toCharArray();

    for (int i = 0; i < inputLetters.length; i++) {
      newString = newString + inputLetters[inputLetters.length - 1 - i];
    }

    if (inputString.equals(newString)) {
      result = true;   }

    System.out.println(inputString);
    System.out.println(newString);
    System.out.println(inputString + " is palinrome? " + result);
    return result;
  }

}
