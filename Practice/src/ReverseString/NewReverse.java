package ReverseString;

import java.util.ArrayList;
import java.util.List;

public class NewReverse {
  public static void main(String[] args) {

    String string1 = "almafa";

    reverseTheString(string1);

  }

  public static String reverseTheString(String inputString) {
    String result = "";

    char[] inputChars = inputString.toCharArray();

    for (int i = 0; i < inputChars.length; i++) {
     result = result + inputChars[inputChars.length-1-i];
    }


    System.out.println(result);
    return result;
  }

}
