package UniqueNumbers;

import java.util.ArrayList;

public class UniqueNumbers {

  public static void main(String[] args) {

    int [][] matrix1 = {
            {1,1},
            {4,2}
    };

    findUniqueNumbers(matrix1);

  }

  public static ArrayList <Integer> findUniqueNumbers (int [][] inputMatrix) {

    ArrayList<Integer> numbersWithDuplicates = new ArrayList<>();
    ArrayList<Integer> numbersWithoutDuplicates = new ArrayList<>();

    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix[i].length; j++) {
        numbersWithDuplicates.add(inputMatrix[i][j]);
      }
    }

    for (int k = 0; k < numbersWithDuplicates.size(); k++) {
      if (!numbersWithoutDuplicates.contains(numbersWithDuplicates.get(k))){
        numbersWithoutDuplicates.add(numbersWithDuplicates.get(k));
      }
    }

    System.out.println("The members of the numbers array with duoplicates are : " + numbersWithDuplicates);
    System.out.println("The cleaned array, without duplicated numbers: " + numbersWithoutDuplicates);
    return numbersWithoutDuplicates;
  }

}
