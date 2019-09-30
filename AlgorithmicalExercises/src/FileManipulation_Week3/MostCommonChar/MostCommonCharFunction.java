package FileManipulation_Week3.MostCommonChar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonCharFunction {

  public static String findMostCommon(String name) {
    String fileName = name + ".txt";
    String mostCommonCharacter = "";
    int maxValue = 0;
    HashMap<String,Integer>mostCommonPairs = new HashMap<>();

    try {
      Path fileContentPath = Paths.get(fileName);
      List<String> linesContent = Files.readAllLines(fileContentPath);
      List<String> characters = new ArrayList<>();
      HashMap<String, Integer> charatersAndOccurances = new HashMap<>();

      for (int i = 0; i < linesContent.size(); i++) {
        for (int j = 0; j < linesContent.get(i).length(); j++) {
          characters.add(linesContent.get(i).split("")[j].toLowerCase());

        }

      }

      for (String key : characters) {
        Integer value = charatersAndOccurances.get(key);
        charatersAndOccurances.put(key, (value == null) ? 1 : value + 1);

      }

      for (Map.Entry<String, Integer> mostCommon : charatersAndOccurances.entrySet()) {
        if (mostCommon.getValue() > maxValue) {

          maxValue = mostCommon.getValue();
          mostCommonCharacter = mostCommon.getKey();

        }

      }

      mostCommonPairs.put(mostCommonCharacter,maxValue);
      System.out.println(mostCommonPairs);


    } catch (IOException e) {

      System.out.println(name + "cant be found");
    }


    return mostCommonCharacter;
  }
}
