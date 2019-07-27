//// Create a function that
//    // - takes the name of a CSV file as a parameter,
//    //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
//    // - returns the year when the most births happened.
//    //   - if there were multiple years with the same number of births then return any one of them
//
//    // You can find such a CSV file in this directory named births.csv
//    // If you pass "births.csv" to your function, then the result should be either 2006, or 2016.

package Births;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Births {


  public static void mostBirths (String fileName) {

    List<String > file = readFile(fileName);

  }



  public static List<String> readFile (String fileName) {
    try {
      Path filePath = Paths.get ("C:\\Users\\izs\\greenfox\\isteneszsolt\\week3\\w3d3\\src\\Births\\births.csv");
      List<String> lines = Files.readAllLines(filePath);
      return lines;
    } catch (Exception e) {
      System.out.println("Oops, cant read the file");
    }
    return null;
  }

}
