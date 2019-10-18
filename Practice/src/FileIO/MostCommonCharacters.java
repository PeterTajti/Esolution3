package FileIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostCommonCharacters {

  public static void main(String[] args) {

    Path filePath = Paths.get("C:\\Users\\izs\\greenfox\\isteneszsolt\\Practice\\src\\FileIO\\content.txt");

    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println();
    }

    //

    String words = lines.toString();
    words = words.toLowerCase();
    char[] letters = words.toCharArray();


    HashMap<Character, Integer> lettersCounter = new HashMap<>();

    for (int i = 0; i < letters.length; i++) {
      if (lettersCounter.containsKey(letters[i])) {
        lettersCounter.put(letters[i], lettersCounter.get(letters[i]) + 1);
      } else {
        lettersCounter.put(letters[i], 1);
      }
      lettersCounter.remove(' ');
    }

    //

    Character mostCommonCharacter = 'a';

    for (Character c :lettersCounter.keySet()) {
      if (lettersCounter.get(c) > lettersCounter.get(mostCommonCharacter)) {
        mostCommonCharacter = c;
      }
    }

    System.out.println(lines);
    System.out.println(words);
    System.out.println(letters);
    System.out.println(lettersCounter);
    System.out.println("The most common character is: " + mostCommonCharacter + " Its occurency is :" + lettersCounter.get(mostCommonCharacter));
  }

}
