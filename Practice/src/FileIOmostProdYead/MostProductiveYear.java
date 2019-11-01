package FileIOmostProdYead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostProductiveYear {

  public static int mostProductiveYear(String fileName) {

    int maxValue = 0;
    int maxKey = 0;

    try {

      List<String> lines = null;

      Path filePath = Paths.get(fileName);
      lines = Files.readAllLines(filePath);

      ArrayList<Integer> yearOfBirth = new ArrayList<>();

      HashMap<Integer, Integer> yearOfBirthOccurance = new HashMap<>();

      for (int i = 0; i < lines.size(); i++) {

        String date = lines.get(i).split(";")[1];
        Integer year = Integer.parseInt(date.split("-")[0]);

        yearOfBirth.add(year);

      }

      for (Integer key : yearOfBirth) {

        if (!yearOfBirthOccurance.containsKey(key)) {
          yearOfBirthOccurance.put(key, 1);
        } else {
          yearOfBirthOccurance.put(key, yearOfBirthOccurance.get(key)+1);
        }

//        Integer value = yearOfBirthOccurance.get(key);
//        yearOfBirthOccurance.put(key, (value == null) ? 1 : value + 1);
      }

//      for (Map.Entry<Integer, Integer> mostBirhtsInAYear : yearOfBirthOccurance.entrySet()) {
//
//
//        if (mostBirhtsInAYear.getValue() > maxValue) {
//            maxValue = mostBirhtsInAYear.getValue();
//            maxKey = mostBirhtsInAYear.getKey();
//
//        }
//
//      }

      for (Map.Entry<Integer, Integer> year:yearOfBirthOccurance.entrySet()) {
        if (year.getValue() > maxValue) {
          maxValue = year.getValue();
          maxKey = year.getKey();
        }
      }

    } catch (IOException e) {
      e.printStackTrace();
    }


    System.out.println(maxKey);
    return maxKey;
  }
}