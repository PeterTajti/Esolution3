package ArrayPractice_Week2;

import java.util.ArrayList;

public class Main {


  public static void main(String[] args) {

    int[] p1 = {1,2,3};
    int[] p2 = {4,5};

    if (p1.length < p2.length) {
      System.out.println("p2 is longer than p1");
    } else {
      System.out.println("p1 is longer than p2");
    }
    //
    int[] q = {4,5,6,7};
    System.out.println(q[2]);

    //
    int[] r = {54, 23, 66, 12};
    System.out.println(r[1]+r[2]);

    //
    int[] s = {1,2,3,8,5,6};
    s[3] = 4;
    System.out.println(s[3]);

    //
    int[][] matrix = {
            {1,0,0,0},
            {0,1,0,0},
            {0,0,1,0},
            {0,0,0,1},
    };
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++){

        System.out.print(matrix[i][j]+" ");
      }
      System.out.println("");
    }

    //
    int[] numList = {3,4,5,6,7};

    for (int i = 0; i < numList.length; i++) {

      numList[i]*=2;

      System.out.print(numList[i]+", ");

    }

    System.out.println(" ");

    //
    String[] animals = {"koal", "pand", "zebr"};

    for (int i = 0; i < animals.length; i++) {

      animals [i] = animals[i]+"a";
//      animals[i]+="a";
      System.out.println(animals[i]);

    }

    //
    String[] abc = {"first", "second", "third"};
    String[] first = {"first"};

    abc[0] = abc[2];
    abc[2] =first[0];

    System.out.println(abc[0]+" " +abc[2]);

    //
    int[] ai = {3,4,5,6,7};
    int sum = 0;

    for (int i = 0; i < ai.length; i++) {

      sum += ai[i];

    }
    System.out.println(sum);

    //
    int[] aj = {3,4,5,6,7};
    ArrayList ja = new ArrayList();


    for (int i = aj.length-1; i >= 0; i--) {


      ja.add(aj[i]);
      System.out.print(aj[i] + " ");
    }
    System.out.println("");
    System.out.println(ja);
  }


}
