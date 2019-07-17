//Write a function, that takes a string as an argument,
// and returns a dictionary with all letters in the string as keys,
// and numbers as values that shows how many occurrences there are.

package Tasks;

import java.util.HashMap;

public class CountLetters {

    public HashMap<Character, Integer> characterCounter (String inputString) {

        //innen a megoldás

        //megadunk 2 "kivételt" az elején

        if (inputString == null) {
            return null;
        } else if (inputString.equals("")) {
            return null;
        }

        HashMap <Character, Integer> myHashMap = new HashMap<>();

        //létrehozunk egy tömöt az inputStringből

        char [] stringLetters = inputString.toCharArray();

       // a lottós feladaból:

        // for (int number : lotteryNumbers) {
        //      if (!numberFrequency.containsKey(number)) {
        //        numberFrequency.put(number, 1);
        //      } else {
        //        numberFrequency.put(number, numberFrequency.get(number) + 1);
        //      }
        //    }

        for (char x : stringLetters) {
            if (myHashMap.containsKey(x)) {
                myHashMap.put(x, myHashMap.get(x) + 1);
            } else {
                myHashMap.put(x, 1);
            }
        }

        return myHashMap;
    }
}
