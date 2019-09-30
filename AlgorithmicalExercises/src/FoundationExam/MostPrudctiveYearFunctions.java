package FoundationExam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostPrudctiveYearFunctions {

  public static int findMostProdYear(String studioName) {
    //Ha olyat kérnek hogy valaminek a neve a parameter, akkor csak a név az kiterjesztés nélkül!!!
    //majd a fukción belül létrehozunk egy új változót aminek az értéke: név + kiterjesztés.
    //ez után már az új változóra hivatkozunk a funkción belül.
    String fileName = studioName + ".csv";
    int mostProdYear = 0;
    int mostProdYearsValue = 0;

    try {
      Path fileContentPath = Paths.get(fileName);
      List<String> linesContent = Files.readAllLines(fileContentPath);
      ArrayList<Integer> yearOfRelease = new ArrayList<>();
      HashMap<Integer, Integer> yearOfReleaseOccurance = new HashMap<>();

      for (int i = 0; i < linesContent.size(); i++) {

        String year = linesContent.get(i).split(",")[1];
        Integer yearInInt = Integer.parseInt(year);

        yearOfRelease.add(yearInInt);

      }

      for (Integer key : yearOfRelease) {

        Integer value = yearOfReleaseOccurance.get(key);
        yearOfReleaseOccurance.put(key, (value == null) ? 1 : value + 1);

      }

      for (Map.Entry<Integer, Integer> mostMoviesInAYear : yearOfReleaseOccurance.entrySet()) {

        if (mostMoviesInAYear.getValue() > mostProdYearsValue) {

          mostProdYearsValue = mostMoviesInAYear.getValue();
          mostProdYear = mostMoviesInAYear.getKey();

        }

      }
      System.out.println(mostProdYear);

    } catch (IOException e) {

      System.out.println("There is no available data from " + studioName + " studio, please come back later");


    }


    return mostProdYear;
  }
}
