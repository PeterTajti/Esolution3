package FoundationExam;

import java.util.ArrayList;

public class UniqueNumberFunctions {

  public static ArrayList<Integer> findUnipueNumbers(int[][] myMatrix) {

    ArrayList<Integer> numbersWithDupl = new ArrayList<>();
    ArrayList<Integer> numbersWithoutDupl = new ArrayList<>();

    for (int i = 0; i < myMatrix.length; i++) {
      for (int j = 0; j < myMatrix[i].length; j++) {

        numbersWithDupl.add(myMatrix[i][j]);

      }
    }

    for (int k = 0; k < numbersWithDupl.size(); k++) {

      if (!numbersWithoutDupl.contains(numbersWithDupl.get(k))) {

        numbersWithoutDupl.add(numbersWithDupl.get(k));

      }

    }

    System.out.println(numbersWithoutDupl);
    return numbersWithoutDupl;
  }
}
