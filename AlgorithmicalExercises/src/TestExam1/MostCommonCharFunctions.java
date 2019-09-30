package TestExam1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonCharFunctions {

  public static Map<String, Integer> mostCommonChars(String fileName) {

    HashMap<String, Integer> mostCommon = new HashMap<>();

    int maxValues = 0;
    String maxKeys = "";
    try {
      List<String> linesContent = null;
      Path fileContentPath = Paths.get(fileName);
      linesContent = Files.readAllLines(fileContentPath);
      ArrayList<String> character = new ArrayList<>();
      HashMap<String, Integer> charOccurance = new HashMap<>();

      for (int i = 0; i < linesContent.size(); i++) {
        for (int j = 0; j < linesContent.get(i).length(); j++) {

          String chars = linesContent.get(i).split("")[j].toLowerCase();
          character.add(chars);
        }

      }

      for (String key : character) {

        Integer value = charOccurance.get(key);
        charOccurance.put(key, (value == null) ? 1 : value + 1);
        charOccurance.remove(" ");

      }

      for (int x = 0; x < 2; x++) {

        for (Map.Entry<String, Integer> mostCommonChar : charOccurance.entrySet()) {

          if (mostCommonChar.getValue() > maxValues) {

            maxValues = mostCommonChar.getValue();
            maxKeys = mostCommonChar.getKey();

          }

        }

      }

      charOccurance.remove(maxKeys);


      //a for loopon kívül kell hozzáadni őket !!!
      mostCommon.put(maxKeys, maxValues);

    } catch (IOException e) {
      System.out.println("there is no file");
    }

    System.out.println(mostCommon);
    return mostCommon;
  }
}
