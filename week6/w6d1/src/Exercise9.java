//Write a Stream Expression to find the frequency of characters in a given string!

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Exercise9 {
  public static void main(String[] args) {

    String myString = ("almafa");

    String [] letters = myString.split("");

    System.out.println( Arrays.stream(letters).collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.counting())));

  }

}
