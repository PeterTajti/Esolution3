package SwearWords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWordsFunction {

  public static int removeSwearWords(String name, String[] swearWords) {
    String fileName = name;
    int removedWords = 0;

    try {

      Path fileContentPath = Paths.get(fileName);
      List<String> linesContent = Files.readAllLines(fileContentPath);
      List<String> contentSplited = new ArrayList<>(Arrays.asList(linesContent.toString().toLowerCase().split(" ")));

      for (int i = 0; i < contentSplited.size(); i++) {
        for (int j = 0; j < swearWords.length; j++) {
          if (contentSplited.get(i).equals(swearWords[j])) {
            contentSplited.remove(i);
            removedWords++;

          }
        }
      }


      System.out.println(removedWords);
    } catch (IOException e) {
      System.out.println("cant found " + name);
    }


    return removedWords;
  }
}
