package FileIOwithSeperatedFunctionsInOwnClasses;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

  public static void main(String[] args) {
    Path filePath = Paths.get("C:\\Users\\izs\\greenfox\\isteneszsolt\\Practice\\src\\FileIOwithSeperatedFunctionsInOwnClasses\\anotherContent.txt");
    int limit = 2;
    MostCommon mostCommon = new MostCommon();

    mostCommon.mostCommon(filePath, limit);

  }

}
