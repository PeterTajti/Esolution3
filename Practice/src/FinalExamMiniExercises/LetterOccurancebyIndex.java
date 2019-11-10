package FinalExamMiniExercises;

import java.util.ArrayList;
import java.util.List;

public class LetterOccurancebyIndex {
  public static void main(String[] args) {

    theIndexesOfTheChar("almafa", 'a');

  }

  public static List<Integer> theIndexesOfTheChar (String inputString, char inputChar) {
    List<Integer> indexList = new ArrayList<>();

    char [] charactersOfInputString = inputString.toCharArray();

    for (int i = 0; i < charactersOfInputString.length; i++) {

      if (charactersOfInputString[i] == inputChar) {
        indexList.add(i);
      }

    }

    System.out.println(indexList);
    return indexList;
  }




}
