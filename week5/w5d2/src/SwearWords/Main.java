package SwearWords;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    badWordCounter("content.txt");

  }

  public static void badWordCounter(String fileName) {

    List<String> forbiddenWords = new ArrayList<>();

    forbiddenWords.add("fuck");
    forbiddenWords.add("bloody");
    forbiddenWords.add("cock");
    forbiddenWords.add("shit");
    forbiddenWords.add("fucker");
    forbiddenWords.add("fuckstick");
    forbiddenWords.add("asshole");
    forbiddenWords.add("dick");
    forbiddenWords.add("piss");
    forbiddenWords.add("cunt");

    forbiddenWords.add("fuck,");
    forbiddenWords.add("bloody,");
    forbiddenWords.add("cock,");
    forbiddenWords.add("shit,");
    forbiddenWords.add("fucker,");
    forbiddenWords.add("fuckstick,");
    forbiddenWords.add("asshole,");
    forbiddenWords.add("dick,");
    forbiddenWords.add("piss,");
    forbiddenWords.add("cunt,");

    forbiddenWords.add("fuck.");
    forbiddenWords.add("bloody.");
    forbiddenWords.add("cock.");
    forbiddenWords.add("shit.");
    forbiddenWords.add("fucker.");
    forbiddenWords.add("fuckstick.");
    forbiddenWords.add("asshole.");
    forbiddenWords.add("dick.");
    forbiddenWords.add("piss.");
    forbiddenWords.add("cunt.");

    List<String> file = readFile("content.txt");

    String singleLineFile = "";

    for (String line : file) {
      singleLineFile += line;
    }

    singleLineFile = singleLineFile.toLowerCase();


    String[] newNewStringArray = new String[singleLineFile.length()];

    newNewStringArray = singleLineFile.split(" ");

    int numberOfForbiddenWords = 0;

    for (int i = 0; i < newNewStringArray.length; i++) {
      for (int j = 0; j < forbiddenWords.size(); j++) {
        if (newNewStringArray[i].equals(forbiddenWords.get(j))) {
          numberOfForbiddenWords++;

        }
      }

      // innen jön az hogy kitörölje a csúnya szavakat

      List<String> listForRemove = new ArrayList<>();

      for (int m = 0; m < newNewStringArray.length; m++) {
        listForRemove.add(newNewStringArray[m]);
      }

      for (int j = 0; j < listForRemove.size(); j++) {
        for (int k = 0; k < forbiddenWords.size(); k++) {
          if (listForRemove.get(j).equals(forbiddenWords.get(k))) {
            listForRemove.remove(j);
          }
        }
      }

      // idáig kigyűjti egy listába (listForRemove) hogy mit írjunk vissza a file-ba káromkodások nélkül
      // innen írjuk bele a fájlba

      try {
        Path filePath = Paths.get("content.txt");
        Files.write(filePath, listForRemove);
      }
      catch (Exception e) {
        System.out.println("Uh-oh, could not write the file!");
      }

      // viszont így nem sorokat ír vissza, hanem minden szót egy új sorba
      //


    }
    System.out.println("The number of forbidden words: " + numberOfForbiddenWords);

  }


  public static List<String> readFile(String fileName) {
    try {
      Path filePath = Paths.get("content.txt");
      List<String> lines = Files.readAllLines(filePath);
      return lines;
    } catch (Exception e) {
      System.out.println("Oops, cant read the file");
    }
    return null;
  }


}
