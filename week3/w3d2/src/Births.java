//// Create a function that
//    // - takes the name of a CSV file as a parameter,
//    //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
//    // - returns the year when the most births happened.
//    //   - if there were multiple years with the same number of births then return any one of them
//
//    // You can find such a CSV file in this directory named births.csv
//    // If you pass "births.csv" to your function, then the result should be either 2006, or 2016.
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Births {
  public static void main(String[] args) {

  //String fileName = "births.csv";
  mostBirthYears("births.csv");
  }


  public static void mostBirthYears (String fileName) {

    String [] parts = {};
    ArrayList<String> list = new ArrayList<>();

    String [] dates = {};
    ArrayList<String> years = new ArrayList<>();

    HashMap<String, Integer> myHashMap = new HashMap<>();

    try {
      Path filePath = Paths.get("births.csv");
      List<String> lines = Files.readAllLines(filePath);

      for (int i = 0; i < list.size(); i++) {
        parts = lines.get(i).split(";");
        list.add(parts[1]);
      }

      for (int i = 0; i < list.size(); i++) {
        dates = lines.get(i).split("-");
        years.add(dates[0]);
      }


      int counter = 1;

      for (int i = 0; i < years.size(); i++) {
        if (myHashMap.containsKey(years.get(i))){
          myHashMap.put(years.get(i), myHashMap.get(years.get(i))+1);
        } else {
          myHashMap.put(years.get(i), counter);
        }
      }

      System.out.println(years);
      System.out.println(myHashMap);

      int max = Collections.max(myHashMap.values());
      for (String key : myHashMap.keySet()) {
        if (myHashMap.get(key) == max) {
          System.out.println("years with most births: " + key);
        }
      }
    } catch (Exception e) {
      System.out.println("Cannot read the file!");
    }

  }


}
