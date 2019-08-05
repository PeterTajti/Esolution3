//Write a Stream Expression to get the average value of the odd numbers from the following list:

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Exercise4 {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    double averageNumbers = numbers.stream()
            .filter(number -> number%2 != 0)
            .mapToDouble(x -> x)
            .average()
            .getAsDouble();

    System.out.println(averageNumbers);





    // ez pedig egy másik megoldás

//    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
////
//    IntSummaryStatistics stats = numbers.stream()
//            .filter(number -> number%2 != 0)
//            .mapToInt((x) -> x)
//            .summaryStatistics();
//
//    System.out.println(stats);



  }

}
