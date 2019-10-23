package FileIOwithSeperatedFunctionsInOwnClasses;

import java.nio.file.Path;
import java.util.HashMap;

public class CharacterCounter {

  ReadFile readFile = new ReadFile();

  public HashMap<Character, Integer> characterCounter(Path path){

    String words = readFile.readFile(path).toString();
    char[] letters = words.toCharArray();

    HashMap<Character, Integer> lettersCounter = new HashMap<>();

    for (int i = 0; i < letters.length; i++) {
      if (lettersCounter.containsKey(letters[i])) {
        lettersCounter.put(letters[i], lettersCounter.get(letters[i]) + 1);
      } else {
        lettersCounter.put(letters[i], 1);
      }
    }

//    lettersCounter.remove(" ");
    return lettersCounter;
  }

}
