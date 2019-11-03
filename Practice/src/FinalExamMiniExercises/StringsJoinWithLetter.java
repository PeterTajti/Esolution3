package FinalExamMiniExercises;

import java.util.ArrayList;
import java.util.List;

public class StringsJoinWithLetter {
  public static void main(String[] args) {

    List<String> stringlist1 = new ArrayList<>();
    stringlist1.add("apple");
    stringlist1.add("pear");
    stringlist1.add("orange");

    String stringToBorder = ".";

    joinStringListElementsByLetter(stringlist1, stringToBorder);

  }


  public static String joinStringListElementsByLetter(List<String> inputList, String inputString) {
    String result = "";

    for (int i = 0; i < inputList.size(); i++) {
      result = result + inputList.get(i) + inputString;
    }

    StringBuilder tempString = new StringBuilder();
    tempString.append(result);
    tempString.deleteCharAt(tempString.length()-1);



    System.out.println(tempString);
    return result;
  }

}
