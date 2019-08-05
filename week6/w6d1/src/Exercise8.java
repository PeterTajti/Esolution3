//Write a Stream Expression to concatenate a Character list to a string!

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {

  public static void main(String[] args) {

    List<Character> myList = Arrays.asList('a', 'l', 'm', 'a', 'f', 'a');

    String myString = myList.stream()   // Stream<Character>
            .map(x -> x.toString())   // Stream<String>
            .collect(Collectors.joining());

    System.out.println(myString);


  }

}
