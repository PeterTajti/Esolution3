package ElementMixer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MixTheElementsOfTheArray {

  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    list1.add("answer1");
    list1.add("answer2");
    list1.add("answer3");
    list1.add("answer4");

    MixTheListElements(list1);
  }

  public static List<String> MixTheListElements(List<String> inputList) {
    Collections.shuffle(inputList);
    System.out.println(inputList);
    return inputList;
  }
}
