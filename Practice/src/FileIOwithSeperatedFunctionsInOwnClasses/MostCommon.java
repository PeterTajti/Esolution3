package FileIOwithSeperatedFunctionsInOwnClasses;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostCommon {


  CharacterCounter charactersCounter = new CharacterCounter();


  public List<String> mostCommon(Path path, int limit){

    List<String> mostCommons = new ArrayList<>();
    int max = 1;
    char oneLetter = ' ';
    HashMap<Character, Integer> charactersWithNumbers = charactersCounter.characterCounter(path);
    charactersWithNumbers.remove(' ');
    for (int i = 0; i < limit; i++){
      for (Character letter : charactersWithNumbers.keySet()) {
        if(max < charactersWithNumbers.get(letter)){
          max = charactersWithNumbers.get(letter);
          oneLetter = letter;
        }
      }
      mostCommons.add(oneLetter + " : " + max);
      charactersWithNumbers.remove(oneLetter);
      max = 1;
    }

    System.out.println(oneLetter);
    System.out.println(mostCommons);
    return mostCommons;

  }

}
