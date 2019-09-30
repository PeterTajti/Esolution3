package DataStructures_Week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Functions {

  public static void replaceTheString(String example) {

    String replaced = example.replace("dishwasher", "galaxy");

    System.out.println(replaced);

  }

  public static void correctingUrl(String url) {

    String replacedBots = url.replace("bots","odds");
    String correctUrl = replacedBots.replace("https//", "https://");

    System.out.println(correctUrl);

  }

  public static void correctQuote(String quote) {

    ArrayList<String> worlds = new ArrayList<String>(Arrays.asList(quote.split(",")));
    String rightuote = "It always takes longer than you expect";
    worlds.set(0,rightuote);
    System.out.println(worlds);
  }

  public static void toDoList(String todoText) {

    String myTodo = "My todo: ";
    String download = " - Download games";
    String diablo = "   - Diablo";

    String [][] tododList = {

            {myTodo},
            {todoText},
            {download},
            {diablo},
    };

    for (int i = 0; i < tododList.length; i++) {
      for (int j = 0; j < tododList[i].length; j++) {
        System.out.println(tododList[i][j]);
      }

    }
  }
  public static void reverser(String reversed) {

    String reversedString = "";

    for (int i = reversed.length()-1; i >= 0 ; i--) {

      reversedString += reversed.charAt(i);

    }
    System.out.println(reversedString);
  }

  //
  public static void nameAdder(List names, String charNames) {

    names.add(charNames);

  }

  public static void isEmpty(List names) {

    if (names.size()==0) {
      System.out.println("This list is empty");
    } else {
      System.out.println("This list is not empty");
    }

  }

  public static void printingEach(List names) {

    for (int i = 0; i < names.size(); i++) {

      System.out.println(names.get(i));

    }

  }

  public static void printTheGiven(List names, int whichChar) {

    System.out.println(names.get(whichChar));

  }

  public static void printingEachButWithNumbers(List names) {
    int positon = 0;
    for (int i = 0; i < names.size(); i++) {

      positon+=1;
      System.out.println(positon + ". " + names.get(i).toString());

    }
  }

  public static void removeGivenElement(List names, int toRemove) {

    names.remove(toRemove);

  }

  public static void reverseIterate(List names) {

    for (int i = names.size()-1; i >= 0; i--) {

      System.out.println(names.get(i));
    }

    System.out.println(names.size());
  }

  public static void removeAll(List names) {

    for (int i = 0; i < names.size(); i++) {

      names.remove(i);
      System.out.println(names.size());
      System.out.println(names.get(i));

      //something is fishy

    }

  }

  //
  public static void isHashMapEmpty(HashMap map) {

    if (map.size() > 0) {
      System.out.println("this hashmap is not empty");
    } else {
      System.out.println("this hashmap is empty");
    }

  }

  public static void addElementsToTheMap(HashMap map, int key, String values) {

    map.put(key,values);

  }

  public static void printAllKeys(HashMap map) {

      System.out.println(map.keySet());
  }

  public static void printAllValues(HashMap map) {

    System.out.println(map.values());

  }

  public static void addKeysAndValues(HashMap map, int keyToAdd, String valueToAdd) {

    map.put(keyToAdd,valueToAdd);

  }

  public static void howManyPairs(HashMap map) {

    System.out.println(map.size());

  }

  public static void printASpecificValue(HashMap map, int printKey) {

    System.out.println(map.get(printKey));

  }

  public static void removeASpecificKeyValuePair(HashMap map,int removeKey) {

    map.remove(removeKey);

  }
  public static void isThereAValue(HashMap map, int isThereAValue) {

    if (map.get(isThereAValue) != null) {

      System.out.println("There is a value");

    } else {
      System.out.println("There is not a single value");
    }

  }

  public static void removeAllPair(HashMap map) {

    for (int i = 0; i < map.size(); i++) {

      map.clear();

    }

  }

  public static void addingFruits (List listA, String fruits) {

    listA.add(fruits);

  }


  public static void contains (List listA, String fruits) {

    if (listA.contains(fruits)) {
      System.out.println("its contains " + fruits);
    } else {
      System.out.println("its doesnt cointains " + fruits);
    }
  }

  public static void addToMyHashmap(HashMap myMap, String myMapKeys, String myMapValues) {

    myMap.put(myMapKeys,myMapValues);

  }

  public static void whatIsTheNumber(HashMap myMap, String myMapKeys) {

    System.out.println(myMap.get(myMapKeys));

  }
  public static void whoIsTheOwnerr(HashMap myMap, String myMapValues) {

    System.out.println(myMap.get(myMapValues));

  }

  public static void isThereANumber(HashMap myMap) {

    String name = "Chris E. Myers";
    if (!myMap.containsKey(name)) {

      System.out.println("We dont know his number");

    }

  }

}
