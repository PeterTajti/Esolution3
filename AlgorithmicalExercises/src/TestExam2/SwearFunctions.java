package TestExam2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearFunctions {

  public static int removeSwearWords(String fileName, String[] swearWorlds) {

    int removedWords = 0;

    try {

      Path fileContentPath = Paths.get(fileName);
      List<String> linesContent = Files.readAllLines(fileContentPath);
      List<String> allWords = new ArrayList<String>(Arrays.asList(linesContent.toString().toLowerCase().split(" ")));


      for (int i = 0; i < allWords.size(); i++) {
        for (int j = 0; j < swearWorlds.length; j++) {

          if (allWords.get(i).equals(swearWorlds[j])) {

            allWords.remove(i);
            removedWords++;

          }

        }

      }

    } catch (IOException e) {

      System.out.println("no file");

    }

    return removedWords;
  }
}
