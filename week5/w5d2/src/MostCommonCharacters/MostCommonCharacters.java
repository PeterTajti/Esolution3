package MostCommonCharacters;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class MostCommonCharacters {

    public static void main(String[] args) {
      mostCommonChar("C:\\Users\\izs\\greenfox\\isteneszsolt\\week5\\w5d2\\src\\MostCommonCharacters\\countchar.txt");
    }

    public static void mostCommonChar (String fileName){
      List<String> file = readFile(fileName);

      String singleLineFile = "";  //ez azt jelenti, hogy üresként kezd

      for (String line : file) {
        singleLineFile += line;
      }
      //System.out.println(file.toString());
      //System.out.println(singleLineFile);

      singleLineFile = singleLineFile.toLowerCase();

      char [] newCharArray = singleLineFile.toCharArray();

      String [] newNewStringArray = new String[singleLineFile.length()];

      newNewStringArray = singleLineFile.split("");

     HashMap<String, Integer> countedCharacters = new HashMap<>();

      for (String character : newNewStringArray) {
        if (countedCharacters.containsKey(character)) {
          countedCharacters.put(character, countedCharacters.get(character)+1);

        } else {
          countedCharacters.put(character, 1);
        }
      }

      String mostCommon =" ";
      String secondMostCommon =" ";
      for (String character: countedCharacters.keySet()) {
        if (countedCharacters.get(character) > countedCharacters.get(mostCommon)) {
          secondMostCommon = mostCommon;
          mostCommon = character;

        } else {
          if (countedCharacters.get(character) > countedCharacters.get(secondMostCommon)) {
            secondMostCommon = character;
          }
        }
        }
      System.out.println(mostCommon + " : " + countedCharacters.get(mostCommon));
      System.out.println(secondMostCommon + " : " + countedCharacters.get(secondMostCommon));
    }



    public static List<String> readFile (String fileName) {
       try {
         Path filePath = Paths.get ("C:\\Users\\izs\\greenfox\\isteneszsolt\\week5\\w5d2\\src\\MostCommonCharacters\\countchar.txt");
         List<String> lines = Files.readAllLines(filePath);
         return lines;
       } catch (Exception e) {
         System.out.println("Oops, cant read the file");
       }
       return null;
    }
}