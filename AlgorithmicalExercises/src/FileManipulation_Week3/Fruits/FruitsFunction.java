package FileManipulation_Week3.Fruits;

import java.util.HashMap;
import java.util.Map;

public class FruitsFunction {

  public static String mostCommonFruit(String[] fruits) {

    String mostCommon = "";
    int maxValue = 0;
    HashMap<String, Integer> fruitKeyValuePairs = new HashMap<>();

    for (String key : fruits) {

      Integer value = fruitKeyValuePairs.get(key);
      fruitKeyValuePairs.put(key, (value == null) ? 1 : value + 1);

    }

    for (Map.Entry<String, Integer> mostCommonFruits : fruitKeyValuePairs.entrySet()) {

      if (mostCommonFruits.getValue() > maxValue) {

        maxValue = mostCommonFruits.getValue();
        mostCommon = mostCommonFruits.getKey();

      }

    }

    System.out.println(mostCommon);

    return mostCommon;
  }
}
