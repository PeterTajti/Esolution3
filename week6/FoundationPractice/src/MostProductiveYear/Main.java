package MostProductiveYear;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    System.out.println(getMostProductiveYear("SRC/paramount"));
  }

  public static String getMostProductiveYear(String studio){
    Path path = Paths.get(studio+".csv");
    List<String> lines;
    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      return "Cannot find studio " + studio + ", please try again later.";
    }
    HashMap<String, Integer> yearCount = new HashMap<>();
    for (String line : lines){
      String[] lineParts = line.split(",");
      if (yearCount.containsKey(lineParts[1]) == false){
        yearCount.put(lineParts[1],1);
      } else {
        yearCount.put(lineParts[1], yearCount.get(lineParts[1]) + 1);
      }
    }

    int greatestYearProduction = 0;
    String mostProductiveYear = null;
    for(Map.Entry<String, Integer> item : yearCount.entrySet()){
      if ( greatestYearProduction < item.getValue()){
        greatestYearProduction = item.getValue();
        mostProductiveYear = item.getKey();
      }
    }
    return mostProductiveYear;
  }
}
