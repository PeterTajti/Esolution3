package FinalExamMiniExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonLettersOfStrings {
  public static void main(String[] args) {

    String string1 = "almafa";
    String string2 = "abcdefghijklmnop";

    commonCharacters(string1, string2);
  }

  public static char[] commonCharacters(String inputString1, String inputString2) {

    List <String> intput1letter = Arrays.asList(inputString1.split(""));
    List <String> intput2letter = Arrays.asList(inputString2.split(""));

    List <String> commonLetters = new ArrayList<>();

    for (int i = 0; i < intput1letter.size(); i++) {
      if (intput2letter.contains(intput1letter.get(i)) && !commonLetters.contains(intput1letter.get(i))) {
        commonLetters.add(intput1letter.get(i));

      }
    }

    char[] result = commonLetters.toString().toCharArray();
    System.out.println(result);
    return result;
    }




  }


