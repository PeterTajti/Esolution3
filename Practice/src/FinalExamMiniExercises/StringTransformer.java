package FinalExamMiniExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTransformer {
  public static void main(String[] args) {

//    List<String> list1 = new ArrayList<>();
//    list1.add("eye");
//    list1.add("ice");
//    list1.add("gem");

    List<String> list1 = Arrays.asList("eye", "ice", "rib");

    transformer(list1);
  }

  public static List<String> transformer(List<String> inputList) {
    List<String> finalList = new ArrayList<>();

    List<Character> tempCharList = new ArrayList<>();

    for (int i = 0; i < inputList.size(); i++) {
      char[] tempChars = inputList.get(i).toCharArray();
      for (int j = 0; j < tempChars.length; j++) {
        tempCharList.add(tempChars[j]);
      }
    }


    for (int i = 0; i < inputList.size(); i++) {
      List<Character> tempList = new ArrayList();

      for (int j = 0; j < inputList.size(); j++) {
        Character newChar = tempCharList.get(0 + (inputList.size() * j+i));
        tempList.add(newChar);
      }

      String str = tempList.toString();
      finalList.add(str);
    }


    System.out.println(finalList);
    return finalList;
  }

}
