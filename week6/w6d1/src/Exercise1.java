//Write a Stream Expression to get the even numbers from the following list:

import java.util.Arrays;
import java.util.List;

public class Exercise1 {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    numbers.stream()
            .filter(number -> number%2 == 0)
            .forEach(System.out::println); //a :: -val a stream valamennyi elemeit kiprinteli / vonatkoztatja rá

  }

}


// myList.stream().filter(x -> x > 3).forEach(System.out::println);