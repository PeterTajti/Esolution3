package ReverseString;

public class ReverseString {

  public static void main(String[] args) {

    String revers = "Ez egy hosszu mondat, amit meg kell forditani";

    char[] test = revers.toCharArray();

    String newWord = "";

    for (int i = 0; i < test.length; i++) {
      newWord = newWord + test[test.length -1 -i];
    }

    System.out.println(test);
    System.out.println(newWord);

  }


}
