package FinalExamMiniExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersInfirstButNotInSecoundList {

  public static void main(String[] args) {

    List<Integer> numberlist1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
    List<Integer> numberlist2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    giveBackNumbers(numberlist1, numberlist2);
  }

  public static List<Integer> giveBackNumbers(List<Integer> inputlist1, List<Integer> inputlist2) {
    List<Integer> finalList = new ArrayList<>();

    for (int i = 0; i < inputlist1.size(); i++) {
      if (!inputlist2.contains(inputlist1.get(i))) {
        finalList.add(inputlist1.get(i));
      }
    }

    System.out.println(finalList);
    return finalList;
  }

}
