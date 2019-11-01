package FinalExamMiniExercises;

public class ReverseString {
  public static void main(String[] args) {

    String myString = "feketefa";

    reverseTheString(myString);

  }

  public static String reverseTheString(String inputString) {
    String result = "";

    char[] characters = inputString.toCharArray();

    for (int i = 0; i < characters.length; i++) {
      result = result + characters [characters.length-1-i];
    }

    System.out.println(result);
    return result;
  }

}
