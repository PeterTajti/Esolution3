package FinalExamMiniExercises;

import java.util.Arrays;

public class IsAnagram {
  public static void main(String[] args) {

    String string1 = "madam";
    String string2 = "madma";

    String string3 = "madam";
    String string4 = "madaa";

    isAnagram(string1, string2);

    isAnagram(string3, string4);

  }

  public static boolean isAnagram (String inputstring1, String inputstring2) {
    boolean result = false;

    char [] input1 = inputstring1.toCharArray();
    Arrays.sort(input1);


    char [] input2 = inputstring2.toCharArray();
    Arrays.sort(input2);

    String newString1 = Arrays.toString(input1);
    String newString2 = Arrays.toString(input2);

    if (newString1.equals(newString2)){
      result = true;
    }

    System.out.println(newString1 + " " + newString2);

    System.out.println(inputstring1 + " and " + inputstring2 + " are anagrams? --->" + result);
    return result;
  }

}
