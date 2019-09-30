package DataStructures_Week2;

import com.sun.org.apache.xpath.internal.compiler.FunctionTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // LISTS
    //
    String example = "In a dishwasher far far away";
    Functions.replaceTheString(example);

    //
    String url = "https//www.reddit.com/r/nevertellmethebots";
    Functions.correctingUrl(url);

    //
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    Functions.correctQuote(quote);

    //
    String todoText = " - Buy milk";
    Functions.toDoList(todoText);

    //
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    Functions.reverser(reversed);

    System.out.println(" -------------- ");

    //
    List<String> names = new ArrayList<>();

    String charNames = "";
    int whichChar = 0;
    int toRemove = 0;

    Functions.nameAdder(names, "William");
    Functions.nameAdder(names, "John");
    Functions.nameAdder(names, "Amanda");

    System.out.println(names.size());

    Functions.isEmpty(names);
    Functions.printingEach(names);
    Functions.printTheGiven(names,2);
    Functions.printingEachButWithNumbers(names);
    Functions.removeGivenElement(names,1);
    Functions.reverseIterate(names);
    Functions.removeAll(names);

    System.out.println(" -------------- ");

    //MAPS
    HashMap<Integer, String> map = new HashMap<>();
    int key = 0;
    String values = "";
    int keyToAdd = 0;
    String valueToAdd = "";
    int printKey = 0;
    int removeKey = 0;
    int isThereAValue = 0;

    Functions.isHashMapEmpty(map);
    Functions.addElementsToTheMap(map,97,"a");
    Functions.addElementsToTheMap(map,98,"b");
    Functions.addElementsToTheMap(map,99,"c");
    Functions.addElementsToTheMap(map,65,"A");
    Functions.addElementsToTheMap(map,66,"B");
    Functions.addElementsToTheMap(map,67,"C");

    Functions.printAllKeys(map);
    Functions.printAllValues(map);
    Functions.addKeysAndValues(map,68, "D");
    Functions.howManyPairs(map);
    Functions.printASpecificValue(map,99);
    Functions.removeASpecificKeyValuePair(map,97);
    Functions.isThereAValue(map,100);
    Functions.removeAllPair(map);

    System.out.println(" -------------- ");

    // LIST2
    //
    String fruits = "";


    List <String> listA = new ArrayList<>();
    Functions.addingFruits(listA,"Apple");
    Functions.addingFruits(listA,"Avocado");
    Functions.addingFruits(listA,"Blueberries");
    Functions.addingFruits(listA,"Durian");
    Functions.addingFruits(listA,"Lychee");

    List <String> listB = listA;
    Functions.contains(listA,"Durian");

    System.out.println(" -------------- ");

    //TELEPHONE
    //
    String myMapKeys = "";
    String myMapValues = "";
    HashMap<String, String> myMap = new HashMap<>();
    Functions.addToMyHashmap(myMap,"William A. Lathan", "405-709-1865");
    Functions.addToMyHashmap(myMap,"John K. Miller", "402-247-8568");
    Functions.addToMyHashmap(myMap,"Hortensia E. Foster", "606-481-6467");
    Functions.addToMyHashmap(myMap,"Amanda D. Newland", "319-243-5613");
    Functions.addToMyHashmap(myMap,"Brooke P. Askew", "307-687-2982");
    Functions.whatIsTheNumber(myMap,"John K. Miller");
    Functions.whoIsTheOwnerr(myMap,"307-687-2982");
    Functions.isThereANumber(myMap);

    System.out.println(" -------------- ");
  }


}
