package FinalExamMiniExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromNumberList {
  public static void main(String[] args) {

    List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,1,1,1,1);
//    numbers1.add(1);
//    numbers1.add(2);
//    numbers1.add(3);
//    numbers1.add(4);
//    numbers1.add(1);
//    numbers1.add(1);
//    numbers1.add(1);

    duplicateRemover(numbers1);

  }

  public static List<Integer> duplicateRemover(List<Integer> inputList) {
    List<Integer> resultList = new ArrayList<>();

    for (int i = 0; i < inputList.size(); i++) {
      if (!resultList.contains(inputList.get(i))) {
        resultList.add(inputList.get(i));
      }
    }

    System.out.println(resultList);
    return resultList;
  }

}
