//Write a Stream Expression to find the uppercase characters in a string!

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {

  public static void main(String[] args) {

    String myString = "AppleTreeIsMyStringToExamine";

    List<Character> tempChars = new ArrayList<>();

//    myString.split("");
//
//    myString.chars().mapToObj(c -> (char) c ).collect(Collectors.toList()) // vagy ahogy eddig tanultuk

    for (int i = 0; i < myString.length(); i++) {
      tempChars.add(myString.charAt(i));
    }

    tempChars.stream()
            .filter(Character::isUpperCase)
            .forEach(System.out::print);

  }

}
